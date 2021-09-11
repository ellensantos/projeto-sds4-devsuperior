package br.com.devsuperior.ellensantos.dsvendas.repositories;

import br.com.devsuperior.ellensantos.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EllenTex
 */
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
