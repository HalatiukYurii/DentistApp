import java.io.*;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by RENT on 2018-03-10.
 */
public class FileOperator {
    private final String PATIENTS_FILE_NAME = "patients.txt";
    private final String VISITS_FILE_NAME = "visits.txt";
    private final String SEPARATOR = ";";

    public void savePatientsToFile(Map<Integer,Pacijent> patientMap){

        try {
            FileWriter fileWriter = new FileWriter(PATIENTS_FILE_NAME,false);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for(Pacijent patient:patientMap.values()){

                printWriter.println(toLine(patient));
            }
            fileWriter.close();
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveVisitsToFile(Map<Integer,RegistrationRequest> visitMap){
        try {
            FileWriter fileWriter = new FileWriter(VISITS_FILE_NAME,false);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for(RegistrationRequest visit:visitMap.values()){

                printWriter.println(toLine(visit));
            }

            fileWriter.close();
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String toLine(RegistrationRequest request) {

        String result = "";
        result += request.getIdVisit() + SEPARATOR;
        result += request.getPacijent() + SEPARATOR;
        result += request.getDataVisit() + SEPARATOR;
        result += request.getDoctorsName() + SEPARATOR;
        result += request.getCenaVisit();
        return result;
    }


    private String toLine(Pacijent patient){

        String result = "";
        result += patient.getId() + SEPARATOR;
        result += patient.getName() + SEPARATOR;
        result += patient.getSurname() + SEPARATOR;
        result += patient.getDataUrodzenia() + SEPARATOR;
        result += patient.getGender() + SEPARATOR;
        result += patient.getNumberOfVisits();
        return result;
    }
    public Map<Integer,RegistrationRequest> getAllVisits(){
        return null;
    }

    public Map<Integer,Pacijent> getAllPatients(){

        File file=new File(PATIENTS_FILE_NAME);
        Scanner sc= null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
