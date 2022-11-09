package com.prueba.ejerciciodia16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView ListViewObjeto;
    List<Objeto> lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewObjeto = findViewById(R.id.ListViewObjeto);

        CustomAdapter adapter = new CustomAdapter(this, GetData());
        ListViewObjeto.setAdapter(adapter);

        ListViewObjeto.setOnItemClickListener((parent, view, i, id) -> {
            Objeto c=lista.get(i);
            Toast.makeText(getBaseContext(),c.nombre,Toast.LENGTH_SHORT).show();
        });
    }
//
    private List<Objeto> GetData() {
        lista = new ArrayList<>();
        lista.add(new Objeto(1,R.drawable.caballo,R.string.animal1,R.string.txt1));
        lista.add(new Objeto(2,R.drawable.colibri,R.string.animal2,R.string.txt2));
         lista.add(new Objeto(3,R.drawable.gato,R.string.animal3,R.string.txt3));
         lista.add(new Objeto(4,R.drawable.tigre,R.string.animal4,R.string.txt4));
         lista.add(new Objeto(5,R.drawable.zorro,R.string.animal5,R.string.txt5));

        return lista;
    }
}