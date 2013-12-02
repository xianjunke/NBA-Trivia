package com.example.nbatrivia;

import com.example.nbatrivia.MainActivity;
import com.example.nbatrivia.QuestionsP1;
import com.example.nbatrivia.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button a = (Button) findViewById(R.id.button1);
		a.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this, QuestionsP1.class));
			}
		});
	}
}