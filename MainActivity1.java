package com.example.mayouza.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.Object ;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        editText = (EditText) this.findViewById(R.id.editText);
        textView = (TextView) this.findViewById(R.id.textView);


        editText.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s ,int start, int count, int after){
                textView.setText(s);
                textView.setSingleLine(true);
                textView.setHorizontallyScrolling(false);
                textView.setLines(4);

            }

            public void beforeTextChanged (CharSequence s ,int start, int count, int after){

            }

            public void afterTextChanged (Editable s){

            }

        });

    }
}
