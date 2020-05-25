package com.salesandstock.entity;

import java.util.Date;

public class Urunler {
	
	private int id;
	private String adi;
	private int kategoriId;
	private Date tarih;
	private float urunFiyat;
	
	
	public float getUrunFiyat() {
		return urunFiyat;
	}
	public void setUrunFiyat(float urunFiyat) {
		this.urunFiyat = urunFiyat;
	}
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
	public int getKategoriId() {
		return kategoriId;
	}
	public void setKategoriId(int kategoriId) {
		this.kategoriId = kategoriId;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	
	@Override
	public String toString() {
		return "Urunler [id=" + id + ", adi=" + adi + ", kategoriId=" + kategoriId + ", tarih=" + tarih + ", urunFiyat="
				+ urunFiyat + "]";
	}
	
	
	
	

}
