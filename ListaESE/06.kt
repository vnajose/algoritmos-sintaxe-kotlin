fun main() {
    print("Digite o raio do círculo: ")
    val raio = readLine()!!.toDouble()
    
    val area = Math.PI * raio * raio

    println("A área do círculo é: %.2f".format(area))
}