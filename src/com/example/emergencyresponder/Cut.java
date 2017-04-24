package com.example.emergencyresponder;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Cut extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cut);
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cut, menu);
		return true;
	}

}
