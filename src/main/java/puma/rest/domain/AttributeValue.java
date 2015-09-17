package puma.rest.domain;

import java.util.ArrayList;
import java.util.List;

public class AttributeValue {

	private DataType dataType; // required
	private ObjectType objectType; // required
	private Multiplicity multiplicity; // required
	private String id; // required
	private List<String> stringValues; // optional
	private List<Integer> intValues; // optional
	private List<Long> datetimeValues; // optional
	private List<Boolean> booleanValues; // optional
	private List<Double> doubleValues; // optional

	public AttributeValue() {
	}

	public AttributeValue(DataType dataType, ObjectType objectType,
			Multiplicity multiplicity, String id) {
		this();
		this.dataType = dataType;
		this.objectType = objectType;
		this.multiplicity = multiplicity;
		this.id = id;
	}

	public DataType getDataType() {
		return dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}

	public ObjectType getObjectType() {
		return objectType;
	}

	public void setObjectType(ObjectType objectType) {
		this.objectType = objectType;
	}

	public Multiplicity getMultiplicity() {
		return multiplicity;
	}

	public void setMultiplicity(Multiplicity multiplicity) {
		this.multiplicity = multiplicity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getStringValues() {
		return stringValues;
	}

	public void setStringValues(List<String> stringValues) {
		this.stringValues = stringValues;
	}
	
	public void addToStringValues(String value) {
		if(this.stringValues == null)
			this.stringValues = new ArrayList<String>();
		this.stringValues.add(value);
	}

	public List<Integer> getIntValues() {
		return intValues;
	}

	public void setIntValues(List<Integer> intValues) {
		this.intValues = intValues;
	}
	
	public void addToIntValues(int value) {
		if(this.intValues == null)
			this.intValues = new ArrayList<Integer>();
		this.intValues.add(value);
	}

	public List<Long> getDatetimeValues() {
		return datetimeValues;
	}

	public void setDatetimeValues(List<Long> datetimeValues) {
		this.datetimeValues = datetimeValues;
	}
	
	public void addToDatetimeValues(long value) {
		if(this.datetimeValues == null)
			this.datetimeValues = new ArrayList<Long>();
		this.datetimeValues.add(value);
	}

	public List<Boolean> getBooleanValues() {
		return booleanValues;
	}

	public void setBooleanValues(List<Boolean> booleanValues) {
		this.booleanValues = booleanValues;
	}
	
	public void addToBooleanValues(boolean value) {
		if(this.booleanValues == null)
			this.booleanValues = new ArrayList<Boolean>();
		this.booleanValues.add(value);
	}

	public List<Double> getDoubleValues() {
		return doubleValues;
	}

	public void setDoubleValues(List<Double> doubleValues) {
		this.doubleValues = doubleValues;
	}
	
	public void addToDoubleValues(double value) {
		if(this.doubleValues == null)
			this.doubleValues = new ArrayList<Double>();
		this.doubleValues.add(value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((booleanValues == null) ? 0 : booleanValues.hashCode());
		result = prime * result
				+ ((dataType == null) ? 0 : dataType.hashCode());
		result = prime * result
				+ ((datetimeValues == null) ? 0 : datetimeValues.hashCode());
		result = prime * result
				+ ((doubleValues == null) ? 0 : doubleValues.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((intValues == null) ? 0 : intValues.hashCode());
		result = prime * result
				+ ((multiplicity == null) ? 0 : multiplicity.hashCode());
		result = prime * result
				+ ((objectType == null) ? 0 : objectType.hashCode());
		result = prime * result
				+ ((stringValues == null) ? 0 : stringValues.hashCode());
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
		AttributeValue other = (AttributeValue) obj;
		if (booleanValues == null) {
			if (other.booleanValues != null)
				return false;
		} else if (!booleanValues.equals(other.booleanValues))
			return false;
		if (dataType != other.dataType)
			return false;
		if (datetimeValues == null) {
			if (other.datetimeValues != null)
				return false;
		} else if (!datetimeValues.equals(other.datetimeValues))
			return false;
		if (doubleValues == null) {
			if (other.doubleValues != null)
				return false;
		} else if (!doubleValues.equals(other.doubleValues))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (intValues == null) {
			if (other.intValues != null)
				return false;
		} else if (!intValues.equals(other.intValues))
			return false;
		if (multiplicity != other.multiplicity)
			return false;
		if (objectType != other.objectType)
			return false;
		if (stringValues == null) {
			if (other.stringValues != null)
				return false;
		} else if (!stringValues.equals(other.stringValues))
			return false;
		return true;
	}

}