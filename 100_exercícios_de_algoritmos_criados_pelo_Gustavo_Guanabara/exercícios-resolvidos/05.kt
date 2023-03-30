/*
Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
*/

fun main() {
    print("Nota 1: ")
    val nota1 = readLine()!!.toDouble()
    print("Nota 2: ")
    val nota2 = readLine()!!.toDouble()
    
    val media = (nota1 + nota2)/2
    println("A média entre $nota1 e $nota2 é $media")
}

/*
Algoritmo semelhante com o da questão anterior

Aqui está o código mais trabalhado:

fun main() {
    print("Nota 1: ")
    val nota1 = readLine()?.toDoubleOrNull()
    if (nota1 == null) {
        println("Valor inválido inserido para a primeira nota.")
        return
    }
    print("Nota 2: ")
    val nota2 = readLine()?.toDoubleOrNull()
    if (nota2 == null) {
        println("Valor inválido inserido para a primeira nota.")
        return
    }
    
    val media = (nota1 + nota2) / 2
    println("A média entre $nota1 e $nota2 é ${"%.2f".format(media)}")
}

*/
