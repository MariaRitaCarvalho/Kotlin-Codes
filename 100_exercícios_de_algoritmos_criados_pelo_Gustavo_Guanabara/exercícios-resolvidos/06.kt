/*
Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
*/

fun main() {
    print("Digite um número inteiro: ")
    val num = readLine()?.toLongOrNull()
    if (num == null) {
        println("Valor inválido inserido.")
        return
    }
    
    val antecessor = num - 1
    val sucessor = num + 1
    
    println("O antecessor de $num é $antecessor")
    println("O sucessor de $num é $sucessor")
}
