fun main() {
    val nomes = mutableListOf<String>()
    val regex = Regex("^[a-zA-Z]+$")

    while (true) {
        print("Digite um nome (ou 'sair' para terminar): ")
        val entrada = readln()

        if (entrada.lowercase() == "sair") break

        if (regex.matches(entrada)) {
            nomes.add(entrada)
        } else {
            println("Digite apenas letras!")
        }
    }

    nomes.sort()
    println("Nomes em ordem alfabética:")
    for (nome in nomes) {
        println(nome)
    }
}
