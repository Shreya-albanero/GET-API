package com.example.getDemo.controller;

import com.example.getDemo.entity.VowelsCount;
import com.example.getDemo.repository.VowelsCountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class VowelsCountController {
    @Autowired
    VowelsCountRepo vowelsCountRepo;

    @GetMapping("/getString")
    public int countVowels(@RequestParam("string") String string){
        int count=0;
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)=='a' ||string.charAt(i) == 'e'|| string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' || string.charAt(i)=='/' ||string.charAt(i)=='$' || string.charAt(i)=='@' || string.charAt(i)=='#') {
                count++;
            }
        }
        //m.addAttribute("message", m);
        System.out.println(count);
        return count;
    }
}
