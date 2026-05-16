fun cargar(arreeglo: IntArray){
    for(i in arreglo.indices){
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
}

for imprimit(arreglo: IntArray){
    for(elemento in arreglo)
        println(elemento)
}

fun main ( parametro : Array<String>){
    var arre = IntArray(5)
    cargar(arre)
}