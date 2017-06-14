package com.brock.guide.models;

/**
 * Created by Brock on 14/06/2017.
 */

public class Restaurant {
    private String name;
    private String category;
    private String phone;
    private String email;
    private String url;
    private String image;

    public Restaurant(String name, String category, String phone, String email, String url, String image) {
        this.name = name;
        this.category = category;
        this.phone = phone;
        this.email = email;
        this.url = url;
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getUrl() {
        return url;
    }

    public String getImage() {
        return image;
    }

}
