fun  main(){
    var x= 1
    while(x <= 10){
        println("Valor de x: $x")
        x+=1
    }

    var cantidad = 0
    var suma = 0.0
    do {
        println("Ingrese un numero (0 para terminar):")
        val numero = readLine()!!.toDouble()
        if (numero != 0.0) {
            suma += numero
            cantidad++
        }
    } while (numero != 0.0)
    if (cantidad != 0) {
        val promedio = suma / cantidad
        println("El promedio de los numeros ingresados es: $promedio")
    } else {
        println("No se ingresaron numeros.")
    }
}