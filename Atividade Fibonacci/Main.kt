fun main() {
    val n = 10
    val MULTIPLIER = 1_000_000L

    var f = 0L * MULTIPLIER + 1L

    repeat(n) {
        val a = f / MULTIPLIER
        val b = f % MULTIPLIER
        println(a)

        f = b * MULTIPLIER + (a + b)
    }
}
