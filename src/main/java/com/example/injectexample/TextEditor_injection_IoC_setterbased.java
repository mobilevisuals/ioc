package com.example.injectexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//Blir nu Spring Bean
public class TextEditor_injection_IoC_setterbased {

    private SpellChecker spellChecker;

    public TextEditor_injection_IoC_setterbased(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    //set metoden anropas ej om @Autowired tas bort!!
    //SpellChecker skapas av Springs IoC-behållare när setter-metoden anropas
    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

}