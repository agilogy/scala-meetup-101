package com.meetup.java;

import java.util.Collections;
import java.util.List;

public class Purchase {

	private final List<Item> _items;

	public Purchase(List<Item> items) {
		super();
		_items = items;
	}

	public List<Item> getItems() {
		return Collections.unmodifiableList(_items);
	}

	@Override
	public String toString() {
		return "Purchase [_items=" + _items + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_items == null) ? 0 : _items.hashCode());
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
		Purchase other = (Purchase) obj;
		if (_items == null) {
			if (other._items != null)
				return false;
		} else if (!_items.equals(other._items))
			return false;
		return true;
	}

}
