package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.java.model.Attribute;

@Controller
public class FileController {

    @GetMapping("/")
    public String showForm() {
        return "NewFile";
    }

    @PostMapping("/submit")
    public String processFile(@RequestParam("xmlFile") MultipartFile xmlFile,
                              @RequestParam("excelFile") MultipartFile excelFile,
                              Model model) {
        // Implement file reading and attribute extraction here
        // Populate the model with extracted attributes
        return "result";
    }

    @PostMapping("/addAttribute")
    public String addAttribute(Attribute attribute, Model model) {
        // Implement attribute addition to the file here
        // Update the model with the new attribute
        return "result";
    }
}
