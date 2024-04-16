class Cliente(
    val nombre: String,
    val apellido: String,
    val edad: Int,
    val correo: String,
    val telefono: String
) {

    fun imprimirDetalles() {
        println("Nombre: $nombre $apellido")
        println("Edad: $edad")
        println("Correo: $correo")
        println("Teléfono: $telefono")
    }
}

fun main() {

    val cliente1 = Cliente("Juan", "Pérez", 30, "juan@example.com", "123456789")


    println("Detalles del Cliente:")
    cliente1.imprimirDetalles()
}
