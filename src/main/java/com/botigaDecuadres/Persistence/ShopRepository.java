package com.botigaDecuadres.Persistence;

import com.botigaDecuadres.Domain.WhiteCollarShop;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShopRepository {

    public static List<WhiteCollarShop> repository = new ArrayList<>();

    public ShopRepository(){}

    public void saveShop(WhiteCollarShop shop) throws Exception {
        if (shop == null)
            throw new Exception();
        if (existById(shop))
            throw new Exception();

        repository.add(shop);
    }

    public List<WhiteCollarShop> getAllShops(){ return repository; }
    
    public WhiteCollarShop getById(int shopId){
        for (WhiteCollarShop shop : repository) {
            if (shop.getId().equals(shopId))
                return shop;
        }
        return null;
    }

    public boolean existById(WhiteCollarShop shop){
        for (WhiteCollarShop shop1 : repository) {
            if (shop1.getId().equals(shop.getId()))
                return true;
        }
        return false;
    }
}
