package com.yidong.mypintu;

import android.content.Context;
import android.widget.Toast;

public class Utils {
	
	public static void showToast(Context context,String s){
		Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
	}
	
	public static boolean isStringEmpty(String s){
		if(s==null || s.length()==0){
			return true;
		}else{
			return false;
		}
	}
}
