package de.thkoeln.fcappv3.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import de.thkoeln.fcappv3.R
import de.thkoeln.fcappv3.adapters.OverviewGridAdapter
import de.thkoeln.fcappv3.data.services.CardService
import kotlinx.android.synthetic.main.activity_overview.*
import android.support.v4.app.ActivityOptionsCompat
import android.view.View
import kotlinx.android.synthetic.main.card_grid_item.*


class OverviewActivity : AppCompatActivity() {

    private var cards = ArrayList(CardService.getAllCards())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overview)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = OverviewGridAdapter(cards, { Int -> cardClicked(Int) })

    }

    private fun cardClicked(pos: Int) {
        val intent = Intent(this@OverviewActivity, DetailActivity::class.java)
        intent.putExtra("CARD", cards)
        intent.putExtra("POSITION", pos)
        startActivity(intent)
    }
}
