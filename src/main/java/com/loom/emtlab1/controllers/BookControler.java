package com.loom.emtlab1.controllers;

import com.loom.emtlab1.models.Book;
import com.loom.emtlab1.models.Category;
import com.loom.emtlab1.services.BookService;
import com.loom.emtlab1.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookControler extends BaseController{

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ModelAndView allBooks(ModelAndView modelAndView) {
        modelAndView.setViewName("books");

        List<Book> books = bookService.getAllBooks();
        modelAndView.addObject("books", books);
        return modelAndView;
    }

    @GetMapping("/new")
    public ModelAndView addBook(ModelAndView modelAndView) {
        modelAndView.setViewName("add_book");

        List<Category> categories = categoryService.getAllCategories();
        modelAndView.addObject("cats", categories);

        modelAndView.addObject("book", new Book());

        return modelAndView;
    }

    @PostMapping("/new")
    public ModelAndView bookAdd(@ModelAttribute Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
            return this.view("add_book");
        }

        bookService.addBook(book);

        return this.redirect("./");
    }
}
