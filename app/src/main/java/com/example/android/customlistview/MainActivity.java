package com.example.android.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String languages[] = {"C","C++","JAVA","C#","Swift","Kotlin"};
    Integer image[] = {R.drawable.c,R.drawable.cpp,R.drawable.java,R.drawable.csharp,R.drawable.swift,R.drawable.kotlin};
    ListView listView;
    LanguageAdapter languageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        languageAdapter = new LanguageAdapter(MainActivity.this, image, languages);
        listView.setAdapter(languageAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView title = view.findViewById(R.id.title);
                Toast.makeText(getApplicationContext(), "You selected "+title.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
