package com.example.productapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PrductController {

    @GetMapping("/")

    public String Homepage(){

        return("Welcome to product Homepage");

    }

    @GetMapping("/add")

    public String ProductAddPage(){

        return("Welcome to product Addpage");

    }

    @GetMapping("/search")

    public String ProductSearchPage(){

        return("Welcome to product Searchpage");

    }

    @GetMapping("/edit")

    public String ProductEditPage(){

        return("Welcome to product Editpage");

    }

    @GetMapping("/viewall")

    public String ProductViewAllPage(){

        return("Welcome to product Viewpage");

    }
}
