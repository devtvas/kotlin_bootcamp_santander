package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //values
    println("-------------------------")
    for (valor in values) {
        println(valor)
    }

    //values
    println("-------------------------")
    values.forEach {
        println(it)
    }

    //values
    println("-------------------------")
    values.forEach { valor ->
        println(valor)
    }

    //valor x index
    println("-------------------------")
    for (index in values.indices) {
        println(values[index])
    }

    //retorno index
    println("-------------------------")
    for (index in values.indices) {
        println(index)
    }

    //valor x index em (ordem crescente)
    println("-------------------------")
    values.sort()
    for (index in values.indices) {
        println(values[index])
    }
}