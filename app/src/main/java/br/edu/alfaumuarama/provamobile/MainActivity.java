package br.edu.alfaumuarama.provamobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView edtNome;
    TextView edtRA;
    Button   btnValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome    = findViewById(R.id.edtNome);
        edtRA      = findViewById(R.id.edtRA);
        btnValidar = findViewById(R.id.btnValidar);

        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNome.getText().toString() == null || edtNome.getText().toString() == "") {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Aviso !");
                    alert.setMessage("Os campos devem estar preenchidos para que possa ser feita a validação.");
                    alert.create();
                    alert.show();

                } else if (edtRA.getText().toString() == null || edtRA.getText().toString() == "") {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Aviso !");
                    alert.setMessage("Os campos devem estar preenchidos para que possa ser feita a validação.");
                    alert.create();
                    alert.show();
                }
            }
        });
    }
}