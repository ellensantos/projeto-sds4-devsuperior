package br.com.devsuperior.ellensantos.dsvendas.dto;

import br.com.devsuperior.ellensantos.dsvendas.entities.Seller;

import java.io.Serializable;

/**
 * @author EllenTex
 */
public class SaleSumDTO implements Serializable {

    private String sellerName;
    private Double sum;

    public SaleSumDTO(String sellerName) {
        this.sellerName = sellerName;
    }

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
