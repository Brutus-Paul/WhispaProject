package com.kibi.whispa;


import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Resources resources = getResources();
		TabHost tabhost = getTabHost();
		
		
		Intent chat_intent = new Intent(this, ViewFriendsActivity.class);
		
		Intent contacts_intent = new Intent(this, AddFriendActivity.class);
	
		
		
		TabSpec chat_tab = tabhost.newTabSpec("Contacts").setIndicator("", resources.getDrawable(R.drawable.ic_action_person)).setContent(chat_intent);
		TabSpec  add_friends = tabhost.newTabSpec("Add contact").setIndicator("", resources.getDrawable(R.drawable.ic_action_add_person_dark)).setContent(contacts_intent);
		

		tabhost.addTab(chat_tab);
		tabhost.addTab(add_friends);

	}

	

}
