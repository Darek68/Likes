

fun main() {
    print("Введите число лайков: ")
    val likes = readLine()!!.toInt()

    val ending : String = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"

    println("Понравилось $likes $ending.")
}