package com.master.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Create extends Fragment {

    TextView phoneText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_create, container, false);

        phoneText = rootView.findViewById(R.id.createPhoneText);

        CreateArgs args = CreateArgs.fromBundle(getArguments());

        phoneText.setText( String.valueOf(args.getPhone()) );

        return  rootView;
    }
}