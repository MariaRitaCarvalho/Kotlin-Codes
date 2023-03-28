/*
Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
*/

fun main() {
    print("Nome do Funcionário: ")
    val nome = readLine()
    print("Salário: ")
    val salario = readLine()?.toDouble()
    
    if (nome != null && salario != null) {
        println("O funcionário $nome tem um salário de R$ $salario")
    } else {
        println("Dados inválidos")
    }
}
