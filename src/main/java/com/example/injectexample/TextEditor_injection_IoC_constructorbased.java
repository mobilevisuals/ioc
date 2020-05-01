package com.example.injectexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor_injection_IoC_constructorbased {

    private SpellChecker spellChecker;
    //SpellChecker skapas av Springs IoC-behållare när konstruktorn anropas
    @Autowired
    public TextEditor_injection_IoC_constructorbased(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

}
