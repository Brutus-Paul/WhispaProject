package com.kibi.whispa;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddFriendActivity extends Activity
{
	public Button add_button;
	public EditText name ;
	public EditText number ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_friend);
		
	
		name = (EditText)findViewById(R.id.editText1);
		number = (EditText)findViewById(R.id.editText2);
		add_button = (Button)findViewById(R.id.button1);
	
		
	}
		
}
