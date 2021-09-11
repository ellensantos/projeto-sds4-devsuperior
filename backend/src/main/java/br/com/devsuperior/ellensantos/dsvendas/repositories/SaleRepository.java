package br.com.devsuperior.ellensantos.dsvendas.repositories;

import br.com.devsuperior.ellensantos.dsvendas.dto.SaleSuccessDTO;
import br.com.devsuperior.ellensantos.dsvendas.dto.SaleSumDTO;
import br.com.devsuperior.ellensantos.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author EllenTex
 */
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new br.com.devsuperior.ellensantos.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new br.com.devsuperior.ellensantos.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
