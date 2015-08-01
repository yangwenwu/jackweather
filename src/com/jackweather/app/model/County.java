package com.jackweather.app.model;

public class County {

	private String countyName ;
	private String countyCode ;
	private int countyId ;
	
	public void setCountyName ( String countyName){
		
		this.countyName = countyName;
	}
	
	public String getCountyName(){
		
		return countyName;
	}
	
	public void setCountyCode (String countyCode){
		
		this.countyCode = countyCode ;
	}
	
	public String getCountyCode (){
		
		return countyCode ;
	}
	
	public void setCountyId (int countyId){
		
		this.countyId = countyId;
	}
	
	public int getCountyId (){
		
		return countyId ;
	}
}
