package com.loom.emtlab1.repositories;

import com.loom.emtlab1.models.Book;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Repository
public class BookRepo {
    private Map<Long, Book> knigi;

    public BookRepo() {
        knigi = new TreeMap<>();
    }

    public void dodajKniga(Book kniga) {
        knigi.put(kniga.getBook_id(), kniga);
    }

    public Book zemiKniga(Long kniga_id) {
        return knigi.get(kniga_id);
    }

    public List<Book> zemiGiSiteKnigi() {
        return knigi.values().stream().collect(Collectors.toList());
    }

    public void izmeniKniga(Long kniga_id, Book kniga) {
        knigi.replace(kniga_id, kniga);
    }

    public void izbrishiKniga(Long kniga_id) {
        knigi.remove(kniga_id);
    }

}
