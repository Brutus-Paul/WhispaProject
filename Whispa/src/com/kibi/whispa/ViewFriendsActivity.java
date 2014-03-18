package com.kibi.whispa;

import android.app.Activity;
import java.util.ArrayList;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.Toast;

public class ViewFriendsActivity extends ExpandableListActivity implements
		OnChildClickListener {
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	ArrayList<String> child;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ExpandableListView expandbleLis = getExpandableListView();
		expandbleLis.setDividerHeight(2);
		expandbleLis.setGroupIndicator(null);
		expandbleLis.setClickable(true);
		
		

		setGroupData();
		setChildGroupData();

		NewAdapter mNewAdapter = new NewAdapter(groupItem, childItem);
		mNewAdapter
				.setInflater(
						(LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE),
						this);
		getExpandableListView().setAdapter(mNewAdapter);
		expandbleLis.setOnChildClickListener(this);
		
		

	}

	public void setGroupData() 
	{
		if(contacts.size() == 0)
		{
			groupItem.add("Chats");
			//groupItem.add("Groups");	
		}
		else
		{
			groupItem.add("Chats" + "(" + contacts.size() + ")");
		}
		
	}

	ArrayList<String> groupItem = new ArrayList<String>();
	ArrayList<Object> childItem = new ArrayList<Object>();

	public void setChildGroupData() {
	
		
		contacts = new ArrayList<Contact>();
		
		ContactProvider db = new ContactProvider(this);
		
		contacts = db.getAllContacts();
		
	
		
	
		ArrayList<String> names = new ArrayList<String>();
		
		/**
		 * Add Data For Chats
		 */
		child = new ArrayList<String>();
		for(Contact x : contacts)
		{
			child.add(x.name());
		
		}
		childItem.add(child);


	}
	//our child listener
	
	@Override
	  public boolean onChildClick(ExpandableListView parent, View v,
	    int groupPosition, int childPosition, long id) {
	    
	   //get the child info
		//Object s = childItem.get(childPosition);
		Intent type = new Intent(ViewFriendsActivity.this, typeMessageActivity.class);
		
		type.putExtra("Client", child.get(childPosition));
		startActivity(type);
	   //display it or do something with it
	  // Toast.makeText(getBaseContext(), "Clicked on Detail " + child.get(childPosition), Toast.LENGTH_LONG).show();
	   return false;
	  }
	


	
	@Override
	protected void onResume()
	{
	
			super.onResume();
			groupItem.clear();
			childItem.clear();
			setGroupData();
			setChildGroupData();
					
	}
	
	
	

	
}