package com.salesandstock.entity;

public class Kategori {
	
	private int id;
	private String adi;
	private int parentId;  //bunu kullanmamýzýn amacý kategorileri sonsuz yapma alt alta açýlabilir olmasýný saðlayacak
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	@Override
	public String toString() {
		return "Kategori [id=" + id + ", adi=" + adi + ", parentId=" + parentId + "]";
	}
	
	
	

}
