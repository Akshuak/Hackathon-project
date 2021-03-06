package com.example.logo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import static com.example.logo.R.*;

public class MyAdater extends BaseExpandableListAdapter {

    Context context;
    List<String> listCroup;
    HashMap<String,List<String>> listItem;

    public MyAdater(Context context,List<String> listCroup, HashMap<String,List<String>>
                    listItem){
        this.context = context;
        this.listCroup = listCroup;
        this.listItem = listItem;
    }

    @Override
    public int getGroupCount() {
        return listCroup.size();
    }

    @Override
    public int getChildrenCount( int groupPosition ) {
        return this.listItem.get(this.listCroup.get(groupPosition)).size();
    }

    @Override
    public Object getGroup( int groupPosition ) {
        return this.listCroup.get(groupPosition);
    }

    @Override
    public Object getChild( int groupPosition, int childPosition ) {
        return this.listItem.get(this.listCroup.get(groupPosition))
                .get(childPosition);
    }

    @Override
    public long getGroupId( int groupPosition ) {
        return groupPosition;
    }

    @Override
    public long getChildId( int groupPosition, int childPosition ) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView( int groupPosition, boolean isExpanded, View convertView, ViewGroup parent ) {
        String group = (String) getGroup(groupPosition);
        if(convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(layout.list_group, null);

        }
        TextView textView=convertView.findViewById(R.id.list_parent);
        textView.setText(group);
        return convertView;
    }

    @Override
    public View getChildView( int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent ) {
        String child =(String) getChild(groupPosition,childPosition);
        if(convertView==null){
            LayoutInflater layoutInflater  =(LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_item, null);
        }
        TextView textView = convertView.findViewById(id.list_child);
        textView.setText(child);
        return convertView;
    }

    @Override
    public boolean isChildSelectable( int groupPosition, int childPosition ) {
        return false;
    }
}
