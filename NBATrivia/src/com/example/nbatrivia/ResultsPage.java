package com.example.nbatrivia;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ResultsPage extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.results_page);
		
		Button nba = (Button) findViewById(R.id.button1);
		nba.setOnClickListener(new OnClickListener() {
	
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent (Intent.ACTION_VIEW,  Uri.parse("http://nba.com/")));
			}
		}); 
		
		Button espn = (Button) findViewById(R.id.button2);
		espn.setOnClickListener(new OnClickListener() {
	
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent (Intent.ACTION_VIEW,  Uri.parse("http://espn.com/")));
			}
		}); 
	}
}
