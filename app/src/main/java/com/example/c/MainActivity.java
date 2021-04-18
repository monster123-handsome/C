package com.example.c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    EditText edt1;
    EditText edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.bt1);
        btn.setOnClickListener(this
        );
        edt1=findViewById(R.id.et);
        edt2=findViewById(R.id.et2);
    }

    @Override
    public void onClick(View v) {
        String name=edt1.getText().toString();
        String age=edt2.getText().toString();
        Bundle bundle=new Bundle();
        bundle.putString("name",name);
        bundle.putString("password",age);
        Intent intent=new Intent();
        intent.putExtras(bundle);
        intent.setClass(MainActivity.this,a.class);
        //startActivity(intent);
        startActivityForResult(intent,1);
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1&&resultCode==2){
            String str1=data.getStringExtra("data1");
            Toast.makeText(MainActivity.this,str1,Toast.LENGTH_LONG).show();
        }
    }
}