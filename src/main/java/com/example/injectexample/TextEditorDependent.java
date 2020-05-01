package com.example.injectexample;

public class TextEditorDependent {

    private SpellChecker spellChecker;

    public TextEditorDependent() {

        //Beroende skapat utan Injection:
        spellChecker = new SpellChecker();
    }
}