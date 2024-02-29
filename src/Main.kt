//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun <T> reverse(objeto:List<T>): List<T> {
    var lista1 = emptyList<T>().toMutableList()
    objeto.forEach { lista1.add(it) }
    lista1.reverse()
    return lista1.toList()
}
fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)

    //Realiza la misma prueba, pero con listas de otros tipos de datos...
    var numbers1 = listOf(1,2,3,4)
    var numbersRev1 = reverse(numbers1)
    if (!listOf(1,2,3,4).equals(numbersRev1))
        println("Error")
    else
        println("Correcto")
    println(numbersRev1)
    //por ejemplo una lista que combine valores numéricos Int, Float y Double
    var numbers2 = listOf(1,2.0f,2.0,2)
    var numbersRev2 = reverse(numbers2)
    if (!listOf(1,2.0f,2.0,2).equals(numbersRev2))
        println("Error")
    else
        println("Correcto")
    println(numbersRev2)
    //Otra con una lista de cualquier data class que te inventes.
    var numbers4 = listOf("one", "two", "three", "four")
    var numbersRev4 = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev4))
        println("Error")
    else
        println("Correcto")
    println(numbersRev4)
    //Comprueba también si podemos hacerlo con una lista de tipos de datos distintos...
    //por ejemplo con una lista que contenga tipos de datos String, Int, Float, Usuario("Pepe", 30), Boolean...
    //¿Por qué es posible usarla si parece que la lista contiene tipos de datos diferentes?
}