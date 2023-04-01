/*
Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 185.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm
*/

fun main() {
    print("Digite uma distância em metros: ")
    val dist = readLine()!!.toDoubleOrNull()
    if (dist == null) {
        println("distância invalida")
        return
    }
    val km = dist / 1000
    val hm = dist / 100
    val dam = dist / 10
    val dm = dist * 10
    val cm = dist * 100
    val mm = dist * 1000

    println("A distância $dist m corresponde a:\n $km km\n $hm hm\n $dam dam\n $dm dm\n $cm cm\n $mm mm")
}