package com.loom.emtlab1.services;

import com.loom.emtlab1.models.Category;
import com.loom.emtlab1.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public void addCategory(Category category) {
        categoryRepo.dodajKategorija(category);
    }

    public Category getCategoryById(Long cat_id) {
        return categoryRepo.zemiKategorija(cat_id);
    }

    public List<Category> getAllCategories() {
        return categoryRepo.zemiGiSiteKategorii();
    }

    public void updateCategory(Long cat_id, Category category) {
        categoryRepo.izmeniKategorija(cat_id, category);
    }

    public void deleteCategoryById(Long cat_id) {
        categoryRepo.izbrishiKategorija(cat_id);
    }

}
