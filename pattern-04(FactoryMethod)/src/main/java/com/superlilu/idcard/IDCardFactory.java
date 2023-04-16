package com.superlilu.idcard;

import com.superlilu.framework.Product;
import com.superlilu.framework.ProductFactory;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class IDCardFactory extends ProductFactory {
    private final List<String> owners = new ArrayList<>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
