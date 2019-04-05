package id.sch.smktelkom.www.praktikum;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    Button btnok,btnHapus;
    EditText editnama,editabsen;
    TextView txthasil;
    RadioButton rdb10,rdb9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnok=(Button)findViewById(R.id.submit);
        editnama=(EditText)findViewById(R.id.name);
        editabsen=(EditText)findViewById(R.id.num);
        txthasil=(TextView)findViewById(R.id.txtHasil);
        btnHapus=(Button)findViewById(R.id.hapus);
        rdb10 = (RadioButton) findViewById(R.id.rdb10);
        rdb9 = (RadioButton) findViewById(R.id.rdb9);
        rdb9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

                txthasil.setBackgroundResource(R.color.cyan);

        }
        });
        rdb10.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            txthasil.setBackgroundResource(R.color.yellow);

        }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {

            txthasil.setText("...");

        }
        });

       btnok.setOnClickListener(new View.OnClickListener()
    { @Override
        public void onClick(View v) {
        doProcess();
    }
        private void doProcess() {
        if (isValid()){
            String nama = editnama.getText().toString();
            int tahun = Integer.parseInt(editabsen.getText().toString());
            txthasil.setText("Nama " +nama + "\n"+ "Absen "+tahun+ "\n" );
        }
    }
        private boolean isValid() {
        boolean valid = true;
        String nama = editnama.getText().toString();
        String tahun = editabsen.getText().toString();
        if (nama.isEmpty()){
            editnama.setError("Nama Belum Diisi");
            valid = false;
        }
        else if (nama.length()<3){
            editnama.setError("Karakter Nama kurang dari 3 karakter");
            valid = false;
        }
        else{
            editnama.setError(null);
        }
        if (tahun.isEmpty()){
            editabsen.setError("Tahun Belum Diisi");
            valid = false;
        }
        else if (tahun.length()<2){
            editabsen.setError("Format Absen"); valid = false;
        }
        else{
            editabsen.setError(null);
        }
        return valid; }
    });
}
}
