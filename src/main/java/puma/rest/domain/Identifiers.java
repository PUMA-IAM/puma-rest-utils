package puma.rest.domain;

import java.util.List;

public class Identifiers {

	private List<String> ids;

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public Identifiers(List<String> ids) {
		this.ids = ids;
	}
	
	public Identifiers() {
		
	}
	
}
