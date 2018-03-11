import java.time.LocalDate;
import java.util.Optional;

/**
 * Created by RENT on 2018-03-10.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        RegistrationDesk registrationDesk = new RegistrationDesk();

        Pacijent patient = new Pacijent();
        patient.setDataUrodzenia("1993-02-09");
        patient.setGender(Gender.MALE);
        patient.setId(1);
        patient.setName("Johnny");
        patient.setSurname("Cash");
        Pacijent patient2 = new Pacijent();
        patient2.setDataUrodzenia("1967-02-08");
        patient2.setGender(Gender.FEMALE);
        patient2.setId(2);
        patient2.setName("Elisabeth");
        patient2.setSurname("Swan");



        Optional<Pacijent> patientOptional = registrationDesk.getPacjent(2);
        if(patientOptional.isPresent()){
            Pacijent patientFromOptional = patientOptional.get();
            System.out.println(patientFromOptional);
        }
        RegistrationRequest visit = new RegistrationRequest();
        visit.setDataVisit("2015-12-01");
        visit.setIdVisit(1);
        visit.setDoctorsName("drHouse");
        visit.setCenaVisit(100.0);
        visit.setPacijent(patient);

        RegistrationRequest visit2 = new RegistrationRequest();
        visit2.setDataVisit("2016-12-01");
        visit2.setIdVisit(2);
        visit2.setDoctorsName("drHouse");
        visit2.setCenaVisit(100.0);
        visit2.setPacijent(patient);

        RegistrationRequest visit3 = new RegistrationRequest();
        visit3.setDataVisit("2016-12-01");
        visit3.setIdVisit(3);
        visit3.setDoctorsName("drHouse");
        visit3.setCenaVisit(100.0);
        visit3.setPacijent(patient2);

        registrationDesk.register(visit);
        registrationDesk.register(visit2);
        registrationDesk.register(visit3);
    }
}
