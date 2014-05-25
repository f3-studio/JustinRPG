package com.example.subtitle;

import android.os.Handler;
import android.widget.TextView;

public class Subtitle {
	private Handler handler = new Handler();
	int i = 1 , d = 50;
	TextView tv;
	String str;

	public Subtitle(){
		
	}
	
	public Subtitle(TextView textView,String string) {
		tv = textView;
		str = string;
	}
	
	public Subtitle(TextView textView,String string,int delay) {
		tv = textView;
		str = string;
		d = delay;
	}

	public boolean show() {
		try {
			tv.setText(str.substring(0, 1));
			for (int k = 1; k < str.length(); k++) {
				handler.postDelayed(runnable, d * k);
			}
			i = 1;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void setData(TextView textView,String string) {
		tv = textView;
		str = string;
	}
	
	public void setData(TextView textView,String string,int delay) {
		tv = textView;
		str = string;
		d = delay;
	}
	
	public void setString(String string) {
		str = string;
	}
	
	public void setTextView(TextView textView) {
		tv = textView;
	}

	Runnable runnable = new Runnable() {
		public void run() {
			tv.append(str.substring(i, i + 1));
			i++;
			// handler.postDelayed(runnable, 100);
		}
	};
}
