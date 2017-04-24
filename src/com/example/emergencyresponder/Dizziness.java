package com.example.emergencyresponder;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Dizziness extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dizziness);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dizziness, menu);
		return true;
	}

}
