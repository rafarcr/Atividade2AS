package com.example.rafarcr.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listView =findViewById(R.id.listView);

        Bundle b = getIntent().getExtras();

        String tipoEnt = b.getString("tipoEntrega");
        String idProd = b.getString("idProduto");
        String qntProd = b.getString("quantidadeProduto");
        String DescProd = b.getString("descricaoProduto");

        carregaListView(tipoEnt,idProd,qntProd,DescProd);

    }


    private void carregaListView(String tipoEnt,String idProd, String qntProd, String DescProd)
    {
        final String[] valores= new String[]
                {
                        idProd,DescProd,qntProd,tipoEnt

                };
        ArrayAdapter adapter = new ArrayAdapter(Main3Activity.this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                listView.setAdapter(adapter);




    }



}
