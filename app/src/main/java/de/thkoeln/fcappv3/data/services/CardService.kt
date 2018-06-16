package de.thkoeln.fcappv3.data.services

import de.thkoeln.fcappv3.data.models.Card
import de.thkoeln.fealesschange.data.repositories.CardData.CARDS


/**
 * Created by florianherborn on 30.04.18.
 */
object CardService {

    fun getCountOfCards(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getCardById(id: Long): Card {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getAllCards(): List<Card> = CARDS

}