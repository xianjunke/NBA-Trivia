package com.example.nbatrivia;
/* 
 * Code for the counter, cannot get it to work.
 */

import android.app.Application;

public class MyCounter extends Application {
	 public int myState=0;

	 public int getState(){
	    return myState;
	  }
	  public void setState(int s){
	    myState = s;
	  }
	  public void countOnce(int i) {
		 myState += i;
	  }
	}



/*MyCounter Blah = ((MyCounter)getApplicationContext());
int state = counterState.getState();
counterState.setState(1);                                        Counter code
int counter = 1;
Blah.countOnce(counter); */

