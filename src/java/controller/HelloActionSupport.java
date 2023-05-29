/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/ActionSupport.java to edit this template
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author Admin
 */
public class HelloActionSupport extends ActionSupport {
    
    private String name;
    private Product product = new Product();
    private ArrayList<Product> listProduct = new ArrayList<Product>();

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public HelloActionSupport() {
    }
    
    @Override
    public String execute() throws Exception {
        this.name = "Nguyen Duy Phong";
        this.product = new Product("001", "Rog 5s siêu cấp vip pro", 99.99);
        return "success";
    }
    
    public String show () {
        this.listProduct.add(new Product("001", "Rog siêu cấp vip pro", 69.99));
        this.listProduct.add(new Product("002", "Rog 2 siêu cấp vip pro", 79.99));
        this.listProduct.add(new Product("003", "Rog 3 siêu cấp vip pro", 89.99));
        this.listProduct.add(new Product("004", "Rog 5 siêu cấp vip pro", 99.99));
        this.listProduct.add(new Product("005", "Rog 6 siêu cấp vip pro", 109.99));
           
        
        
        
        
        return "success";
    }
    
}
