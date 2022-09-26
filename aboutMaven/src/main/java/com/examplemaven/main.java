package com.examplemaven;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Book> libros = new ArrayList<>();

        Book libro1 = new Book("llll1", 234);
        Book libro2 = new Book("aaaaa", 231);
        Book libro3 = new Book("bbbbb", 334);

        libros.addAll(List.of(libro1, libro2, libro3));

        Author autor = new Author("sebastian", "Escudero", libros);

        Gson gson = new Gson();

        System.out.println(gson.toJson(autor));



    }
}
