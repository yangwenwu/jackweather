package com.jackweather.app.db;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.jackweather.app.model.City;
import com.jackweather.app.model.County;
import com.jackweather.app.model.Province;


/**
 * �����������ݲ��� �������  �����ݿ���ȡ����
 * 
 *
 */
public class MyWeatherDB {
	//���ݿ���
	public static final String DB_NAME = "jack_weather";
	//���ݿ�汾
	public static final int DB_VERSION = 1;
	
	private static  MyWeatherDB myWeatherDB ;
	
	private SQLiteDatabase  db ;
	
	private MyWeatherDB (Context  context){
		MyWeatherDBHelper mDBHelper = new MyWeatherDBHelper(context, DB_NAME, null, DB_VERSION);
		db = mDBHelper.getWritableDatabase();
	}
	//��ȡMyWeatherDB��ʵ��
	public synchronized static MyWeatherDB getInstance (Context context){
		
		if (myWeatherDB == null) {
			myWeatherDB = new MyWeatherDB(context);
		}
		return myWeatherDB;
		
	}
	
	//��ʡprovince��ӵ����ݿ�
	
	public void addProvince (Province province){
		
		if (province  != null) {
			ContentValues contentValues = new ContentValues();
			contentValues.put("provinceName", province.getProvinceName());
			contentValues.put("provinceCode", province.getProvinceCode());
			db.insert("province", null, contentValues);
		}
	}
	
	//������ʡprovince�����ݿ��ж�ȡ����
	public List<Province> loadProvinces(){
		List<Province> list = new ArrayList<Province>();
		Cursor cursor = db.query("Province", null, null, null, null, null, null);
		if (cursor.moveToFirst()) {
			do {
				Province province = new Province();
				province.setId(cursor.getInt(cursor.getColumnIndex("id")));
				province.setProvinceName(cursor.getString(cursor.getColumnIndex("provinceName")));
				province.setProvinceCode(cursor.getInt(cursor.getColumnIndex("provinceCode")));
				list.add(province);
				
			} while (cursor.moveToNext());
		}
		if (cursor != null) {
			cursor.close();
		}
		return list;
	}
	
	//��city���浽���ݿ�
	public void addCity(City city){
		if (city != null ) {
			ContentValues contentValues = new ContentValues();
			contentValues.put("cityId", city.getCityId());
			contentValues.put("cityName", city.getCityName());
			contentValues.put("cityCode", city.getCityCode());
			db.insert("City", null, contentValues);
		}
		
		
 	}
	//������City�����ݿ���ȡ����
	public List<City> loadCity(){
		List<City> list = new ArrayList<City>();
		Cursor cursor = db.query("City", null, null, null, null, null, null);
		
		if (cursor.moveToFirst()) {
			do {
				City city = new City();
				city.setCityId(cursor.getInt(cursor.getColumnIndex("cityId")));
				city.setCityName(cursor.getString(cursor.getColumnIndex("cityName")));
				city.setCityCode(cursor.getString(cursor.getColumnIndex("cityCode")));
				list.add(city);
				
			} while (cursor.moveToNext());
		}
		
		if (cursor != null) {
			cursor.close();
		}
		
		return list;
	}
	
	//��county���浽���ݿ�
	public void  addCounty(County county){
		if (county !=  null) {
			ContentValues contentValues = new ContentValues();
			contentValues.put("countyId", county.getCountyId());
			contentValues.put("countyName", county.getCountyName());
			contentValues.put("countyCode", county.getCountyCode());
			db.insert("County", null, contentValues);
		}
	}
	
	//�����ݿ��е�countyȫ��ȡ����
	public List<County> getCounty(){
		List<County> list = new ArrayList<County>();
		Cursor cursor = db.query("County", null, null, null, null, null, null);
		if (cursor.moveToFirst()) {
			do {
				County county = new County();
				county.setCountyId(cursor.getInt(cursor.getColumnIndex("CountyId")));
				county.setCountyName(cursor.getString(cursor.getColumnIndex("CountyName")));
				county.setCountyCode(cursor.getString(cursor.getColumnIndex("CountyCode")));
			} while (cursor.moveToNext());
		}
		
		if (cursor != null) {
			cursor.close();
		}
		
		return list;
	}
	
}
