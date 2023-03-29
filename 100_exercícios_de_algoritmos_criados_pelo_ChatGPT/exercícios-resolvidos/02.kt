// Faça um programa que some dois números.

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()?.toDoubleOrNull()
    if (num1 == null) {
        println("Valor inválido inserido para o primeiro número.")
        return
    }
    print("Digite o segundo número: ")
    val num2 = readLine()?.toDoubleOrNull()
    if (num2 == null) {
        println("Valor inválido inserido para o segundo número.")
        return
    }
    val soma = num1 + num2
    println("A soma de $num1 e $num2 é $soma")
}
