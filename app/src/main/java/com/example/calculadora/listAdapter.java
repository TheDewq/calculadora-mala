package com.example.calculadora;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class listAdapter extends RecyclerView.Adapter<listAdapter.viewHolder> {
    private List<listOperaciones> lista;
    private LayoutInflater inflater;
    private Context context;

    public listAdapter(List<listOperaciones> lista, Context context) {
        this.lista = lista;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        System.out.println("listadapter 1");
    }

    @NonNull
    @Override
    public listAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.resultados, null);
        System.out.println("listadapter 2");
        return new listAdapter.viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull listAdapter.viewHolder holder, int position) {
        holder.bindData(lista.get(position));
        System.out.println("listadapter 3");
    }

    @Override
    public int getItemCount() {
        System.out.println("listadapter 4");
        return lista.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView operacion, resultado;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            operacion = itemView.findViewById(R.id.Operacion);
            resultado = itemView.findViewById(R.id.Resultado);
        }

        public void bindData(listOperaciones listOperaciones) {
            operacion.setText(listOperaciones.getOperacion());
            resultado.setText(listOperaciones.getResultado());
        }
    }
}
