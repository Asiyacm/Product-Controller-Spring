package com.example.productapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PrductController {

    @GetMapping("/")

    public String Homepage(){

        return("Welcome to product Homepage");

    }

    @PostMapping("/add")

    public String ProductAddPage(){

        return("Welcome to product Addpage");

    }

    @PostMapping("/search")

    public String ProductSearchPage(){

        return("Welcome to product Searchpage");

    }

    @PostMapping("/edit")

    public String ProductEditPage(){

        return("Welcome to product Editpage");

    }

    @GetMapping("/viewall")

    public String ProductViewAllPage(){

        return("Welcome to product Viewpage");

    }

    @PostMapping("/delete")

    public String ProductDeletePage(){

        return("Welcome to product Deletepage");

    }
}
