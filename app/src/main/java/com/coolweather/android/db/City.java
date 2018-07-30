package com.coolweather.android.db;

/**
 * Created by Administrator on 2018/7/30/030.
 */

public class City {
    private int id;
    private String cityName;
    private int cityCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id ;
    }
    public String getcityName(){
        return cityName;
    }
    public void setcityName(String provinceName){
        this.cityName = cityName;
    }
    public int getcityCode(){
        return cityCode;
    }
    public void setcityCode(int provinceCode){
        this.cityCode = cityCode;
    }

}