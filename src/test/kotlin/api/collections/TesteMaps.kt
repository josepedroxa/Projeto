package api.collections
fun main () {
    val pair: Pair<String, Double> = Pair("joao,", 1000.0)
    val mapi = mapOf(pair)

    mapi.forEach { k, v -> println("Chave: $k - valor: $v") }

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0

    )
    map2.forEach { (k, v) ->
        println("Chave: $k, -Valor: $v")


    }

}


