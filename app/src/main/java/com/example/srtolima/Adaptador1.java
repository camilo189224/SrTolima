package com.example.srtolima;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador1 extends RecyclerView.Adapter<Adaptador1.viewHolder>{

    //Atributos de la clase adaptador
    public ArrayList<Postobon> listaBebidas1;

    //Constructor
    public Adaptador1(ArrayList<Postobon> listaBebidas1) {this.listaBebidas1 = listaBebidas1;}


    @NonNull
    @Override
    public Adaptador1.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista1 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item1,null,false);
        return new viewHolder(vista1);
    }
    @Override
    public void onBindViewHolder(@NonNull Adaptador1.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos1(listaBebidas1.get(i));
    }
    @Override
    public int getItemCount() {return listaBebidas1.size();}
    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoProducto1;
        TextView nombreProducto1;
        TextView precioProducto1;
        public viewHolder(@NonNull View item1View) {
            super(item1View);
            fotoProducto1=item1View.findViewById((R.id.fotoBebida1));
            nombreProducto1=item1View.findViewById(R.id.nombreBebida1);
            precioProducto1=item1View.findViewById(R.id.precioUnit1);
        }

        public void actualizarDatos1(Postobon postobon) {
            fotoProducto1.setImageResource(postobon.getFoto1());
            nombreProducto1.setText(postobon.getNombre1());
            precioProducto1.setText(postobon.getPrecioProducto1());
        }
    }
}
