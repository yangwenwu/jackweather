package com.jackweather.app.model;

public class Province {
	
private int id ;

private String provinceName ;

private int provinceCode ;

public void setId(int id){
	
	this.id = id;
}

public int getId(){
	
	return id;
}

public String getProvinceName() {
	
	return provinceName;
}
public void setProvinceName(String provinceName) {
	
	this.provinceName = provinceName;
}


public int getProvinceCode() {
	
	return provinceCode;
}
public void setProvinceCode(int provinceCode) {
	
	this.provinceCode = provinceCode;
}

}
