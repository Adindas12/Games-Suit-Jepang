fun validator(scoreplayer:String): Boolean {
    return if (scoreplayer != "KERTAS" && scoreplayer != "GUNTING" &&
        scoreplayer != "BATU") {
        println("")
        println("EXPLANATION")
        println("Wrong!! Please input with (KERTAS / GUNTING / BATU)")
        println("Please Try Again")
        println("")
        false
    }else {
        true
    }
}