package com.example.carol.movies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Carol on 29/04/2016.
 */
public class Detalhes extends AppCompatActivity{

    ImageView poster;
    TextView title;
    TextView duracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Bundle bundle = getIntent().getExtras();


        poster = (ImageView) findViewById(R.id.poster);
        title = (TextView) findViewById(R.id.titulo);
        duracao = (TextView) findViewById(R.id.duracao);

        poster.setImageResource(bundle.getInt("Poster"));
        title.setText(bundle.getString("Titulo") + " (" + bundle.getString("Ano") + ")");
        duracao.setText(bundle.getString("Duracao"));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
