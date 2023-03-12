import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val read = scanner.nextInt()
    val res = read%100/10
    println(res)
}
