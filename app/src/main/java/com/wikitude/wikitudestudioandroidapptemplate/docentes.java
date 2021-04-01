package com.wikitude.wikitudestudioandroidapptemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class docentes extends AppCompatActivity implements View.OnClickListener {

    private Button atrasdocentes ;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.docentes);
        setTheme(R.style.Theme_AppCompat);
        atrasdocentes=(Button) findViewById(R.id.atras_docentes);
        atrasdocentes.setOnClickListener(this);


    }


    public void onClick(View view) {

        if (view == atrasdocentes){
            Intent play = new Intent(this, actprincipal.class);
            startActivity(play);
        }

    }



}



