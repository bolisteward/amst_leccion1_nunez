package com.example.amst_l1_nunez_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_sidweb, btn_academico, btn_vinculos, btn_bienestar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sidweb =  (Button) findViewById(R.id.btn_sidweb);
        btn_academico =  (Button) findViewById(R.id.btn_academico);
        btn_vinculos =  (Button) findViewById(R.id.btn_vinculos);
        btn_bienestar =  (Button) findViewById(R.id.btn_bienestar);
    }


    public void openPage(View v){
        if (v.getId()== R.id.btn_sidweb){
            Intent intent = new Intent(this,Sidweb.class);
            startActivity(intent);
        }else if (v.getId()== R.id.btn_academico){
            Intent intent = new Intent(this,Sistema_academico.class);
            startActivity(intent);
        }else if (v.getId()== R.id.btn_vinculos) {
            Intent intent = new Intent(this, Vinculos_sociedad.class);
            startActivity(intent);
        }else if (v.getId()== R.id.btn_bienestar) {
            Intent intent = new Intent(this, Bienestar_estudiantil.class);
            startActivity(intent);
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Debe seleccionar una opcion",
                    Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
