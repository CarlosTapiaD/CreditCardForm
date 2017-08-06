package carlostapiadominguez.creditcardform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Carlos Tapia D on 30/06/17.
 */

public class DetailCard extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_card);

        Bundle extras =getIntent().getExtras();

        Tarjetas tarjetas =extras.getParcelable(MainActivity.Tarjetas_Key);

        TextView nombreCP =(TextView) findViewById(R.id.ingreso);
        TextView numerT =(TextView) findViewById(R.id.adas);
        TextView fecha = (TextView) findViewById(R.id.fecha);

        nombreCP.setText(tarjetas.getName()+" "+ tarjetas.getLastName());

        numerT.setText(tarjetas.getnTarjeta()+"");

        fecha.setText(tarjetas.getMes()+"/"+tarjetas.getAnio());

    }
}
