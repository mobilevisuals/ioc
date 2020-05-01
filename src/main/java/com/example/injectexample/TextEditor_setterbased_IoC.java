package com.example.injectexample;

public class TextEditor_setterbased_IoC {

    private SpellChecker spellChecker;

    public TextEditor_setterbased_IoC() {

    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
  /* Denna klass skapar ej SpellChecker
Inversion of Control : överlåter skapandet av objektet till andra
Kontrollen inverterad för vi har delegerat beroendet till någon annan
I detta fall Main-klassen, som skickar in objektet via setter-metod
TextEditor vet ej vem som skapat Spellchecker* */
}