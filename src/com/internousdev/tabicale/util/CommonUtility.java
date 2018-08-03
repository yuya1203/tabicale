package com.internousdev.tabicale.util;

public class CommonUtility {

	//ランダムな数字を作成します
	public String getRamdomValue(){
		String value="";
		double d;
		for(int i=1;i<=16;i++){
			d = Math.random() * 10;
			value=value+((int)d);
		}
		return value;
	}

	//配列をカンマ区切りで分割します
	public String[] parseArrayList(String s){
		return s.split(", ",0);
	}
}
