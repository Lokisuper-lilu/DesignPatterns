package com.superlilu.framework;

public abstract class ProductFactory {

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product product);
}
