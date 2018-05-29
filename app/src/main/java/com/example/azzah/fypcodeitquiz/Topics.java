package com.example.azzah.fypcodeitquiz;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Topics extends Fragment {

    Button button1, button2, button3, button4, button5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.topics_activity, container, false);


        button1 = (Button) view.findViewById(R.id.btn1);
        button2 = (Button) view.findViewById(R.id.btn2);
        button3 = (Button) view.findViewById(R.id.btn3);
        button4 = (Button) view.findViewById(R.id.btn4);
        button5 = (Button) view.findViewById(R.id.btn5);

        return view;
    }

}