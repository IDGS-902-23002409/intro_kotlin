/*
--Suma de 2 matrices 3x3 kotlin---
Crea un programa que permita la usuario ingresar por teclado los valores de matrices del tamaño 3x3, luego sume ambas matrices y muestre el resultado en pantalla. Utiliza arreglos bidimensionales para representar las matrices.
posteriormente realizar la suma de ambas matrices,
mostrando el resultado en pantalla.

--Explicacion del programa---
Se crean 3 matrices:
    - matriz1: para almacenar los valores de la primera matriz ingresada por el usuario.
    - matriz2: para almacenar los valores de la segunda matriz ingresada por el usuario.
    - resultado: para almacenar los resultados de la suma de las dos matrices.

*/

fun main()
{
    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val resultado = Array(3) { IntArray(3) }

    println("Ingrese los valores de la primera matriz (3x3):")
    for (i in 0..2) {
        for (j in 0..2) {
        print("Elemento [$i][$j]: ")
        matriz1[i][j] = readLine()!!.toInt()
        }
    }

    println("Ingrese los valores de la segunda matriz (3x3):")
    for (i in 0..2) {
        for (j in 0..2) {
        print("Elemento [$i][$j]: ")
        matriz2[i][j] = readLine()!!.toInt()
        }
    }
    for (i in 0..2) {
        for (j in 0..2) {
        resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }
    println("Resultado de la suma de las dos matrices:")
    for (i in 0..2) {
        for (j in 0..2) {
        print("${resultado[i][j]} ")
        }
        println()
    }
}