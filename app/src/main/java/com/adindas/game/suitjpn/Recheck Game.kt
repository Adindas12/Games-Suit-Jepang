fun tryagain(): Boolean {
    lateinit var tryagain: String
    var score: Boolean = true
    do {
        print("Do you want to try again? (Yes/No)")
        tryagain = readLine().toString().uppercase()
        when(tryagain) {
            "Yes" -> score = true
            "No" -> score = false
            else -> println("Try Agian!! Please Re-enter (Yes / No)")
        }
        //Akan terus di ulang sampai inputan sesuai kriteria yaitu Yes / No
    }while (tryagain!= "Yes" && tryagain!= "No")
    return score
}