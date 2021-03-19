package api.collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    for (salario in salarios){
        println(salario)
            }
    println("-----------------")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Media salario: ${salarios.average()}")

    val salariosMaiorQue2000 = salarios.filter { it > 2000.0 }
    println("----------------")
    salariosMaiorQue2000.forEach {println(it)}



    println("-----------------")
    println(salarios.count { it in 2000.0..4000.0 })


    println("----------------")
    println(salarios.find {it == 2250.0 })
    println(salarios.find {it == 5000.0 })

    println("----------------")
    println(salarios.find {it == 2250.0 })


    println("----------------")
    println(salarios.any {it == 2250.0 })
    println(salarios.any {it == 225.0 })

}