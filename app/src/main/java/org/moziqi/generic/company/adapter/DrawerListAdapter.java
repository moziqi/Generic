package org.moziqi.generic.company.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.moziqi.generic.R;
import org.moziqi.generic.company.entity.DrawerListItem;

import java.util.List;

/**
 * Created by moziqi on 2015/2/21 0021.
 */
public class DrawerListAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<DrawerListItem> mItems;

    public DrawerListAdapter(Context context, List<DrawerListItem> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mItems = data;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public DrawerListItem getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DrawerListItem item = getItem(position);
        TextView itemTitle = null;
        ImageView itemIcon = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item_drawer, null);
        }
        itemTitle = (TextView) convertView.findViewById(R.id.item_title);
        itemIcon = (ImageView) convertView.findViewById(R.id.item_icon);
        itemTitle.setText(item.getTitle());
        itemIcon.setImageDrawable(item.getIcon());
        return convertView;
    }
}