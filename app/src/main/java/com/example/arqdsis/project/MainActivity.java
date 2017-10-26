package com.example.arqdsis.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public final static String EXTRA_MESSAGE = "br.usjt.meuprimeiroapp.MESSAGE";


    public void calcula(View view)
    {
        Intent intent = new Intent(this, SegundaTela.class);
        ArrayList<String> lista = new ArrayList<>();
        EditText editText = (EditText) findViewById(R.id.tabuada_do_barra);
        EditText editText2 = (EditText) findViewById(R.id.ate_barra);

        int quantidade = Integer.parseInt(editText2.getEditableText().toString());

        for (int i = 0; i > quantidade; i++)
        {
            int valor = Integer.parseInt(editText.getEditableText().toString()) * i;
            String resultado = editText.getEditableText().toString() + "x" + i + "=" + valor;
            lista.add(resultado);

            intent.putExtra(EXTRA_MESSAGE, lista);
            startActivity(intent);
        }
    }



}
