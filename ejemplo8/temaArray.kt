/* 
---tipo--  ---arreglo---
int        IntArray
double     DoubleArray
float      FloatArray
string     Array<String>
char       CharArray
*/



fun main(){
    val numeros = arrayOf(1, 2, 3, 4, 5)
    println("Primer elemento: ${numeros[0]}")

    val nombres = arrayOf("Alice", "Bob", "Charlie")
    println("Segundo nombre: ${nombres[1]}")

    val frutas = arrayOf("Manzana", "Banana", "Cereza")
    for (fruta in frutas) {
        println(fruta)
    }

    val numeros = Array<Int>(5){0}

    val matriz = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    println("Elemento en la fila 1, columna 2: ${matriz[0][1]}")
}