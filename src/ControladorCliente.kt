class ControladorClientes {
    private val clientes = mutableListOf<Cliente>()


    fun agregarCliente(cliente: Cliente) {
        clientes.add(cliente)
        println("Cliente agregado correctamente.")
    }


    fun buscarClientePorCorreo(correo: String): Cliente? {
        return clientes.find { it.correo == correo }
    }


    fun imprimirTodosLosClientes() {
        println("Lista de Clientes:")
        clientes.forEach { it.imprimirDetalles() }
    }
}

fun main() {
    val controladorClientes = ControladorClientes()


    controladorClientes.agregarCliente(Cliente("Juan", "Pérez", 30, "juan@example.com", "123456789"))
    controladorClientes.agregarCliente(Cliente("María", "López", 25, "maria@example.com", "987654321"))


    controladorClientes.imprimirTodosLosClientes()


    val clienteBuscado = controladorClientes.buscarClientePorCorreo("juan@example.com")
    if (clienteBuscado != null) {
        println("Cliente encontrado:")
        clienteBuscado.imprimirDetalles()
    } else {
        println("Cliente no encontrado.")
    }
}