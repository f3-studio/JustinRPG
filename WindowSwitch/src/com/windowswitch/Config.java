package com.windowswitch;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Config extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.config);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void button1_Click(View view)
	{
		Intent intent = new Intent();
		intent.setClass(Config.this, Sur1.class);
		startActivity(intent);
	}
	public void button2_Click(View view)
	{
		Intent intent = new Intent();
		intent.setClass(Config.this, Sur2.class);
		startActivity(intent);
	}
	public void button3_Click(View view)
	{
		Intent intent = new Intent();
		intent.setClass(Config.this, Sur3.class);
		startActivity(intent);
	}
	public void button4_Click(View view)
	{
		Intent intent = new Intent();
		intent.setClass(Config.this, Sur4.class);
		startActivity(intent);
	}
	public void button5_Click(View view)
	{
		Intent intent = new Intent();
		intent.setClass(Config.this, Sur5.class);
		startActivity(intent);
	}
	public void button6_Click(View view)
	{
		Intent intent = new Intent();
		intent.setClass(Config.this, Sur6.class);
		startActivity(intent);
	}
}
