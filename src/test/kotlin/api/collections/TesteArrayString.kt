package api.collections

fun main(){
    val  nomes = Array(3) {""}

    nomes[0]= "maria"
    nomes [1]= "joao"
    nomes [2]= "Jose"

    for (nome in nomes) {
        println(nomes)
    }
    println("--------------------")
        nomes.sort()
    nomes.forEach {println(it)}

    val nomes2 = arrayOf("maria", "joao", "pedro")
    nomes2.sort()
    nomes.forEach {println(it)}


}

