package exercice2.models;

import java.text.ParseException;

public interface Exo2 {

    /**
     * Display all the person born in Chambéry
     */
    void displayPersonFromChambery();

    /**
     * Display all the person older than 25 years old
     */
    void displayBoomers() throws ParseException;

    /**
     * Display females from the database
     */
    void displayFemales();

    /**
     * Display all the females older than 25 years old
     */
    void displayFemaleBoomers();
}
