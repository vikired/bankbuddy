package com.yoyk.bankbuddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Viki on 11/3/2016.
 */

public class BankCard extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bank_card);
        Intent intent = getIntent();
        String message= intent.getStringExtra(MyBankFragment.EXTRA_MESSAGE);
        TextView textView=(TextView) findViewById(R.id.bankbar);
        textView.setText(MyApplication.getBankName(message)+message);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
