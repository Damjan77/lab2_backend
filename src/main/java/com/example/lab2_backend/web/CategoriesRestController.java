package com.example.lab2_backend.web;

import com.example.lab2_backend.model.enums.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@CrossOrigin("")
@RequestMapping("/api/categories")
public class CategoriesRestController {

    @GetMapping
    public List<Category> getCategories()
    {
        return Arrays.stream(Category.values()).collect(Collectors.toList());
    }
}