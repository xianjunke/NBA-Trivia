package com.example.nbatrivia;

import com.example.nbatrivia.R;
import com.example.nbatrivia.MainActivity;
import com.example.nbatrivia.QuestionsP1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsP2 extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.questions_p2);
	final RadioButton one = (RadioButton) findViewById(R.id.radio0);
	final RadioButton two = (RadioButton) findViewById(R.id.radio1); // Correct this page.
	final RadioButton three = (RadioButton) findViewById(R.id.radio2); 
	final RadioButton four = (RadioButton) findViewById(R.id.radio3);
	final TextView result = (TextView) findViewById(R.id.txtResult);
	Button confirm = (Button) findViewById(R.id.button1);
		confirm.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {

			if(one.isChecked()){
					result.setText("Correct answer is 2. John was 6'1."); }
	    	else if(two.isChecked()) {
	    			result.setText("Yup, he was 5'3, 136lbs. Good job."); }
	    	else if(three.isChecked()) {
	    			result.setText("Correct answer is 2. Spud was 5'7."); }
	    	else if (four.isChecked()) {
	    			result.setText("Correct answer is 2. Earl was 5'5.");  }
						}
	    		});
		
		
			
	Button nextPg = (Button) findViewById(R.id.button2);
		nextPg.setOnClickListener(new OnClickListener() {
	
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent(QuestionsP2.this, QuestionsP3.class));
			}
		}); 
	}	
}
	