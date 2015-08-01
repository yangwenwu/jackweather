package com.jackweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyWeatherDBHelper extends SQLiteOpenHelper {
	private Context mcontext ;
	//	 °
	public static String TABLE_PROVINCE = "creat table Province ("+
	        "id integer primary key autoincrement," +
			"province_name text" +
            "province_code text)";
	
	
	//   –
	public static String TABLE_CITY = "creat table City ("+
	         "id integer primary key autoincrement," + 
			 "city_name text" +
		     "city_code text" +
		     "city_id integer";
	
	//  ’Ú
	public static String TABLE_COUNTY = "creat table County ("+
	         "id integer primary key autoincrement," + 
			 "county_name text" +
			 "county_code text" +
			 "county_id integer";
	

	public MyWeatherDBHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		mcontext = context;
		 
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(TABLE_PROVINCE);
		db.execSQL(TABLE_CITY);
		db.execSQL(TABLE_COUNTY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

	}

}
