package org.java.lessons.football;

/*Creare una classe Persona con gli attributi nome ed età.
Estendere la classe Persona con una classe Giocatore e una classe Allenatore: ogni giocatore ha un ruolo e ogni allenatore ha la sua strategia (es: difensiva o offensiva).
Definire una classe Squadra che contiene una lista di oggetti di tipo Giocatore e un Allenatore.
BONUS: nella classe Persona, al posto dell’età, memorizzare la data di nascita
 */

public abstract class Person {

    // FIELDS
    private String name;
    private int age;


    // CONSTRUCTORS
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // METHODS

    @Override
    public String toString() {
        return "Person{" +
                "'" + name + '\'' +
                " , " + age  ;
    }
}
