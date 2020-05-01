package com.example.injectexample;

import com.example.pac2.TextEditor_injection_IoC_constructorbased_pac;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.example.pac2","com.example.injectexample"})

public class Main {
    @Autowired
    TextEditor_injection_IoC_constructorbased_pac t6;
    @Autowired
    TextEditor_injection_IoC_constructorbased t4;
    @Autowired
    TextEditor_injection_IoC_setterbased t5;


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        //Beroende skapat utan Injection:
        TextEditorDependent t1=new TextEditorDependent();
        TextEditor_constructorBased_IoC t2=new TextEditor_constructorBased_IoC(new SpellChecker());
        TextEditor_setterbased_IoC t3=new TextEditor_setterbased_IoC();
        t3.setSpellChecker(new SpellChecker());
    }

}
