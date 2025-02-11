fun main() {
    print("Digite o comprimento do lado do quadrado: ")
    val lado = readLine()!!.toDouble()

    val area = lado * lado

    val dobroArea = area * 2

    println("A área do quadrado é: $area")
    println("O dobro da área do quadrado é: $dobroArea")
}