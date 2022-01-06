package com.exmaple.ecommerceapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("id")
    @Expose
    private int id ;

    @SerializedName("title")
    @Expose
    private String title ;

    @SerializedName("price")
    @Expose
    private double price ;

    @SerializedName("description")
    @Expose
    private String description ;

    @SerializedName("category")
    @Expose
    private String category ;

    @SerializedName("image")
    @Expose
    private String image ;

    @SerializedName("rating")
    @Expose
    private Rate rating ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Rate getRating() {
        return rating;
    }

    public void setRating(Rate rating) {
        this.rating = rating;
    }
}
