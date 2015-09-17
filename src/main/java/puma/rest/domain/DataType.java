package puma.rest.domain;

public enum DataType {
	STRING(0), 
	INTEGER(1), 
	DATETIME(2), 
	BOOLEAN(3), 
	DOUBLE(4);

	private final int value;

	private DataType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
