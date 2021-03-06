package com.doggy.memo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MemoAdapter2 extends ArrayAdapter<Memo> {

    private LayoutInflater layoutinflater;

    MemoAdapter2(Context context, int textViewResourceId, List<Memo> objects) {
        super(context, textViewResourceId, objects);
        layoutinflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Memo memo = getItem(position);

        if (convertView == null) {
            convertView = layoutinflater.inflate(R.layout.layout_item_memo2, null);
        }

        TextView titleText = (TextView) convertView.findViewById(R.id.titleText);

        titleText.setText(memo.title);

        return convertView;
    }
}
