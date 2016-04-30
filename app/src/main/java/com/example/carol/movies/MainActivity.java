package com.example.carol.movies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import Entity.Movie;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Movie> filmes;
    private ArrayList<ImageView> posters;
    private ImageView filme1;
    private ImageView filme2;
    private ImageView filme3;
    private ImageView filme4;
    private ImageView filme5;
    private ImageView filme6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filmes = new ArrayList<>();
        posters = new ArrayList<>();
        filme1 = (ImageView) findViewById(R.id.filme1);
        filme2 = (ImageView) findViewById(R.id.filme2);
        filme3 = (ImageView) findViewById(R.id.filme3);
        filme4 = (ImageView) findViewById(R.id.filme4);
        filme5 = (ImageView) findViewById(R.id.filme5);
        filme6 = (ImageView) findViewById(R.id.filme6);

        filmes.add(new Movie("American Psycho", "2000", "1h 42min", "7,6", "https://www.youtube.com/watch?v=5YnGhW4UEhc", R.string.americansinopse,  R.drawable.american));
        filmes.add(new Movie("Hannibal", "2001", "2h 11min", "6,8", "https://www.youtube.com/watch?v=eHSYth2wSEk", R.string.hannibalsinopse,  R.drawable.hannibal));
        filmes.add(new Movie("O dragão vermelho", "2002", "2h 4min", "7,2", "https://www.youtube.com/watch?v=f_Iq18xpC6k", R.string.redragonsinopse,  R.drawable.reddragon));
        filmes.add(new Movie("León: the professional", "1994", "1h 50min", "8,6", "https://www.youtube.com/watch?v=DcsirofJrlM", R.string.leonsinopse,  R.drawable.leon));
        filmes.add(new Movie("Precisamos falar sobre o Kevin", "2011", "1h 52min", "7,5", "https://www.youtube.com/watch?v=ZLRgAe2jLaw", R.string.kevinsinopse,  R.drawable.kevin));
        filmes.add(new Movie("O silêncio dos inocentes", "1991", "1h 58min", "8,6", "https://www.youtube.com/watch?v=lQKs169Sl0I", R.string.silenciosinopse,  R.drawable.silencio));

        posters.add(filme1);
        posters.add(filme2);
        posters.add(filme3);
        posters.add(filme4);
        posters.add(filme5);
        posters.add(filme6);

        for(int i=0; i<filmes.size(); i++){
                posters.get(i).setImageResource(filmes.get(i).getImageAddress());
        }

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (v.getId() == R.id.filme2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", filmes.get(1).getTitulo());
                    bundle.putString("Ano", filmes.get(1).getAno());
                    bundle.putString("Duracao", filmes.get(1).getDuracao());
                    bundle.putString("Nota", filmes.get(1).getNota());
                    bundle.putInt("Descricao", filmes.get(1).getDescricao());
                    bundle.putString("Trailer", filmes.get(1).getTrailer());
                    bundle.putInt("Poster", filmes.get(1).getImageAddress());
                    Intent intent = new Intent(MainActivity.this, Detalhes.class);
                    startActivity(intent.putExtras(bundle));
                }
                if (v.getId() == R.id.filme3) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", filmes.get(2).getTitulo());
                    bundle.putString("Ano", filmes.get(2).getAno());
                    bundle.putString("Duracao", filmes.get(2).getDuracao());
                    bundle.putString("Nota", filmes.get(2).getNota());
                    bundle.putInt("Descricao", filmes.get(2).getDescricao());
                    bundle.putString("Trailer", filmes.get(2).getTrailer());
                    bundle.putInt("Poster", filmes.get(2).getImageAddress());
                    Intent intent = new Intent(MainActivity.this, Detalhes.class);
                    startActivity(intent.putExtras(bundle));
                }
                if (v.getId() == R.id.filme4) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", filmes.get(3).getTitulo());
                    bundle.putString("Ano", filmes.get(3).getAno());
                    bundle.putString("Duracao", filmes.get(3).getDuracao());
                    bundle.putString("Nota", filmes.get(3).getNota());
                    bundle.putInt("Descricao", filmes.get(3).getDescricao());
                    bundle.putString("Trailer", filmes.get(3).getTrailer());
                    bundle.putInt("Poster", filmes.get(3).getImageAddress());
                    Intent intent = new Intent(MainActivity.this, Detalhes.class);
                    startActivity(intent.putExtras(bundle));
                }
                if (v.getId() == R.id.filme5) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", filmes.get(4).getTitulo());
                    bundle.putString("Ano", filmes.get(4).getAno());
                    bundle.putString("Duracao", filmes.get(4).getDuracao());
                    bundle.putString("Nota", filmes.get(4).getNota());
                    bundle.putInt("Descricao", filmes.get(4).getDescricao());
                    bundle.putString("Trailer", filmes.get(4).getTrailer());
                    bundle.putInt("Poster", filmes.get(4).getImageAddress());
                    Intent intent = new Intent(MainActivity.this, Detalhes.class);
                    startActivity(intent.putExtras(bundle));
                }
                if (v.getId() == R.id.filme6) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", filmes.get(5).getTitulo());
                    bundle.putString("Ano", filmes.get(5).getAno());
                    bundle.putString("Duracao", filmes.get(5).getDuracao());
                    bundle.putString("Nota", filmes.get(5).getNota());
                    bundle.putInt("Descricao", filmes.get(5).getDescricao());
                    bundle.putString("Trailer", filmes.get(5).getTrailer());
                    bundle.putInt("Poster", filmes.get(5).getImageAddress());
                    Intent intent = new Intent(MainActivity.this, Detalhes.class);
                    startActivity(intent.putExtras(bundle));
                }
                if (v.getId() == R.id.filme1) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", filmes.get(0).getTitulo());
                    bundle.putString("Ano", filmes.get(0).getAno());
                    bundle.putString("Duracao", filmes.get(0).getDuracao());
                    bundle.putString("Nota", filmes.get(0).getNota());
                    bundle.putInt("Descricao", filmes.get(0).getDescricao());
                    bundle.putString("Trailer", filmes.get(0).getTrailer());
                    bundle.putInt("Poster", filmes.get(0).getImageAddress());
                    Intent intent = new Intent(MainActivity.this, Detalhes.class);
                    startActivity(intent.putExtras(bundle));
                }
            }
        };

        for(int i=0; i<filmes.size(); i++){
            posters.get(i).setOnClickListener(listener);
        }
    }
}
