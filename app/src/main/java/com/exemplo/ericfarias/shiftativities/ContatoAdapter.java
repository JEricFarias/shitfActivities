package com.exemplo.ericfarias.shiftativities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eric Farias on 20/09/2016.
 */
public class ContatoAdapter extends BaseAdapter {


    private ArrayList<Contato> contatos;
    private Context context;

    public ContatoAdapter(Context context, ArrayList<Contato> contatos){
        this.contatos = contatos;
        this.context = context;
    }

    /**
     *
     * @return O número de itens do array
     *
     * */
    @Override
    public int getCount() {
        return contatos.size();
    }

    /**
     * @param position Representa o indice do array
     * @return O o valor do iten no indice especificado
     * */
    @Override
    public Contato getItem(int position) {
        return contatos.get(position);
    }

    /**
     * Sem implementação
     *
     * @param position Representa o id do array
     * @return O id do idente especificado na posição
     * */
    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contato contato;
        contato = this.contatos.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.iten_listview, parent, false);

        ((TextView) row.findViewById(R.id.itenListViewTextViewNome)).setText(contato.getPrimeiroNome());
        ((TextView) row.findViewById(R.id.itenListViewTextViewSobrenome)).setText(contato.getSegundoNome());
        ((TextView) row.findViewById(R.id.itenListViewTextViewEmail)).setText(contato.getEmail());
        ((TextView) row.findViewById(R.id.itenListViewTextViewTelefone)).setText(contato.getEmail());

        return row;
    }
}
