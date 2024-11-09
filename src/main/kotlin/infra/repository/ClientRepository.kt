package infra.repository

import domain.Cliente
import org.bouncycastle.util.Longs
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository : JpaRepository<Cliente, Long> {
}