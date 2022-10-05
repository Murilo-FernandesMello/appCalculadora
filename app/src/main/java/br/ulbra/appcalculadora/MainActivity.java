package br.ulbra.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtV1, edtV2;
    Button btSum, btMin, btTim, btDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtV1 = findViewById(R.id.edtV1);
        edtV2 = findViewById(R.id.edtV2);
        btSum = findViewById(R.id.btSum);
        btMin = findViewById(R.id.btMin);
        btTim = findViewById(R.id.btTim);
        btDiv = findViewById(R.id.btDiv);

        btSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1, v2, sum;
                v1 = Double.parseDouble(edtV1.getText().toString());
                v2 = Double.parseDouble(edtV2.getText().toString());
                sum = v1 + v2;
                Toast.makeText(MainActivity.this, "Resultado da Soma: " + sum, Toast.LENGTH_LONG).show();
            }
        });
        btMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1, v2, min;
                v1 = Double.parseDouble(edtV1.getText().toString());
                v2 = Double.parseDouble(edtV2.getText().toString());
                min = v1 - v2;
                Toast.makeText(MainActivity.this, "Resultado da Subtração: " + min, Toast.LENGTH_LONG).show();
            }
        });
        btTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1, v2, tim;
                v1 = Double.parseDouble(edtV1.getText().toString());
                v2 = Double.parseDouble(edtV2.getText().toString());
                tim = v1 * v2;
                Toast.makeText(MainActivity.this, "Resultado da Multiplicação: " + tim, Toast.LENGTH_LONG).show();
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1, v2, div;
                v1 = Double.parseDouble(edtV1.getText().toString());
                v2 = Double.parseDouble(edtV2.getText().toString());
                div = v1 / v2;
                if (v2 == 0) {
                    Toast.makeText(MainActivity.this, "Imposível Dividir por 0", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Resultado da Divisão: " + div, Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}