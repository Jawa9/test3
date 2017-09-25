package com.learn.neko.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Neko on 22.09.2017.
 */

public class NextActivity extends AppCompatActivity {

    private TextView txtName;
    private TextView txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_test1);

        txtName = (TextView) findViewById(R.id.txtName);
        txtPass = (TextView) findViewById(R.id.txtPass);

        txtName.setText(getIntent().getStringExtra("name"));
        txtPass.setText(getIntent().getStringExtra("pass"));
    }
    public void onMain(View v){

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
