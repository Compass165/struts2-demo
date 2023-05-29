/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Product {
    
    private String idProd;
    private String nameProd;
    private double priceProd;

    public Product() {
    }

    public Product(String idProd, String nameProd, double priceProd) {
        this.idProd = idProd;
        this.nameProd = nameProd;
        this.priceProd = priceProd;
    }

    public String getIdProd() {
        return idProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    public double getPriceProd() {
        return priceProd;
    }

    public void setPriceProd(double priceProd) {
        this.priceProd = priceProd;
    }
    
    
    
}
