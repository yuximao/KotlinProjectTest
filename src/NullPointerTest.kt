
fun main(args: Array<String>) {

    val myFavoriteSong : String? = null

    try {
        println(myFavoriteSong!!.length)
    }
    catch (e : NullPointerException) {
        println("Null song value")
    }

    println("Str length is: ${myFavoriteSong?.length ?: "Null song value"}")

}