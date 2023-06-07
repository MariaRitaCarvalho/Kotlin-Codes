// Faça um programa que calcule a sequência de Fibonacci.

fun main() {
    print("Digite o número de termos da sequência de Fibonacci que você deseja calcular: ")
    val n = readLine()?.toIntOrNull() ?: 0

    var a = 0
    var b = 1

    print("Sequência de Fibonacci: $a ")

    for (i in 2..n) {
        print("$b ")
        val nextNumber = a + b
        a = b
        b = nextNumber
    }
}
