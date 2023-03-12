import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val pop = scanner.nextInt().toDouble()
    val dep = Math.cbrt(pop).toInt()
    println(dep)
}