package com.adindas.game.suitjpn

import GameResult
import Player
import tryagain

fun main(){
    val player1 = Player("player1")
    val player2 = Player("player2")

    do {
        //Tampilan Header Games
        println("========================================")
        println("GAMES PAPER SCISSORS ROCK KOTLIN VERSION")
        println("========================================")

        //INPUTAN PEMAIN
        //INPUT PLAYER1
        player1.input()

        //INPUT PLAYER2
        player2.input()

        //mengecheck kembali siapa pemenangnya denga fungsi yang ada di class recheck
        val GameResult = GameResult (player1.name, player1.score,player2.name, player2.score)
        GameResult.cek()
    }while (tryagain()==true)
}