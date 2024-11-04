package application

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("clientes")
class ClientesResource {

    @GetMapping
    fun status(): String{
        return "OK clientes"
    }
}