package com.exmaple.ecommerceapp.api;

import com.exmaple.ecommerceapp.model.Product;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {

    @GET("products/categories")
    Call<ArrayList<String>> getCategories();

    @GET("products")
    Call<ArrayList<Product>> getProducts();

}
