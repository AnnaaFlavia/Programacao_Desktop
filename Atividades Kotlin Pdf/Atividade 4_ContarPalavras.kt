fun main() {
    print("Digite um texto: ")
    val texto = readln().lowercase()

    print("Digite a palavra a ser contada: ")
    val palavra = readln().lowercase()

    val palavras = texto.split(" ")
    val contagem = palavras.count { it == palavra }

    println("A palavra '$palavra' apareceu $contagem vezes.")
}
