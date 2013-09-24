package com.meetup.java;

public class Item {

	private final String _productId;
	private final int _rupees;

	public Item(String _productId, int _rupees) {
		super();
		this._productId = _productId;
		this._rupees = _rupees;
	}

	@Override
	public String toString() {
		return "Item [_productId=" + _productId + ", _rupees=" + _rupees + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((_productId == null) ? 0 : _productId.hashCode());
		result = prime * result + _rupees;
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
		Item other = (Item) obj;
		if (_productId == null) {
			if (other._productId != null)
				return false;
		} else if (!_productId.equals(other._productId))
			return false;
		if (_rupees != other._rupees)
			return false;
		return true;
	}

}
