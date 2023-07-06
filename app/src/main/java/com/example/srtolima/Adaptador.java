package com.example.srtolima;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.viewHolder>{

    //Atributos de la clase adaptador
    public ArrayList<Coca_cola> listaBebidas;

    //Constructor
    public Adaptador(ArrayList<Coca_cola> listaBebidas) {this.listaBebidas = listaBebidas;}

    @NonNull
    @Override
    public Adaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaBebidas.get(i));
    }
    @Override
    public int getItemCount() {return listaBebidas.size();}
    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoProducto;
        TextView nombreProducto;
        TextView precioProducto;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoProducto=itemView.findViewById((R.id.fotoBebida));
            nombreProducto=itemView.findViewById(R.id.nombreBebida);
            precioProducto=itemView.findViewById(R.id.precioUnit);
        }
        public void actualizarDatos(Coca_cola coca_cola) {
            fotoProducto.setImageResource(coca_cola.getFoto());
            nombreProducto.setText(coca_cola.getNombre());
            precioProducto.setText(coca_cola.getPrecioProducto());
        }
    }
}
