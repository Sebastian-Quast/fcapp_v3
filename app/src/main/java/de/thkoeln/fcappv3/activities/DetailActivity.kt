package de.thkoeln.fcappv3.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import de.thkoeln.fcappv3.R
import de.thkoeln.fcappv3.adapters.CardDetailPagerAdapter
import de.thkoeln.fcappv3.data.models.Card
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    private lateinit var cards : ArrayList<Card>
    private var pos : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        @SuppressWarnings("unchecked")
        cards = intent.getSerializableExtra("CARD") as ArrayList<Card>
        pos = intent.getSerializableExtra("POSITION") as Int

        viewPager.adapter = CardDetailPagerAdapter(supportFragmentManager, cards)
        viewPager.currentItem = pos
    }
}
