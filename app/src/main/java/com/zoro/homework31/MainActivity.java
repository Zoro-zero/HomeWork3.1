package com.zoro.homework31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText parametr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    button=findViewById(R.id.btn_click);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MainActivity.this,SeccondActivity.class);
            parametr=findViewById(R.id.new_par);
            intent.putExtra("parametr",parametr.getText().toString());
            startActivity(intent);
            finish();

        }
    });
    }
}