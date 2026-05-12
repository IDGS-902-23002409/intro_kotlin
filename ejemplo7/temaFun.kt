fun limpiarPantalla() {
    ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
}

fun main(){
    limpiarPantalla()
    println("Ingrese primer valor")
    val valor1 = readLine()!!.toDouble()
    println("Ingrese segundo valor")
    val valor2 = readLine()!!.toDouble()
    println("Ingrese tercer valor")
    val valor3 = readLine()!!.toDouble()

    mostrarMayor(valor1, valor2, valor3)
}