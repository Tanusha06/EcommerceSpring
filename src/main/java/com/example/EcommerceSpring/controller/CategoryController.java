package com.example.EcommerceSpring.controller;

import org.springframework.web.bind.annotation.*;

//@Component
@RestController
@RequestMapping("api/categories")
public class CategoryController {

    @GetMapping
    public String getCategory(){
        return "Electronics";
    }

    @GetMapping(value = "/count")  // This endpoint is hit if we call a GET rqst on api/categories/count
    public int getCategoryCount(){
        return 10;
    }

    @PostMapping
    public String postCategory() {
        return "Category Chemical";
    }

    @DeleteMapping
    public String deleteCategory() {
        return "Category deleted";
    }


}
