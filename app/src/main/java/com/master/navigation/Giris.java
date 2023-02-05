package com.master.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Giris extends Fragment {

    Button login , create;
    EditText nameText , surnameText , phoneText;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_giris, container, false);

        login = rootView.findViewById(R.id.loginbtn);
        create = rootView.findViewById(R.id.createbtn);
        nameText = rootView.findViewById(R.id.nameEditText);
        surnameText= rootView.findViewById(R.id.surnameEdittext);
        phoneText = rootView.findViewById(R.id.phoneEditText);


        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!TextUtils.isEmpty(phoneText.getText())){
                    GirisDirections.ActionGirisToCreate2 direction = GirisDirections.actionGirisToCreate2();
                    direction.setPhone(Integer.valueOf(phoneText.getText().toString()));

                    Navigation.findNavController(view).navigate(direction);
                }
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GirisDirections.ActionGirisToLogin2 direction = GirisDirections.actionGirisToLogin2();

                direction.setName( nameText.getText().toString() );
                direction.setSurname( surnameText.getText().toString() );

                Navigation.findNavController(view).navigate(direction);

            }
        });



        return  rootView;
    }
}