package com.example.hackmit;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

import com.parse.Parse;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseUser;

public class LoginPage extends Activity{
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_page);
		Parse.initialize(this, "ZF3tzb2RBU4J5PYLlVxgnlMGHa3SWkRAoI6Y2OAN", "34XmgZk4QgkOPqdStKzn3tNHQyNWoW5AeeEighYP");
		//Is current user an anonymous user or not?
		/*if (ParseAnonymousUtils.isLinked(ParseUser.getCurrentUser())){
			// If user is anonymous, make them sign up at the LoginSignup.class
			Intent intent = new Intent(LoginPage.this, LoginSignup.class);
			startActivity(intent);
			finish();
		}else{*/
			// If current user is not an anonymous user
			ParseUser currentUser = ParseUser.getCurrentUser();
			if (currentUser != null){
				// Send the logged in user to the MainActivity.class
				Intent intent = new Intent(LoginPage.this, MainActivity.class);
				startActivity(intent);
				finish();
			}else{
				// Send user to sign up page at LoginSignup.class
				Intent intent = new Intent(LoginPage.this, LoginSignup.class);
				startActivity(intent);
				finish();
			}
		//}
	}
}
