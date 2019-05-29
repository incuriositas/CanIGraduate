package com.example.canigraduate;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DbOpenHelper mDbOpenHelper = new DbOpenHelper(this);
        //mDbOpenHelper.open();
        //mDbOpenHelper.create();

        final TextView text = (TextView)findViewById(R.id.textView);
        Button btn = (Button)findViewById(R.id.button3);


        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                text.setText("hi");
            }
        });
    }

    protected void onClick(View view){
        startActivity(new Intent(MainActivity.this, CollectviewActivity.class));
        finish();
    }

}
