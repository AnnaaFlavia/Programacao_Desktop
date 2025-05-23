import java.util.Calendar

fun main() {
    val frases = listOf(
        "Acorde com determinação.",
        "Você consegue!",
        "Mantenha o foco.",
        "Não desista agora.",
        "Dê o seu melhor!",
        "Você é capaz de tudo.",
        "Continue tentando.",
        "A persistência vence.",
        "Acredite no seu potencial.",
        "Sorria! O dia é seu."
    )

    val hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    val index = hora % frases.size
    println("Mensagem da hora: ${frases[index]}")
}
