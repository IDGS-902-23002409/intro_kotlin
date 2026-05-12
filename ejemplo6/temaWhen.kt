fun main(parametro : Array<String>){
    println("Ingrese coordenadas x del punto:")
    val x = readLine()!!.toDouble()
    println("Ingrese coordenadas y del punto:")
    val y = readLine()!!.toDouble()
    when {
        x > 0 && y > 0 -> println("El punto ($x, $y) esta en el primer cuadrante")
        x < 0 && y > 0 -> println("El punto ($x, $y) esta en el segundo cuadrante")
        x < 0 && y < 0 -> println("El punto ($x, $y) esta en el tercer cuadrante")
        x > 0 && y < 0 -> println("El punto ($x, $y) esta en el cuarto cuadrante")
        else -> println("El punto ($x, $y) esta sobre uno de los ejes coordenados")
    }
}