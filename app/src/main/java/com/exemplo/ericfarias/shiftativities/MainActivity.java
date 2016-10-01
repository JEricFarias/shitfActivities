package com.exemplo.ericfarias.shiftativities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Codigo da requisição
    private final int REQUEST_CODE = 1;

    // Array de contato, inicia o dapter
    private ArrayList<Contato> contatos;

    private Button btnCadastrar;
    private ListView listaContatos;
    private ContatoAdapter adapter;


    /**
     *
     * Factory view
     *
     * */
    private void montarListView(){
        listaContatos = (ListView) findViewById(R.id.activityMainListView);
        ContatoAdapter adapter = new ContatoAdapter(this, contatos);
        listaContatos.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.contatos = new ArrayList<>();
        contatos.add(new Contato("Eric", "Farias", "84255763", "ericfarrias@hotmail.com"));
        contatos.add(new Contato("Ana", "Farias", "84255633", "anaMFarias@hotmail.com"));

        btnCadastrar = (Button) findViewById(R.id.activityMainBtnCadastrar);

        // Cria um objeto list view, cria um adapter, serta o dapter na lista.
        montarListView();

        Toast.makeText(getBaseContext(), "numero elementos = " + contatos.size(),Toast.LENGTH_LONG).show();

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CadastrarContato.class);

                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
        if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){
                Bundle dados = intent.getExtras();
                contatos.add( (Contato) dados.getSerializable("contato"));

                montarListView();
            }
        }
    }


    protected void onStart(){
        super.onStart();
        Log.i(this.getLocalClassName(), "está no onStart");
    }

    protected void onResume(){
        super.onResume();
        Log.i(this.getLocalClassName(), "está no onResume");
    }

    protected void onPause(){
        super.onPause();
        Log.i(this.getLocalClassName(), "está no onPause");
    }

    protected void onStop(){
        super.onStop();
        Log.i(this.getLocalClassName(), "está no onStop");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(this.getLocalClassName(), "está no onRestart");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(this.getLocalClassName(), "está no onDestroy");
    }
}
