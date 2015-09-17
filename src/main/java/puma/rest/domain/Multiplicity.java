package puma.rest.domain;

public enum Multiplicity {
	GROUPED(0), 
	ATOMIC(1);

	private final int value;

	private Multiplicity(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
