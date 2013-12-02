package com.example.nbatrivia;

import com.example.nbatrivia.R;
import com.example.nbatrivia.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsP6 extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.questions_p6);
	final RadioButton one = (RadioButton) findViewById(R.id.radio0);
	final RadioButton two = (RadioButton) findViewById(R.id.radio1);
	final RadioButton three = (RadioButton) findViewById(R.id.radio2); 
	final RadioButton four = (RadioButton) findViewById(R.id.radio3); // Correct this page.
	final TextView result = (TextView) findViewById(R.id.txtResult);
	Button confirm = (Button) findViewById(R.id.button1);
		confirm.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			if(one.isChecked()){
					result.setText("Incorrect. 4 is correct."); }
	    	else if(two.isChecked()) {
	    			result.setText("Incorrect. 4 is correct."); }
	    	else if(three.isChecked()) {
	    			result.setText("Incorrect. 4 is correct."); }
	    	else if (four.isChecked()) {
	    			result.setText("Correct! For 23 years."); }
	    			}
	    		});
	    	

			
	Button nextPg = (Button) findViewById(R.id.button2);
		nextPg.setOnClickListener(new OnClickListener() {
	
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent(QuestionsP6.this, QuestionsP7.class));
			}
		}); 
	}	
}