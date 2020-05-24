package com.yedam.generic;

//public class Container<T> {
//	private T t;
//	
//	public void set(T t) {
//		this.t = t;
//	}
//	
//	public T get() {
//		return t;
//	}
//}

public class Container<K, V> {
	private K key;
	private V value;
	
	public void set(K k, V v) {
		this.key = k;
		this.value = v;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}