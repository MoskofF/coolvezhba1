package com.loom.emtlab1.repositories;

import com.loom.emtlab1.models.Category;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Repository
public class CategoryRepo {

    private Map<Long, Category> kategorii;

    public CategoryRepo() {
        kategorii = new TreeMap<>();
    }

    public void dodajKategorija(Category kategorija) {
        kategorii.put(kategorija.getCat_id(), kategorija);
    }

    public Category zemiKategorija(Long cat_id) {
        return kategorii.get(cat_id);
    }

    public List<Category> zemiGiSiteKategorii() {
        return kategorii.values().stream().collect(Collectors.toList());
    }

    public void izmeniKategorija(Long cat_id, Category kategorija) {
        kategorii.replace(cat_id, kategorija);
    }

    public void izbrishiKategorija(Long id) {
        kategorii.remove(id);
    }
}
