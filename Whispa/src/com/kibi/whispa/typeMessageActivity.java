package com.kibi.whispa;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;

public class typeMessageActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.message_view);
		
		Bundle extras = getIntent().getExtras();
		
		String client = extras.getString("Client");
		
		TextView name_view = (TextView)findViewById(R.id.textView10);
		
		name_view.setText(client);
		
		final EditText message = (EditText)findViewById(R.id.editText3);
		
		ImageButton send_button = (ImageButton)findViewById(R.id.imageButton1);
		
		send_button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				String user_message = message.getText().toString();
				Toast.makeText(getBaseContext(), "Message : " + user_message, Toast.LENGTH_LONG).show();
				
			}
			
		});


	}
}
