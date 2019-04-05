package www.smktelkom_mlg.sch.id.biodata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    EditText editNama, editTahun;
    Spinner spKota, spProvinsi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button) findViewById(R.id.btnSumbit);
        editNama = (EditText) findViewById(R.id.editNama);
        editTahun = (EditText) findViewById(R.id.editTahun);
        spKota = (Spinner) findViewById(R.id.spKota);
        spProvinsi = (Spinner) findViewById(R.id.spProvinsi);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editNama.getText().toString();
                int tahun = Integer.parseInt(editTahun.getText().toString());
                int usia = 2016 - tahun;
                txtHasil.setText("Hasil \n"+" Nama : " +nama + "\n" + " Berusia : " + usia + " Tahun" + "\n"+" Provinsi : " + spProvinsi.getSelectedItem().toString() + "\n"+ " Kota : "
                    +spKota.getSelectedItem().toString()
                );
            }
        });
    }
}
