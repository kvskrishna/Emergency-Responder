package com.example.emergencyresponder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FirstAid extends Activity {

	ListView lv;
	String[] name = {"Sunstroke","Snakebite","Bone Fracture","Cut","Burn","Nose Bleed","Splinter","Eye Troma","Sting","Allergy","Asthama","Bruises","Blisters","Choking","Heart Attack","Dizziness","Ear pain","Drowning","Food Poisioning","Frost Bite"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_aid);
		lv = (ListView) findViewById(R.id.listView1);
		lv.setAdapter(new ArrayAdapter<String>(FirstAid.this,android.R.layout.simple_list_item_1,name));
		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2==0)
				{
					Intent act3 = new Intent(arg1.getContext(),Sunstroke.class);
			        startActivity(act3);
				}
				if(arg2==1)
				{
					Intent act3 = new Intent(arg1.getContext(),Snakebite.class);
			        startActivity(act3);
				}
				if(arg2==2)
				{
					Intent act3 = new Intent(arg1.getContext(),BoneFracture.class);
			        startActivity(act3);
				}
				if(arg2==3)
				{
					Intent act3 = new Intent(arg1.getContext(),Cut.class);
			        startActivity(act3);
				}
				if(arg2==4)
				{
					Intent act3 = new Intent(arg1.getContext(),Burn.class);
			        startActivity(act3);
				}
				if(arg2==5)
				{
					Intent act3 = new Intent(arg1.getContext(),NoseBleed.class);
			        startActivity(act3);
				}
				if(arg2==6)
				{
					Intent act3 = new Intent(arg1.getContext(),Splinter.class);
			        startActivity(act3);
				}
				if(arg2==7)
				{
					Intent act3 = new Intent(arg1.getContext(),EyeTrauma.class);
			        startActivity(act3);
				}
				if(arg2==8)
				{
					Intent act3 = new Intent(arg1.getContext(),Sting.class);
			        startActivity(act3);
				}
				if(arg2==9)
				{
					Intent act3 = new Intent(arg1.getContext(),Allergy.class);
			        startActivity(act3);
				}
				if(arg2==10)
				{
					Intent act3 = new Intent(arg1.getContext(),Asthama.class);
			        startActivity(act3);
				}
				if(arg2==11)
				{
					Intent act3 = new Intent(arg1.getContext(),Bruises.class);
			        startActivity(act3);
				}
				if(arg2==12)
				{
					Intent act3 = new Intent(arg1.getContext(),Blisters.class);
			        startActivity(act3);
				}
				if(arg2==13)
				{
					Intent act3 = new Intent(arg1.getContext(),Choking.class);
			        startActivity(act3);
				}
				if(arg2==14)
				{
					Intent act3 = new Intent(arg1.getContext(),HeartAttack.class);
			        startActivity(act3);
				}
				if(arg2==15)
				{
					Intent act3 = new Intent(arg1.getContext(),Dizziness.class);
			        startActivity(act3);
				}
				if(arg2==16)
				{
					Intent act3 = new Intent(arg1.getContext(),EarPain.class);
			        startActivity(act3);
				}
				if(arg2==17)
				{
					Intent act3 = new Intent(arg1.getContext(),Drowning.class);
			        startActivity(act3);
				}
				if(arg2==18)
				{
					Intent act3 = new Intent(arg1.getContext(),FoodP.class);
			        startActivity(act3);
				}
				if(arg2==19)
				{
					Intent act3 = new Intent(arg1.getContext(),ForstB.class);
			        startActivity(act3);
				}
				
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first_aid, menu);
		return true;
	}

}
