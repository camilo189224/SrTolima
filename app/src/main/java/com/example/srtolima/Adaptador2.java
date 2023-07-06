package com.example.srtolima;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador2 extends RecyclerView.Adapter<Adaptador2.viewHolder> {

    //Atributos de la clase adaptador
    public ArrayList<Cerveza> listaBebidas2;

    //Constructor
    public Adaptador2(ArrayList<Cerveza> listaBebidas2) {this.listaBebidas2 = listaBebidas2;}

    @NonNull
    @Override
    public Adaptador2.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item2,null,false);
        return new viewHolder(vista2);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador2.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos2(listaBebidas2.get(i));
    }

    @Override
    public int getItemCount() {return listaBebidas2.size();}

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoProducto2;
        TextView nombreProducto2;
        TextView precioProducto2;
        public viewHolder(@NonNull View item2View) {
            super(item2View);
            fotoProducto2=item2View.findViewById((R.id.fotoBebida2));
            nombreProducto2=item2View.findViewById(R.id.nombreBebida2);
            precioProducto2=item2View.findViewById(R.id.precioUnit2);
        }

        public void actualizarDatos2(Cerveza cerveza) {
            fotoProducto2.setImageResource(cerveza.getFoto2());
            nombreProducto2.setText(cerveza.getNombre2());
            precioProducto2.setText(cerveza.getPrecioProducto2());
        }
    }
}
