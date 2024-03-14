package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText n1, n2;
    private int num1, num2;
    private List<listOperaciones> lista;
    private RecyclerView recyclerview;
    private listAdapter adapter;
    private String[] operaciones = {"SUMA","RESTA","MULTIPLICACION","DIVISION","FACTORIZACION"};
    private double[] rpts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutar_y_crear(View v){
        n1 = findViewById(R.id.editTextText);
        n2 = findViewById(R.id.editTextText2);
        num1 = Integer.parseInt(String.valueOf(n1.getText()));
        num2 = Integer.parseInt(String.valueOf(n2.getText()));
        lista = new ArrayList<>();
        rpts = new double[] {mat.suma(num1, num2), mat.resta(num1, num2), mat.multiplicacion(num1, num2), mat.division(num1, num2), mat.factorial(num1)};
        for(int i = 0; i < operaciones.length; i++){
            lista.add(new listOperaciones(operaciones[i], String.valueOf(rpts[i])));
        }

        adapter = new listAdapter(lista, this);
        recyclerview = findViewById(R.id.que);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(adapter);

    }
}