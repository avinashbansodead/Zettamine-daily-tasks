package com.day5.product;

import java.io.Serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Serializable class to represent a product
class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}

