package exercice1;

import datamocklib.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainExercice1 {

    public List<String[]> textFileToStringList(String filePath){
        List<String[]> res = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    filePath));
            String line = reader.readLine();
            while (line != null) {
                res.add(line.split(","));
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    // Format du fichier : firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
    // Pas de header
    public List<Person> parse(List<String[]> data) {
        List<Person> people = new ArrayList<>();
        String[] currentPerson;
        for(int i = 0; i < data.size(); i++){
            currentPerson = data.get(i);
            people.add(new Person(currentPerson[0], currentPerson[1], currentPerson[2], currentPerson[3],
                    currentPerson[4], currentPerson[5]));
        }

        return people;
    }

    public static void main(String[] args) {
        // EXO 1
        /*
         * - Récuperez la liste des personnes sous la forme -> firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
         *   grâce à la fonction TxtHelper.getDataFromTxt("persons.txt")
         * - Parser la liste des Personnes grâce à la fonction parse())
         * - Calculer le nombre de personnes nées dans chaque ville avec les données obtenues.
         * Les données contiennent une trentaine de villes, Bonne chance !
        */


    }
}
