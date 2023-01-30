package com.himani.niet.spring;

public class Address {
	private String houseNumber;
	private String address2;
	private String cityName;
	private String country;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String houseNumber, String address2, String cityName, String country) {
		super();
		this.houseNumber = houseNumber;
		this.address2 = address2;
		this.cityName = cityName;
		this.country = country;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", address2=" + address2 + ", cityName=" + cityName
				+ ", country=" + country + "]";
	}
	
}
