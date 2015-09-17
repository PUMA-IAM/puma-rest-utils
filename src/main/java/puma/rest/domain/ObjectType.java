package puma.rest.domain;

public enum ObjectType {
	SUBJECT(0), 
	ACTION(1), 
	RESOURCE(2), 
	ENVIRONMENT(3);

	private final int value;

	private ObjectType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
