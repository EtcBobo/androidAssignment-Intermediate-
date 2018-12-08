package chia.androidassignment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val title: TextView = findViewById(R.id.title) as TextView
        title.text = "Venom"
        val overview: TextView = findViewById(R.id.overview) as TextView
        overview.text = "When Eddie Brock acquires the powers of a symbiote, he will have to release his alter-ego Venom to save his life."
        val language: TextView = findViewById(R.id.language) as TextView
        language.text = "English"
        val date: TextView = findViewById(R.id.date) as TextView
        date.text = "03-10-2018"
        val suit: TextView = findViewById(R.id.suit) as TextView
        suit.text = "Yes"
    }


}
