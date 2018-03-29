package com.example.rafarcr.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText idproduto;
    EditText desc;
    EditText qnt;
    RadioGroup tipoEntrega;
    RadioButton encomenda;
    RadioButton estoque;
    String entrega;
    String produto;
    String descricao;
    String quantidade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        idproduto = (EditText) findViewById(R.id.idprod);
        desc = (EditText) findViewById(R.id.qntProd);
        qnt = (EditText) findViewById(R.id.descProd);


    }


    public void verificaEntrega(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.tRadio:
                if (checked)
                    entrega = "Transportadora";
                break;

            case R.id.lRadio:
                if (checked)
                    entrega = "Local";
                break;
        }

    }

    public void Enviar(View view) {
        produto= idproduto.getText().toString();
        descricao=desc.getText().toString();
        quantidade=qnt.getText().toString();
        entrega = "";

        Toast.makeText(getApplicationContext(), entrega, Toast.LENGTH_LONG).show();
        Intent objetointent2 = new Intent(Main2Activity.this, Main3Activity.class);

        objetointent2.putExtra("tipoEntrega", "Tipo de entrega: "+entrega);
        objetointent2.putExtra("descricaoProduto", "Descrição do Produto: "+descricao);
        objetointent2.putExtra("quantidadeProduto","Quantidade: "+ quantidade);
        objetointent2.putExtra("idProduto","ID: "+ produto);

        startActivity(objetointent2);

    }

}



