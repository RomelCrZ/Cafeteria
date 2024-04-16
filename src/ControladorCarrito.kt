class ControladorCarrito {
    private val carrito = Carrito()


    fun agregarItemAlCarrito(item: ItemCarrito) {
        carrito.agregarItem(item)
    }

    fun eliminarItemDelCarrito(nombre: String) {
        carrito.eliminarItem(nombre)
    }


    fun calcularPrecioTotalDelCarrito(): Double {
        return carrito.calcularPrecioTotal()
    }


    fun obtenerListaDeItemsDelCarrito(): List<ItemCarrito> {
        return carrito.obtenerListaDeItems()
        
    }
}

private fun Carrito.obtenerListaDeItems(): List<ItemCarrito> {

}

fun main() {
    val controlador = ControladorCarrito()


    controlador.agregarItemAlCarrito(ItemCarrito("Café", 2.5, 2))
    controlador.agregarItemAlCarrito(ItemCarrito("Galletas", 1.0, 3))


    println("Items en el carrito:")
    controlador.obtenerListaDeItemsDelCarrito().forEach { println("${it.nombre} - Cantidad: ${it.cantidad} - Precio Unitario: $${it.precio} - Precio Total: $${it.calcularPrecioTotal()}") }


    println("Precio total del carrito: $${controlador.calcularPrecioTotalDelCarrito()}")


    controlador.eliminarItemDelCarrito("Café")


    println("Items en el carrito después de eliminar un item:")
    controlador.obtenerListaDeItemsDelCarrito().forEach { println("${it.nombre} - Cantidad: ${it.cantidad} - Precio Unitario: $${it.precio} - Precio Total: $${it.calcularPrecioTotal()}") }
}