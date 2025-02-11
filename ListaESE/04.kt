fun main() {
    println("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()
    
    println("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()
    
    println("Digite a terceira nota: ")
    val nota3 = readLine()!!.toDouble()
    
    println("Digite a quarta nota: ")
    val nota4 = readLine()!!.toDouble()
    
    val media = (nota1 + nota2 + nota3 + nota4) / 4
    
    println("A média das notas é: $media")
}

