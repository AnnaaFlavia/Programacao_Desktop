class Notas {
    val notas = mutableListOf<Double>()

    fun media(): Double {
        return if (notas.isEmpty()) 0.0 else notas.sum() / notas.size
    }
}

class Restaurante(val nome: String, val endereco: String, val especialidade: String) {
    val nota = Notas()
}

class Cliente(val nome: String) {
    fun avaliar(restaurante: Restaurante, nota: Double) {
        restaurante.nota.notas.add(nota)
    }
}

fun main() {
    val r1 = Restaurante("Bom Sabor", "Rua A", "Italiana")
    val c1 = Cliente("João")
    val c2 = Cliente("Maria")

    c1.avaliar(r1, 8.0)
    c2.avaliar(r1, 9.0)

    println("Média de notas do restaurante ${r1.nome}: ${r1.nota.media()}")
}
