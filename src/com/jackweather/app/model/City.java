package com.jackweather.app.model;

public class City {

	private String cityName ;
	private String cityCode ;
	private int cityId;
	
	public void setCityName( String cityName){
		this.cityName = cityName;
	}
	
	public String getCityName(){
	
		return cityName;
	}
	
	public void setCityCode (String  cityCode){
		this.cityCode = cityCode;
	}
	
	public String getCityCode (){
		
		return cityCode ;
	}
	
	public void setCityId ( int cityId){
		
		this.cityId = cityId;
	}
	
	public int getCityId (){
		
		return cityId ;
	}
}
