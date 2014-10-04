package com.example.hackmit;

import android.app.Activity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class LoginPage extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_page);
		
		Parse.initialize(this, "ZF3tzb2RBU4J5PYLlVxgnlMGHa3SWkRAoI6Y2OAN", "34XmgZk4QgkOPqdStKzn3tNHQyNWoW5AeeEighYP");
		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "bar");
		testObject.saveInBackground();
	}

}
