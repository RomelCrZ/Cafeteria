class CafeComprado(
    val tipo: String,
    val tamano: String,
    val cantidad: Int,
    val precioUnitario: Double
) {

    fun calcularPrecioTotal(): Double {
        return cantidad * precioUnitario
    }


    fun imprimirDetalles() {
        println("Tipo: $tipo")
        println("Tamaño: $tamano")
        println("Cantidad: $cantidad")
        println("Precio Unitario: $$precioUnitario")
        println("Precio Total: $${calcularPrecioTotal()}")
    }
}

fun main() {

    val compraCafe = CafeComprado("Espresso", "Grande", 2, 2.5)


    println("Detalles de la compra de café:")
    compraCafe.imprimirDetalles()
}
