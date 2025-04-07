fun main(){
    var gato = Gato()
    gato.nome = "Gato"
    gato.dieta = "Peixe"
    gato.habitat = "Apartamento"
    gato.especie = "Felino"

    println(gato.nome)
    println(gato.somAnimal())

    var cachorro = Cachorro()
    cachorro.nome = "Cachorro"
    cachorro.dieta = "Gato"
    cachorro.habitat = "Canil"
    cachorro.especie = "Canino"

    var passaro = Passaro()
    passaro.nome = "Pássaro"
    passaro.dieta = "Frutas"
    passaro.habitat = "Gaiola"
    passaro.especie = "Ave"
    println(passaro.nome)
    println(passaro.somAnimal())

    println(cachorro.nome)
    println(cachorro.somAnimal())

    val lista = listOf<Animal>(gato, cachorro)
    println("LISTA: ${lista.first().somAnimal()}")

}