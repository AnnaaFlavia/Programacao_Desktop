open class Racao(var preco: Double, val peso: Double, val sabor: String) {
    open fun desconto() {
        preco *= 0.90
    }
}

class RacaoDeGato(preco: Double, peso: Double, sabor: String, val paraCastrado: Boolean, val ricaEmFerro: Boolean) :
    Racao(preco, peso, sabor) {
    override fun desconto() {
        preco *= if (paraCastrado) 0.85 else 0.80
    }
}

class RacaoDeCachorro(preco: Double, peso: Double, sabor: String, val fortalecimentoDePelos: Boolean, val pedacosComCarne: Boolean) :
    Racao(preco, peso, sabor) {
    override fun desconto() {
        preco *= if (pedacosComCarne) 0.95 else 0.75
    }
}
