package com.yoyk.bankbuddy;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yoyk.bankbuddy.model.BankList_Model;

/**
 * Created by Viki on 10/26/2016.
 */

public class BankListAdaptor extends BaseAdapter{

    public BankListAdaptor(Context context, BankList_Model[] bankList_models)
    {
        mBankList_models=bankList_models;
        mContext=context;
    }
    private Context mContext;
    private BankList_Model[] mBankList_models;
    @Override
    public int getCount() {
        return mBankList_models.length;
    }

    @Override
    public Object getItem(int position) {
        return mBankList_models[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.listitemview, parent, false);
       // ViewHolder viewHolder = (ViewHolder) view.getTag();
        //viewHolder.iconView.setImageResource(R.drawable.ic_logo);
        ViewHolder viewHolder = new ViewHolder(view);
        int drawableID = mContext.getResources().getIdentifier("sbi_logo", "drawable", mContext.getPackageName());
        viewHolder.iconView.setImageResource(drawableID);

        viewHolder.nameView.setText(mBankList_models[position].getBank_name());
        view.setTag(viewHolder);

        return view;

    }

    public static class ViewHolder{
        public final ImageView iconView;
        public final TextView nameView;
        public ViewHolder(View view){
            iconView = (ImageView) view.findViewById(R.id.list_item_icon);
            nameView = (TextView) view.findViewById(R.id.list_item_textview);
        }
    }
    private static final int VIEW_TYPE_BANK = 1;

}
