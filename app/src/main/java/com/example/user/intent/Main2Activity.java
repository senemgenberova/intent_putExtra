package com.example.user.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtView = (TextView) findViewById(R.id.textView);

        Intent thisPage = getIntent();
        String message = thisPage.getStringExtra("name");

        txtView.setText("Hello " + message);

    }

    public void toPrevious(View view) {
        Intent secondPage = new Intent(this, MainActivity.class);
        startActivity(secondPage);
    }
}
