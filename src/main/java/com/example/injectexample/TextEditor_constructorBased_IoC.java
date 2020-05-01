package com.example.injectexample;

//IoC utan Injection
public class TextEditor_constructorBased_IoC {
    private SpellChecker spellChecker;

    public TextEditor_constructorBased_IoC(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        /* Denna klass skapar ej SpellChecker
Inversion of Control : överlåter skapandet av objektet till andra
Kontrollen inverterad för vi har delegerat beroendet till någon annan
I detta fall Main-klassen, som skickar in objektet via konstruktorn
TextEditor vet ej vem som skapat Spellchecker* */
    }
}
