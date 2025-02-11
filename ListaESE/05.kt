fun main() {
    print("Digite o valor em metros: ")
    val metros = readLine()!!.toDouble()
    
    val centimetros = metros * 100
    
    println("$metros metros é igual a $centimetros centímetros.")
}

