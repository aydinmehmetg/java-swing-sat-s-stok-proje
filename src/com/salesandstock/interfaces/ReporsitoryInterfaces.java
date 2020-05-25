package com.salesandstock.interfaces;

import java.util.List;

public interface ReporsitoryInterfaces<T> {
	
	public void Insert(T entity);
	public List<T> GetAll();
	public T Delete(T entity);
	public void Update(T entity);
	public List<T> GetById(int id);
	
}
