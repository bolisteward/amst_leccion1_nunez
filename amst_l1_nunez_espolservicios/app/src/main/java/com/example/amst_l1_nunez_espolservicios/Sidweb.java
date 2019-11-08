package com.example.amst_l1_nunez_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sidweb extends AppCompatActivity {
    private Button btn_horario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidweb);
        btn_horario = (Button)findViewById(R.id.btn_horario);
        btn_horario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Horario de atención De 08h00 a 16h30, de lunes a viernes.\n" +
                                "Guayaquil - Ecuador",
                        Toast.LENGTH_LONG);
                toast.show();
            }
        });




    }
}
