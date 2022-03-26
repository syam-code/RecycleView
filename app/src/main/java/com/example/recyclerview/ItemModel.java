package com.example.recyclerview;

public class ItemModel {
    String title;
    String type;
    int image;

    public ItemModel(String title, String type, int image) {
        this.title = title;
        this.type = type;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
