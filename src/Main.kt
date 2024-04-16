fun main() {

    var tipo: String
    var tamano: String
    var cantidad: Int
    var precioUnitario: Double


    while (true) {
        println("\n--- Menú de Café Comprado ---")
        println("1. Agregar una compra de café")
        println("2. Salir")
        print("Seleccione una opción: ")


        val opcion = readLine() ?: ""

        when (opcion) {
            "1" -> {

                println("\nIngrese los detalles de la compra de café:")
                print("Tipo: ")
                tipo = readLine()!!
                print("Tamaño: ")
                tamano = readLine()!!
                print("Cantidad: ")
                cantidad = readLine()?.toInt() ?: 0
                print("Precio Unitario: ")
                precioUnitario = readLine()?.toDouble() ?: 0.0


                val cafe = CafeComprado(tipo, tamano, cantidad, precioUnitario)
                println("\nDetalles de la compra de café:")
                cafe.imprimirDetalles()
            }
            "2" -> {
                println("Saliendo del menú.")
                break
            }
            else -> println("Opción no válida. Por favor, seleccione una opción válida.")
        }
    }
}