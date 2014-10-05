package com.example.hackmit;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
	private TabHost mTabHost;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        mTabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent; 
        
        //Home Tab
        intent = new Intent(this, HomeActivity.class);
        spec = mTabHost.newTabSpec("Home")
        		.setIndicator("Home")
        		.setContent(intent);
        mTabHost.addTab(spec);
        /*
        //Map tab
        intent = new Intent(this, MapActivity.class);
        spec = mTabHost.newTabSpec("Map")
        		.setIndicator("Map")
        		.setContent(intent);
        mTabHost.addTab(spec);
        
        intent = new Intent(this, ListActivity.class);
        spec = mTabHost.newTabSpec("List")
        		.setIndicator("List")
        		.setContent(intent);
        mTabHost.addTab(spec);
        
        intent = new Intent(this, SearchActivity.class);
        spec = mTabHost.newTabSpec("Search")
        		.setIndicator("Search")
        		.setContent(intent);
        mTabHost.addTab(spec);
        */
        mTabHost.setCurrentTab(0);
    }
    
}