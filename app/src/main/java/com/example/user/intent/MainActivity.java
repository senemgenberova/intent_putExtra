package com.example.user.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String getText(){
        EditText editText = (EditText) findViewById(R.id.editText);
        return editText.getText().toString();
    }

    public void msgIntent(View view) {
        Intent mainPage = new Intent(this,Main2Activity.class);
        String msg = getText();
        mainPage.putExtra("name", msg);
        startActivity(mainPage);
    }
}
