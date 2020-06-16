/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Son môi", 200, 100));
        list.add(new Product("Phấn hồng", 500, 100));
        list.add(new Product("Sữa rửa mặt", 100, 100));
        
        SortCollection<Product> sxtheoGia = new SortProductByPrice();
        sxtheoGia.sort(list);
        System.out.println("\nsắp xếp theo giá: ");
        for(int i=0; i<list.size(); i++)
            System.out.println(list.get(i).getName()+", "+ list.get(i).getPrice()+", "+list.get(i).getQuantity());
        }
        
        SortCollection<Product> sxtheoTen = new SortProductByName();
        sxtheoTen.
        
}
