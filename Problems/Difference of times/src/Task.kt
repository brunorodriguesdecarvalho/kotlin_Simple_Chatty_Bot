import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextInt()
    val m1 = scanner.nextInt()
    val s1 = scanner.nextInt()
    val h2 = scanner.nextInt()
    val m2 = scanner.nextInt()
    val s2 = scanner.nextInt()

    val t1 = (h1*60*60) + (m1*60) + s1
    val t2 = (h2*60*60) + (m2*60) + s2

    val dif = t2-t1
    println(dif)
}