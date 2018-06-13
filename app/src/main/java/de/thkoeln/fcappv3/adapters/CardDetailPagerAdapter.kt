package de.thkoeln.fcappv3.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import de.thkoeln.fcappv3.fragments.FragmentCardDetail
import de.thkoeln.fcappv3.models.Card

class CardDetailPagerAdapter (fragmentManager: FragmentManager, private val cards: ArrayList<Card>)
    : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return FragmentCardDetail.newInstance(cards[position])
    }


    override fun getCount(): Int {
        return cards.size
    }
}