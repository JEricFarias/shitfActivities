package com.exemplo.ericfarias.shiftativities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by Eric Farias on 19/09/2016.
 */
public class CadastrarContato extends AppCompatActivity {

    private EditText nome;
    private EditText sobrenome;
    private EditText telefone;
    private EditText email;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = (EditText) findViewById(R.id.acativityCadastroEditTextNome);
        sobrenome = (EditText) findViewById(R.id.acativityCadastroEditTextSobrenome);
        telefone = (EditText) findViewById(R.id.acativityCadastroEditTextTelefone);
        email = (EditText) findViewById(R.id.acativityCadastroEditTextEmail);

        btnCadastrar = (Button) findViewById(R.id.acativityCadastroBtnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Bundle dados = new Bundle();
                try{
                    // pegar os valores do campo
                    Contato c = new Contato(nome.getText().toString(), sobrenome.getText().toString(), telefone.getText().toString(), email.getText().toString());
                    dados.putSerializable("contato", c);
                    intent.putExtras(dados);
                    setResult(RESULT_OK, intent);
                    Toast.makeText(getBaseContext(), "Deu Serto", Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    setResult(RESULT_CANCELED);
                }
                finish();
            }
        });

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

