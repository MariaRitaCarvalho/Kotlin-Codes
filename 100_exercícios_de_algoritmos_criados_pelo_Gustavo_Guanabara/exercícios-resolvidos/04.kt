/*
Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13
*/

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
    println("A soma entre $num1 e $num2 é ${"%.2f".format(soma)}")
}
