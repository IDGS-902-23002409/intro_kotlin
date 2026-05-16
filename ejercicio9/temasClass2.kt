class Persona {
    var nombre: String = ""
    var edad: int = 0

    fun inicializador(nombre: String, edad: int) {
        this.nombre = nombre
        this.edad = edad
    }
    fun imprimir() {
        println("Nombre:$nombre y tiene una edad de $edad")
    }
    fun esMayorEdad() {
        if (edad >= 18) println("Es mayor de edad $nombre")
        else println("No es mayor de edad $nombre")
    }
}
fun main(parametro: Array<String>) {
    val persona1: Persona
    persona1 = Persona()
    persona1.inicializar("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()
    val persona2: Persona
}