package models

import controllers.players.PlayerController
import models.tiles.Hand

data class Player(
    /** Name of the player */
    val name: String = "Unnamed",
    /** The controller for this player */
    val playerController: PlayerController,
    /** The hand for this player | DO NOT SET THIS IT WILL DRAW TILES AUTOMATICALLY */
    val hand: Hand = Hand(listOf()),
    /** The score for this player */
    var score: Int = 0
) {
    var exchangeStreak = 0

    fun gameEnd() {
        score -= hand.pieces.sumOf { it.value }
    }

    fun isHandEmpty(): Boolean {
        return hand.isEmpty()
    }
}