package com.yoyk.bankbuddy;

import android.app.Application;
import android.database.Cursor;
import android.util.Log;

import com.yoyk.bankbuddy.Database.Database.DatabaseConstants;
import com.yoyk.bankbuddy.model.BankList_Model;
import com.yoyk.bankbuddy.model.Fragment_Model;

import java.util.ArrayList;
import java.util.Arrays;

public class MyApplication extends Application {
	private static final String TAG = MyApplication.class.getSimpleName(); 
	private static SQLiteHelper _dbHelper;

	@Override
	public void onCreate() {
		super.onCreate();
		Log.d(TAG, "onCreate my app");
	    _dbHelper = new SQLiteHelper(this);
	}
	public static BankList_Model[] getBankList()
	{
		BankList_Model[] list=new BankList_Model[]{
				new BankList_Model("1","SBI","adf","asdf","sdf","dfd"),
				new BankList_Model("2","ICICI","adf","asdf","sdf","dfd"),
				new BankList_Model("3","HDFC","adf","asdf","sdf","dfd")
		};
		Object[] oarray=_dbHelper.getAllBanks().toArray();
		list=Arrays.copyOf(oarray,oarray.length,BankList_Model[].class);
		return list;
		//return list;
	}
	public static BankList_Model[] getOtherBankList()
	{
		BankList_Model[] list=new BankList_Model[]{
				new BankList_Model("1","IOB","adf","asdf","sdf","dfd"),
				new BankList_Model("2","CITI","adf","asdf","sdf","dfd"),
				new BankList_Model("3","KOTAK","adf","asdf","sdf","dfd")
		};
		return list;
	}
	private static Fragment_Model getMyBanks()
	{
		//Fragment_Model model=new Fragment_Model("My Banks",getBankList());
		Object[] oarray=_dbHelper.getAllBanks().toArray();
		Fragment_Model model=new Fragment_Model("My Banks", Arrays.copyOf(oarray,oarray.length,BankList_Model[].class) );
		return model;
	}

	public static Fragment_Model getModel(String tag)
	{
		Fragment_Model model;
		if(tag.equals("mybank"))
		{
			model=getMyBanks();
		}
		else
		{
			model=getOtherBanks();
		}
		return model;
	}
	public static String getBankName(String id)
	{
		return "amoeba";
	}
	private static Fragment_Model getOtherBanks()
	{
		Fragment_Model model=new Fragment_Model("Other Banks",getOtherBankList());
		return model;
	}
	public SQLiteHelper getDbHelper() {
		return _dbHelper;
	}	
}
