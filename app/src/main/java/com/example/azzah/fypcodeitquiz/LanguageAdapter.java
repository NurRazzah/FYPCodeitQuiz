package com.example.azzah.fypcodeitquiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class LanguageAdapter extends ArrayAdapter {
    private ArrayList<Language> lang;
    private Context context;
    private Button btnLang, btnLang2;

    public LanguageAdapter(Context context, int resource, ArrayList<Language> objects) {
        super(context, resource);
        lang = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowVIew = inflater.inflate(R.layout.content_main_row, parent, false);

        btnLang = (Button)rowVIew.findViewById(R.id.cat);
        btnLang2 = (Button)rowVIew.findViewById(R.id.cat2);

        Language currentLang = lang.get(position);
        for (int i = 0; i < lang.size(); i++){
            if(i%2 == 0) {
                btnLang.setText(currentLang.getCatName());
            } else {
                btnLang2.setText(currentLang.getCatName());
            }
        }
        //bb
        return rowVIew;
    }
}