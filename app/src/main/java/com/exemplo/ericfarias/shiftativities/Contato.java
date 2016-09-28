package com.exemplo.ericfarias.shiftativities;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;

import java.io.Serializable;

/**
 * Created by Eric Farias on 18/09/2016.
 */
public class Contato implements Serializable{
    private String primeiroNome;
    private String segundoNome;
    private String contato;
    private String email;

    public Contato(String primeiroNome, String segundoNome, String contato, String email){
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.contato = contato;
        this.email = email;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s %s\nTelefone: %s\nEmail: %s", getPrimeiroNome(), getSegundoNome(), getContato(), getEmail());
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
