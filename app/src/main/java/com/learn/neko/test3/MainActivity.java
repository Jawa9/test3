package com.learn.neko.test3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.txtName);
        pass = (EditText) findViewById(R.id.pass);
    }
    public void onGo(){

//        TextView textSml = (TextView)findViewById(R.id.textSml);
//        textSml.setText("f");
    }
    public void onTestOne(View v){

        Intent intent = new Intent(this,NextActivity.class);
        startActivity(intent);
    }
    public void forText(View v){

        Intent intent = new Intent(this,NextActivity.class);

        intent.putExtra("name",login.getText().toString());
        intent.putExtra("pass",pass.getText().toString());

        startActivity(intent);
    }
}
