package puma.rest.domain;

public enum ResponseType {
	PERMIT(0), 
	DENY(1), 
	NOT_APPLICABLE(2), 
	INDETERMINATE(3);

	private final int value;

	private ResponseType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
