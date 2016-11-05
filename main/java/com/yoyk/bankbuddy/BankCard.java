package com.yoyk.bankbuddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yoyk.bankbuddy.model.BankList_Model;

/**
 * Created by Viki on 11/3/2016.
 */

public class BankCard extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bank_card);
        Intent intent = getIntent();
        Bundle b=getIntent().getExtras();
        if(b!=null) {
            BankList_Model myBank=b.getParcelable(MyBankFragment.EXTRA_MESSAGE);
            TextView textView = (TextView) findViewById(R.id.bankbar);
            textView.setText(myBank.getBank_name());
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
