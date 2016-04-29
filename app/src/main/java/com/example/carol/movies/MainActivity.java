package com.example.carol.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

import Entity.Movie;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Movie> filmes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filmes = new ArrayList<>();
        filmes.add(new Movie("American Psycho", "2000", "1h 42min", "7,6", "https://www.youtube.com/watch?v=5YnGhW4UEhc", R.string.americansinopse,  R.drawable.american));
        filmes.add(new Movie("Precisamos falar sobre o Kevin", "2011", "1h 52min", "7,5", "https://www.youtube.com/watch?v=ZLRgAe2jLaw", R.string.kevinsinopse,  R.drawable.kevin));
        filmes.add(new Movie("Hannibal", "2001", "2h 11min", "6,8", "https://www.youtube.com/watch?v=eHSYth2wSEk", R.string.hannibalsinopse,  R.drawable.hannibal));
        filmes.add(new Movie("O dragão vermelho", "2002", "2h 4min", "7,2", "https://www.youtube.com/watch?v=f_Iq18xpC6k", R.string.redragonsinopse,  R.drawable.reddragon));
        filmes.add(new Movie("O silêncio dos inocentes", "1991", "1h 58min", "8,6", "https://www.youtube.com/watch?v=lQKs169Sl0I", R.string.silenciosinopse,  R.drawable.silencio));
        filmes.add(new Movie("León: the professional", "1994", "1h 50min", "8,6", "https://www.youtube.com/watch?v=DcsirofJrlM", R.string.leonsinopse,  R.drawable.leon));
    }
}
