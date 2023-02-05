package com.master.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Login extends Fragment {

    TextView nameText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rooView =  inflater.inflate(R.layout.fragment_login, container, false);

        nameText = rooView.findViewById(R.id.loginNameText);

        LoginArgs args = LoginArgs.fromBundle(getArguments());

        nameText.setText( args.getName() +"  " + args.getSurname());

        return rooView;
    }
}