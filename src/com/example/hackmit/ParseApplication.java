package com.example.hackmit;

import com.parse.Parse;
import com.parse.ParseACL;

import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application{
	@Override
	public void onCreate(){
		super.onCreate();
		
		// Initialization code
		Parse.initialize(this, "ZF3tzb2RBU4J5PYLlVxgnlMGHa3SWkRAoI6Y2OAN", "34XmgZk4QgkOPqdStKzn3tNHQyNWoW5AeeEighYP");
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
		
		// If you would like all objects to be private by default, remove this line
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
	}
}
