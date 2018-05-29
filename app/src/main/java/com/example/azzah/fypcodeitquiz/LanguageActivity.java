package com.example.azzah.fypcodeitquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LanguageActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Language> lang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        lv = (ListView)findViewById(R.id.lvCat);

        lang = new ArrayList<Language>();
        aa = new LanguageAdapter(this,R.layout.content_main_row, lang);

        lv.setAdapter(aa);
        lang.add(new Language("Java"));
        lang.add(new Language("Python"));
        lang.add(new Language("PHP"));
        lang.add(new Language("HTML"));
    }
}