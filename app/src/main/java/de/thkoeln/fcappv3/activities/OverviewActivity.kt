package de.thkoeln.fcappv3.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import de.thkoeln.fcappv3.R
import de.thkoeln.fcappv3.adapters.OverviewGridAdapter
import de.thkoeln.fcappv3.data.services.CardService
import de.thkoeln.fcappv3.models.Card
import kotlinx.android.synthetic.main.activity_overview.*

class OverviewActivity : AppCompatActivity() {

    private var cards = ArrayList(CardService.getAllCards())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overview)

        recyclerView.layoutManager = GridLayoutManager(this,  2)
        recyclerView.adapter = OverviewGridAdapter(cards, {card : Card -> cardClicked(card)})

    }

    private fun cardClicked(card: Card){
        val intent = Intent(this@OverviewActivity, DetailActivity::class.java)
        intent.putExtra("CARD", cards)
        startActivity(intent)
    }
}
