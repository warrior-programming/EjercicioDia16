package com.prueba.ejerciciodia16;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {


    final Context context;
    final List<Objeto> lista;

    public CustomAdapter(Context context, List<Objeto> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ImageView ImageViewObjeto;
        TextView TextViewNombre;
        TextView TextViewDescripcion;

        Objeto c=lista.get(i);

        if (view==null){

           view = LayoutInflater.from(context).inflate(R.layout.listview_objetos,null);

           ImageViewObjeto = view.findViewById(R.id.imageViewObjeto);
            TextViewNombre = view.findViewById(R.id.textViewNombre);
            TextViewDescripcion = view.findViewById(R.id.textViewDescripcion);

            ImageViewObjeto.setImageResource(c.imagen);
            TextViewNombre.setText(c.nombre);
            TextViewDescripcion.setText(c.descripcion);

            return view;
        }
        return null;
    }
}
