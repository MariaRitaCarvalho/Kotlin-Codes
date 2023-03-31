// Faça um programa que exiba a tabuada de um número.

fun main() {
    print("Digite um número para ver a tabuada: ")
    val num = readLine()?.toInt()
    
    for (i in 1..10) {
        val total = num?.times(i)
        println("$num x $i = $total")
    }
}
