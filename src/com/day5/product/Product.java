package com.day5.product;

import java.io.Serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
class Product implements Serializable 
{
    private static final long serialVersionUID = 1L;
    private int productId;
    private String productName;
}

