class ItemCarrito(
    val nombre: String,
    val precio: Double,
    var cantidad: Int
) {

    fun calcularPrecioTotal(): Double {
        return precio * cantidad
    }
}

class Carrito {
    private val items = mutableListOf<ItemCarrito>()


    fun agregarItem(item: ItemCarrito) {
        items.add(item)
        println("${item.nombre} agregado al carrito.")
    }


    fun eliminarItem(nombre: String) {
        val item = items.find { it.nombre == nombre }
        if (item != null) {
            items.remove(item)
            println("$nombre eliminado del carrito.")
        } else {
            println("$nombre no se encontró en el carrito.")
        }
    }


    fun calcularPrecioTotal(): Double {
        return items.sumByDouble { it.calcularPrecioTotal() }
    }


    fun imprimirItems() {
        if (items.isEmpty()) {
            println("El carrito está vacío.")
        } else {
            println("Items en el carrito:")
            items.forEachIndexed { index, item ->
                println("${index + 1}. ${item.nombre} - Cantidad: ${item.cantidad} - Precio Unitario: $${item.precio} - Precio Total: $${item.calcularPrecioTotal()}")
            }
        }
    }
}

fun main() {
    val carrito = Carrito()


    carrito.agregarItem(ItemCarrito("Café", 2.5, 2))
    carrito.agregarItem(ItemCarrito("Galletas", 1.0, 3))


    carrito.imprimirItems()


    println("Precio total del carrito: $${carrito.calcularPrecioTotal()}")


    carrito.eliminarItem("Café")


    carrito.imprimirItems()
}
