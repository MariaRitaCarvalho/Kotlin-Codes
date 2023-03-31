/*
Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666
*/

fun main() {
    print("Digite um número: ")
    val num = readLine()?.toDouble()
    var dobro = num?.times(2)
    println("O dobro de $num é $dobro")
    var tParte = num?.div(3)
    println("A terça parte de $num é ${"%.2f".format(tParte)}")
}
