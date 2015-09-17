package puma.rest.client;

import java.net.URI;

import org.springframework.web.client.RestTemplate;

import puma.rest.domain.PDPAddress;

public class RegistrationClient {

	private final String url;
	private final RestTemplate template;
	
	public RegistrationClient(String url) {
		this.url = url;
		this.template = new RestTemplate();
	}

	public void register(PDPAddress address) {
		template.put(URI.create(url + "register"), address);
	}
	
	public void deregister(PDPAddress address) {
		template.put(URI.create(url + "deregister"), address);
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
		RegistrationClient other = (RegistrationClient) obj;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
}
