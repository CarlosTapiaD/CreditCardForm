package carlostapiadominguez.creditcardform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
/*
    public String pName;
    public String pLastName;
    public int pNumberCard;
    public int pMes;
    public int pAnio;
    public int pCodigo;
    public String pCalle;
    public String pCiudad;
    public String pEstado;
    public int pCPostal;*/

    public static final String Tarjetas_Key="tarjetaskey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegistrar =(Button) findViewById(R.id.guardar) ;
        final TextView name =(TextView) findViewById(R.id.names);
        final TextView lastName=(TextView) findViewById(R.id.apellidos);
        final TextView numberCard=(TextView) findViewById(R.id.numeroT);
        final TextView mes=(TextView) findViewById(R.id.mes);
        final TextView anio=(TextView) findViewById(R.id.anios);
        final TextView codigo=(TextView) findViewById(R.id.codigo);
        final TextView calle=(TextView) findViewById(R.id.calle);
        final TextView ciudad=(TextView) findViewById(R.id.ciudad);
        final TextView estado=(TextView) findViewById(R.id.estado);
        final TextView cPostal=(TextView) findViewById(R.id.cp);

      /*  final String pName =name.getText().toString();
        final String pLastName=lastName.getText().toString();
        final int pNumberCard=Integer.parseInt(numberCard.getText().toString());
        final int pMes=Integer.parseInt(mes.getText().toString());
        final int pAnio=Integer.parseInt(anio.getText().toString());
        final int pCodigo=Integer.parseInt(codigo.getText().toString());
        final String pCalle=calle.getText().toString();
        final String pCiudad=ciudad.getText().toString();
        final String pEstado=estado.getText().toString();
        final int pCPostal=Integer.parseInt(cPostal.getText().toString());*/

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent detalleTarjeta = new Intent(MainActivity.this, DetailCard.class);
                    //final Tarjetas tj= new Tarjetas(pName,pLastName,pNumberCard ,pMes,pAnio,pCodigo,pCalle,pCiudad ,pEstado,pCPostal);
                    Tarjetas tj= new Tarjetas(name.getText().toString(),lastName.getText().toString(),numberCard.getText().toString() ,Integer.parseInt(mes.getText().toString()),Integer.parseInt(anio.getText().toString()),Integer.parseInt(codigo.getText().toString()),calle.getText().toString(),ciudad.getText().toString() ,estado.getText().toString(),Integer.parseInt(cPostal.getText().toString()));
                    //Tarjetas tj = new Tarjetas();
                    detalleTarjeta.putExtra(Tarjetas_Key, tj);
                    startActivity(detalleTarjeta);
                }
                catch (Exception e){
                    String error="tienes un error: "+ e;
                    Toast.makeText(MainActivity.this,error,Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
