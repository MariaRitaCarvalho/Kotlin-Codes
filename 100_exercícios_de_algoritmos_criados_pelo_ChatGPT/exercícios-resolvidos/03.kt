// Faça um programa que calcule a média de três números.

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
        println("Valor inválido inserido para a segunda nota.")
        return
    }
    print("Nota 3: ")
    val nota3 = readLine()?.toDoubleOrNull()
    if (nota3 == null) {
        println("Valor inválido inserido para a terceira nota.")
        return
    }
    
    val media = (nota1 + nota2 + nota3) / 3
    println("A média entre $nota1, $nota2 e $nota3 é ${"%.2f".format(media)}")
} 

// Algoritmo semelhante ao da questão anterior.
