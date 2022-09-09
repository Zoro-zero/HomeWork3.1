package com.zoro.homework31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SeccondActivity extends AppCompatActivity {
private TextView parametr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccond);
        parametr=findViewById(R.id.new_episode);
        String txtName = getIntent().getStringExtra("parametr");
        parametr.setText(parametr.getText().toString()+ " "+txtName);
    }
}