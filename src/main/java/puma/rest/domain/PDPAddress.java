package puma.rest.domain;

public class PDPAddress {

	private String baseUrl;
	private String name;
	
	public String getBaseUrl() {
		return baseUrl;
	}
	
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PDPAddress(String baseUrl, String name) {
		this.baseUrl = baseUrl;
		this.name = name;
	}
	
	public PDPAddress() {
		
	}
	
}
