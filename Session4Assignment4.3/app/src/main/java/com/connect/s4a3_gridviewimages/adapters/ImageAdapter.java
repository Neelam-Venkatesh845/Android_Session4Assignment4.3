package com.connect.s4a3_gridviewimages.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.connect.s4a3_gridviewimages.R;

/**
 * Created by win7 on 29-09-2016.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.onegingerbread, R.drawable.twohoneycomb,
            R.drawable.threeicecream, R.drawable.fourjellybean,
            R.drawable.fivekitkat, R.drawable.sixlollypop

    };

    //CONSTRUCTOR
    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setPadding(10,10,10,10);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(260, 290));
        return imageView;

    }
}
