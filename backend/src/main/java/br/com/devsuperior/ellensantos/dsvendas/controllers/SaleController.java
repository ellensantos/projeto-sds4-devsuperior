package br.com.devsuperior.ellensantos.dsvendas.controllers;

import br.com.devsuperior.ellensantos.dsvendas.dto.SaleDTO;
import br.com.devsuperior.ellensantos.dsvendas.dto.SellerDTO;
import br.com.devsuperior.ellensantos.dsvendas.services.SaleService;
import br.com.devsuperior.ellensantos.dsvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @author EllenTex
 */
@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}
