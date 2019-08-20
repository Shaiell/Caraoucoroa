package br.ici.treinamento.telasobretela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SegundaActivity extends AppCompatActivity {


    private Button buttonVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle dadosRecebe = getIntent().getExtras();
        int numero = dadosRecebe.getInt("numero");


        buttonVoltar = findViewById(R.id.buttonVoltar);


        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });


    }
}
