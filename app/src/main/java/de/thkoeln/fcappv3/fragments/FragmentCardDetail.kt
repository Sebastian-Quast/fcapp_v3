package de.thkoeln.fcappv3.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import de.thkoeln.fcappv3.R
import de.thkoeln.fcappv3.data.models.Card
import de.thkoeln.fcappv3.utils.loadUrl

class FragmentCardDetail : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        inflater.inflate(R.layout.card_detail_layout, container, false)

        val view = inflater.inflate(R.layout.card_detail_layout, container, false)

        val imageView = view.findViewById<ImageView>(R.id.card_image)
        val titleTV = view.findViewById<TextView>(R.id.card_detail_title)
        val problemTV = view.findViewById<TextView>(R.id.card_detail_problem)
        val solutionTV = view.findViewById<TextView>(R.id.card_detail_solution)
        val butsTV = view.findViewById<TextView>(R.id.card_detail_buts)

        val card = arguments
        titleTV.text = card?.getString("TITLE")
        problemTV.text = card?.getString("PROBLEM")
        solutionTV.text = card?.getString("SOLUTION")
        butsTV.text = card?.getString("BUTS")

        imageView.loadUrl(card?.getString("IMAGE")?: "")

        return view
    }

    companion object {
        fun newInstance(card:Card) : FragmentCardDetail {
            val args = Bundle()

            args.putString("IMAGE", card.picturePath)
            args.putString("TITLE", card.title)
            args.putString("PROBLEM",card.problem)
            args.putString("SOLUTION",card.solution)
            args.putString("BUTS", card.buts)

            val fragment = FragmentCardDetail()
            fragment.arguments = args
            return fragment
        }
    }

}