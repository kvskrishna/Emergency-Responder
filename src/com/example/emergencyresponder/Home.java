package com.example.emergencyresponder;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;



public class Home extends Activity {
	String uname;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		final Button switchact =(Button)findViewById(R.id.firstaid);
	    switchact.setOnClickListener(new View.OnClickListener() {
	      @Override
	      public void onClick(View view) {
	        Intent act2 = new Intent(view.getContext(),FirstAid.class);
	        startActivity(act2);
	      }
	    });
	    final Button switchact2 =(Button)findViewById(R.id.videocall);
	    switchact2.setOnClickListener(new View.OnClickListener() {
	      @Override
	      public void onClick(View view) {
	    	  Uri skypeUri = Uri.parse("skype:madhukesh.ayyagari94"+"?call&video=true");
	          Intent myIntent = new Intent(Intent.ACTION_VIEW);
	          myIntent.setData(skypeUri);
	          startActivity(myIntent);
	    	}
	     });
	    final Button switchact3 =(Button)findViewById(R.id.call_ambulance);
	    switchact3.setOnClickListener(new View.OnClickListener() {
	    	
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel: 108"));
				startActivity(intent);
				
			}
		});
	    final Button switchact4 = (Button)findViewById(R.id.hospital_search);
	    switchact4.setOnClickListener(new View.OnClickListener() {
	    	
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				String url = "http://maps.google.com/maps?q=hospital&mrt=yp&sll=17.781323,83.376936&output=kml";
				startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url)));
				
			}
		});}
   
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
