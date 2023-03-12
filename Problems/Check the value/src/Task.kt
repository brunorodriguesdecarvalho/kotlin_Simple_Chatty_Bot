import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val entrada = scanner.nextInt()
    val esq = 0
    val dir = 10
    val taNoRange = entrada < 10 && entrada > 0
    print(taNoRange)
}