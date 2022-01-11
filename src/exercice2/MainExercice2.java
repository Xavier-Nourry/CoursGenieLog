package exercice2;

import datamocklib.TxtHelper;
import exercice2.models.*;

import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainExercice2 implements Exo2 {

    /* EXO 2
     * Recupérez depuis le serveur la liste des gens qui sont nés à Chambéry.
     * La récupération de Data se fait dans l'ordre :
     *  - Récupération de data sur le server grâce à TxtHelper.getDataFromTxt("server.txt");
     *  - Vider la base de données locale grâce à la fonction TxtHelper.clearDataLocal();
     *  - Insérer les données dans la database locale grâce à la fonction TxtHelper.insertDataInTxt(line, "local.txt")
     *  - Afficher les données locale grace à TxtHelper.getDataFromTxt("local.txt")
     */
    @Override
    public void displayPersonFromChambery() {
        List<String> lines = TxtHelper.getDataFromTxt("D:\\Documents\\Etudes\\M2\\INFO909\\Groupe_HugoH\\CoursGenieLog\\persons.txt");
        List<String[]> infos = new ArrayList<>();
        for(int i = 0; i < lines.size(); i++){
            infos.add(lines.get(i).split(","));
        }
        String[] currentPerson;
        for(int j = 0; j < infos.size(); j++){
            currentPerson = infos.get(j);
            if(currentPerson[4].equals("Chambery")) {
                for (int k = 0; k < currentPerson.length; k++) {
                    System.out.print(currentPerson[k] + " ");
                }
                System.out.println();
            }
        }
    }

    /*
     * Recupérez depuis le serveur la liste des gens qui ont plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     * Tips : Vous avez dans la class Person la fonction getAge();
     */
    @Override
    public void displayBoomers() throws ParseException {
        List<String> lines = TxtHelper.getDataFromTxt("D:\\Documents\\Etudes\\M2\\INFO909\\Groupe_HugoH\\CoursGenieLog\\persons.txt");
        List<String[]> infos = new ArrayList<>();
        for(int i = 0; i < lines.size(); i++){
            infos.add(lines.get(i).split(","));
        }
        String[] currentPerson;
        int currentPersonAge;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        for(int j = 0; j < infos.size(); j++){
            currentPerson = infos.get(j);
            if(currentPerson[3].equals("female")) {
                currentPersonAge = year - (new SimpleDateFormat("dd/MM/yyyy").parse(currentPerson[2]).getYear());
                if(currentPersonAge > 25){
                    for (int k = 0; k < currentPerson.length; k++) {
                        System.out.println(currentPerson[k]);
                    }
                }
            }
        }
    }

    /*
     * Recupérez depuis le serveur la liste des gens de sexe féminin.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemales() {

    }

    /*
     * Recupérez depuis le serveur la liste des femmes de plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemaleBoomers() {

    }

    public static void main(String[] args) {
        Exo2 exo2 = new MainExercice2();
        exo2.displayPersonFromChambery();
        //exo2.displayBoomers();
    }
}
