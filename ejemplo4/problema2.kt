/*  
Problema2 : Una bateria comienza con \(0\%)\) de carga. Un cargador añade un 15\%)\) cada 
minuto. Se debe contener el ciclo cuando la carga llegue o supere el 100\%).    
*/
fun main(){
    var carga = 0.0
    while (carga < 100.0) {
        println("Carga actual: $carga%")
        carga += 15.0
    }
    println("Carga final: $carga% - La bateria esta completamente cargada.")
}