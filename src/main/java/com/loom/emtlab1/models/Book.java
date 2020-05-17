package com.loom.emtlab1.models;

import com.loom.emtlab1.repositories.CategoryRepo;
import org.springframework.web.multipart.MultipartFile;

public class Book {

    private long book_id;
    private String naslov;
    private int na_lager;
    private String category;
    private String slika;


    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getNa_lager() {
        return na_lager;
    }

    public void setNa_lager(int na_lager) {
        this.na_lager = na_lager;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }
}
