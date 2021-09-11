package br.com.devsuperior.ellensantos.dsvendas.repositories;

import br.com.devsuperior.ellensantos.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EllenTex
 */
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
