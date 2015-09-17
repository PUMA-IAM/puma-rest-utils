package puma.rest.client;

import java.net.URI;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import puma.rest.domain.AttributeValue;
import puma.rest.domain.Identifiers;
import puma.rest.domain.Policy;
import puma.rest.domain.Request;
import puma.rest.domain.ResponseType;
import puma.rest.domain.Status;

public class CentralPDPClient {
	
	private final String url;
	private final RestTemplate template;
	
	public CentralPDPClient(String baseUrl, String name) {
		this.url = "http://" + baseUrl + "/pdp/" + name.toLowerCase() + "/";
		this.template = new RestTemplate();
	}

	public ResponseType evaluate(List<AttributeValue> attributes) {
		return template.postForObject(URI.create(url + "evaluate"), new Request(attributes), ResponseType.class);
	}
	
	public String getStatus() {
		return template.getForObject(URI.create(url + "status"), Status.class).getStatus();
	}
	
	public void loadCentralPUMAPolicy(String policy) {
		template.put(URI.create(url + "policy"), new Policy(policy));
	}
	
	public String getCentralPUMAPolicy() {
		return template.getForObject(URI.create(url + "policy"), Policy.class).getPolicy();
	}

	public void loadTenantPolicy(String tenantIdentifier, String policy) {
		template.put(URI.create(url + tenantIdentifier + "/policy"), new Policy(policy));
	}
	
	public List<String> getIdentifiers() {
		return template.getForObject(URI.create(url + "ids"), Identifiers.class).getIds();
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
		CentralPDPClient other = (CentralPDPClient) obj;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	
}
