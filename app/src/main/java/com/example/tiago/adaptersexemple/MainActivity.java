package com.example.tiago.adaptersexemple;



import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("A Lagoa Azul",1987));
        filmes.add(new Filme("Caça Fantasmas",1987));
        filmes.add(new Filme("Rock",1977));

        FilmeAdapter filmeAdapter = new FilmeAdapter(this,R.layout.filme_item,filmes);
        ListView listFilmes = (ListView) findViewById(R.id.ListFilmes);
        listFilmes.setAdapter(filmeAdapter);

    }

}
