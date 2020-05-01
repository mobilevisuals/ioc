package com.example.pac2;


import com.example.injectexample.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TextEditor_injection_IoC_constructorbased_pac {


    private SpellChecker spellChecker;

    @Autowired
    public TextEditor_injection_IoC_constructorbased_pac(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

}