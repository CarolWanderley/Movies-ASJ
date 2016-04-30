package com.example.carol.movies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Carol on 29/04/2016.
 */
public class Detalhes extends AppCompatActivity{

    ImageView poster, trailer;
    TextView title, duracao, nota, descricao;
    Button favorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        final Bundle bundle = getIntent().getExtras();

        poster = (ImageView) findViewById(R.id.poster);
        title = (TextView) findViewById(R.id.titulo);
        duracao = (TextView) findViewById(R.id.duracao);
        nota = (TextView) findViewById(R.id.rating);
        descricao = (TextView) findViewById(R.id.descricao);
        trailer = (ImageView) findViewById(R.id.trailer);
        favorito = (Button) findViewById(R.id.favorite);

        poster.setImageResource(bundle.getInt("Poster"));
        title.setText(bundle.getString("Titulo") + " (" + bundle.getString("Ano") + ")");
        duracao.setText(bundle.getString("Duracao"));
        nota.setText(bundle.getString("Nota"));
        descricao.setText(bundle.getInt("Descricao"));
        trailer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(bundle.getString("Trailer")));
                startActivity(intent);
            }
        });
        favorito.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!favorito.isSelected()){
                    favorito.setSelected(true);
                }
                else {
                    favorito.setSelected(false);
                }
            }
        });
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
