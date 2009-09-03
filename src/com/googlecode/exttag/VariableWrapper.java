package com.googlecode.exttag;

public final class VariableWrapper {

	private final Object value;

	public VariableWrapper(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
