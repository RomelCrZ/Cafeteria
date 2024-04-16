class ControladorCafes {
    private val compras = mutableListOf<CafeComprado>()


    fun agregarCompra(cafe: CafeComprado) {
        compras.add(cafe)
        println("Compra de café agregada correctamente.")
    }


    fun buscarComprasPorTipo(tipo: String): List<CafeComprado> {
        return compras.filter { it.tipo.equals(tipo, ignoreCase = true) }
    }


    fun imprimirTodasLasCompras() {
        println("Lista de Compras de Café:")
        compras.forEachIndexed { index, cafe ->
            println("Compra ${index + 1}:")
            cafe.imprimirDetalles()
            println()
        }
    }
}

fun main() {
    val controladorCafes = ControladorCafes()


    controladorCafes.agregarCompra(CafeComprado("Espresso", "Grande", 2, 2.5))
    controladorCafes.agregarCompra(CafeComprado("Latte", "Mediano", 1, 3.0))
    controladorCafes.agregarCompra(CafeComprado("Cappuccino", "Grande", 3, 3.5))


    controladorCafes.imprimirTodasLasCompras()


    val comprasDeEspresso = controladorCafes.buscarComprasPorTipo("Espresso")
    println("Compras de Espresso:")
    comprasDeEspresso.forEach { it.imprimirDetalles() }
}