package com.example.getDemo.controller;

import com.example.getDemo.entity.VowelsCount;
import com.example.getDemo.repository.VowelsCountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VowelsCountController {
    @Autowired
    VowelsCountRepo vowelsCountRepo;

    @GetMapping("/getString/{string}")
    public int countVowels(@PathVariable String string){
        String s=string;
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' ||s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i)=='/' ||s.charAt(i)=='$' || s.charAt(i)=='@' || s.charAt(i)=='#') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
