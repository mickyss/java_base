package com.mk.jkb.base05;

public interface Service<T> {
	
	//添加到数据库
	public void add(T t);
	
	//
	public void update(T t);
	
	public void delete(T t);
}
