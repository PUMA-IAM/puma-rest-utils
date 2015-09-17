package puma.rest.domain;

import java.util.List;

public class Request {

	private List<AttributeValue> attributes;

	public List<AttributeValue> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<AttributeValue> attributes) {
		this.attributes = attributes;
	}

	public Request(List<AttributeValue> attributes) {
		this.attributes = attributes;
	}
	
	public Request() {
		
	}
	
}
