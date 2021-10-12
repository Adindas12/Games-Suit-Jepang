class Player (var Playername: String {
    var name: String = Playername
    lateinit var score: String

    fun input() {
        do {
            print("Imput option $name: ")
            score = readLine().toString().uppercase()

            //Menge-check apakah inputan sudah benar
            //Pemain hanya dapat meng-input : Kertas, Gunting atau Batu
            //Jika pemain salah meng-input maka imputan harus di ulang kembali
            val valid = validator(score)
        } while (!valid)
    }
}