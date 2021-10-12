class GameResult (var player1: String, var scoreplayer1: String,
                  var player2 : String, var scoreplayer2: String) {
    lateinit var score: String

    //Rule sebagai hasil menentukan pemenang
    fun cek () {
        if (scoreplayer1 == "KERTAS" && scoreplayer2 == "KERTAS") {
            score = "DRAW"
        }
        if (scoreplayer1 == "GUNTING" && scoreplayer2 == "GUNTING") {
            score = "DRAW"
        }
        if (scoreplayer1 == "BATU" && scoreplayer2 == "BATU") {
            score = "DRAW"
        }
        if (scoreplayer1 == "KERTAS" && scoreplayer2 == "BATU") {
            score = player1
        }
        if (scoreplayer1 == "GUNTING" && scoreplayer2 == "KERTAS") {
            score = player1
        }
        if (scoreplayer1 == "BATU" && scoreplayer2 == "GUNTING") {
            score = player2
        }
        if (scoreplayer1 == "BATU" && scoreplayer2 == "KERTAS") {
            score = player2
        }
        if (scoreplayer1 == "KERTAS" && scoreplayer2 == "GUNTING") {
            score = player2
        }
        if (scoreplayer1 == "GUNTING" && scoreplayer2 == "BATU") {
            score = player2
        }
    }
}