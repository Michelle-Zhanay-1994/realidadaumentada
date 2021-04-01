package com.wikitude.wikitudestudioandroidapptemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class actprincipal extends AppCompatActivity implements View.OnClickListener {

    private ImageButton botcam,botayuda,btdocentes,btinfo;
    private TextView texto;
    private EditText descripcion;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        setTheme(R.style.Theme_AppCompat);
        botcam=(ImageButton) findViewById(R.id.botcam);
        botayuda=(ImageButton) findViewById(R.id.botayuda);
        btdocentes=(ImageButton)findViewById(R.id.bt_docentes);
        btinfo=(ImageButton)findViewById(R.id.infocarrera);
        texto=(TextView) findViewById(R.id.texto);
        descripcion = (EditText)findViewById(R.id.descripcion);
        botcam.setOnClickListener(this);
        botayuda.setOnClickListener (this);
        btdocentes.setOnClickListener(this);
        btinfo.setOnClickListener(this);

    }


    public void onClick(View view) {

        if(view == botayuda){
        descripcion.setVisibility(View.VISIBLE);
        }
        if(view == botcam){
            Intent intent = new Intent(this, SampleCamActivity.class);
            startActivity(intent);
        }

        if (view == btdocentes){
            Intent star = new Intent(this, docentes.class);
            startActivity(star);
        }
        if (view == btinfo){
            Intent a1 = new Intent(this,carrera.class);
            startActivity(a1);
        }
    }



}


