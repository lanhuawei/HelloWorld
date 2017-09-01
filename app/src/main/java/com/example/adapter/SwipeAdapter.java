package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.example.helloworld.R;
import com.example.view.SwipeItemLayout;

public class SwipeAdapter extends BaseAdapter {
	private Context mContext = null;
	
	public SwipeAdapter(Context context) {
		this.mContext = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View contentView, ViewGroup arg2) {
		ViewHolder holder = null;
		if(contentView==null){
			holder = new ViewHolder();
			View view01 = LayoutInflater.from(mContext).inflate(R.layout.test01, null);
			View view02 = LayoutInflater.from(mContext).inflate(R.layout.test2, null);
//			holder.btn = (Button)view02.findViewById(R.id.btn);
			contentView = new SwipeItemLayout(view01, view02, null, null);
			contentView.setTag(holder);
		}else{
			holder = (ViewHolder) contentView.getTag();
		}
		
//		holder.btn.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View arg0) {
//				// TODO Auto-generated method stub
//				Toast.makeText(mContext, "click", Toast.LENGTH_LONG).show();
//			}
//		});
		return contentView;
	}
	
	class ViewHolder{
		Button btn = null;
	}
}
