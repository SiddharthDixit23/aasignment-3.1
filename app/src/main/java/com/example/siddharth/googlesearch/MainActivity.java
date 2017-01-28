package com.example.siddharth.googlesearch;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mbutton;
    private EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.editText);
        mbutton = (Button)findViewById(R.id.button);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    try {
                        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                        String term = e1.getText().toString();
                        intent.putExtra(SearchManager.QUERY, term);
                        startActivity(intent);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                }
            }
        });


    }
}
