package application

import domain.Cliente
import infra.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ClienteService (
    @Autowired
    private var clienteRepository: ClientRepository
){
    fun save(cliente: Cliente): Cliente {
        return clienteRepository.save(cliente)
    }

    fun getClienteByID(id: Long): Optional<Cliente> {
        return clienteRepository.findById(id)
    }
}