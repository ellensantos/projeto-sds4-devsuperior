package br.com.devsuperior.ellensantos.dsvendas.services;

import br.com.devsuperior.ellensantos.dsvendas.dto.SellerDTO;
import br.com.devsuperior.ellensantos.dsvendas.entities.Seller;
import br.com.devsuperior.ellensantos.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author EllenTex
 */
@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
