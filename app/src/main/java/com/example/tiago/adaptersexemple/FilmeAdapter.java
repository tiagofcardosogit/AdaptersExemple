package com.example.tiago.adaptersexemple;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Tiago on 14/02/2017.
 */

public class FilmeAdapter extends ArrayAdapter<Filme> {

    List<Filme> filmes;

    public FilmeAdapter(Context context, int resource, List<Filme> objects) {
        super(context, resource, objects);
        filmes= objects;
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent){
        View localView = contentView;

        if (localView==null){
            LayoutInflater inflate = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            localView = inflate.inflate(R.layout.filme_item, null);
        }

        Filme filme = filmes.get(position);

        if (filme==null){
            TextView textTitulo = (TextView) localView.findViewById(R.id.textTitulo);
            TextView textAno = (TextView) localView.findViewById(R.id.textAno);

            if (textTitulo !=null){
                textTitulo.setText(filme.getTitulo());
            }

            if (textAno != null){
                textAno.setText(String.valueOf(filme.getAno()));
            }


        }

        return localView;
    }

}

