package com.example.c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class a extends AppCompatActivity implements View.OnClickListener  {
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);
        tv =findViewById(R.id.textView);
        btn=findViewById(R.id.button);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String name=bundle.getString("name");
        String age=bundle.getString("password");
        tv.setText(name+age);
        btn.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent intent=new Intent();
        intent.putExtra("data","Hello MainActivity");
        setResult(2,intent);
        finish();

    }

}