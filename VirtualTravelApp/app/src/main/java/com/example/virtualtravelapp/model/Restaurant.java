package com.example.virtualtravelapp.model;

public class Restaurant {
	private int id;
	private String name;
	private String image;
	private String latlng;
	private String phone;
	private String detail;
	private int idDiaDanh;

	public Restaurant(){}

	public Restaurant(int id,String name,String image,String latlng,String phone, String detail,int idDiaDanh ){
		this.id = id;
		this.name = name;
		this.image = image;
		this.latlng = latlng;
		this.phone = phone;
		this.detail = detail;
		this.idDiaDanh = idDiaDanh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLatlng() {
		return latlng;
	}

	public void setLatlng(String latlng) {
		this.latlng = latlng;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getIdDiaDanh() {
		return idDiaDanh;
	}

	public void setIdDiaDanh(int idDiaDanh) {
		this.idDiaDanh = idDiaDanh;
	}
}
