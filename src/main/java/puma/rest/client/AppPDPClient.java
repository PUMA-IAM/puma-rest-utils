package puma.rest.client;

import java.net.URI;

import org.springframework.web.client.RestTemplate;

import puma.rest.domain.Flag;
import puma.rest.domain.Identifier;
import puma.rest.domain.Policy;
import puma.rest.domain.Status;

public class AppPDPClient {
	
	private final String url;
	private final RestTemplate template;
	
	public AppPDPClient(String baseUrl, String name) {
		this.url = "http://" + baseUrl + "/pdp/" + name.toLowerCase() + "/";
		this.template = new RestTemplate();
	}

	public String getId() {
		return template.getForObject(URI.create(url + "id"), Identifier.class).getId();
	}
	
	public String getStatus() {
		return template.getForObject(URI.create(url + "status"), Status.class).getStatus();
	}
	
	public void loadApplicationPolicy(String policy) {
		template.put(URI.create(url + "policy"), new Policy(policy));
	}
	
	public String getApplicationPolicy() {
		return template.getForObject(URI.create(url + "policy"), Policy.class).getPolicy();
	}
	
	public void setRemoteDBAccess(boolean enabled) {
		template.put(URI.create(url + "remoteDBAccess"), new Flag(enabled));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppPDPClient other = (AppPDPClient) obj;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
}
