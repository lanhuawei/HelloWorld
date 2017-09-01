package com.example.main;

import android.app.Activity;
import android.widget.ListView;

import com.example.adapter.SwipeAdapter;
import com.example.helloworld.R;
import com.example.view.SwipeListView;

public class FragmentTestActivity extends Activity {
	
	private SwipeListView lv = null;
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_test);
		
		lv = (SwipeListView)findViewById(R.id.lv);
		
		SwipeAdapter adapter = new SwipeAdapter(this);
		lv.setAdapter(adapter);
	}
}
