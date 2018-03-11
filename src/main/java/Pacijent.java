import java.time.LocalDate;

/**
 * Created by RENT on 2018-03-10.
 */
public class Pacijent {
    private String name;
    private String surname;
    private LocalDate dataUrodzenia;
    private int id;
    private Gender gender;
    public Pacijent() {

        this.name = name;
        this.surname = surname;
        this.dataUrodzenia = dataUrodzenia;
        this.id = id;
        this.gender = gender;
        this.numberOfVisits = numberOfVisits;
    }

    public Pacijent(String name, String surname, LocalDate dataUrodzenia, int id, Gender gender, int numberOfVisits) {
        this.name = name;
        this.surname = surname;
        this.dataUrodzenia = dataUrodzenia;
        this.id = id;
        this.gender = gender;
        this.numberOfVisits = numberOfVisits;
    }

    private int numberOfVisits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getNumberOfVisits() {
        return numberOfVisits;
    }

    public void setNumberOfVisits(int numberOfVisits) {
        this.numberOfVisits = numberOfVisits;
    }


    public void setDataUrodzenia(String s) {
    }
}
//    1. Aplikacja do rejestracji klientów na wizyty u dentysty/ortodonty, oraz do prowadzenia dokumentacji pacjentów.
//-stwórz klasę Patient, która będzie przechowywała dane osobowe pacjenta
//-stwórz klasę RegistrationRequest, która będzie przechowywała szczegóły dotyczące
//    danej wizyty, takie jak: pacjent, data, imię i nazwisko lekarza, do którego
//    rezerwowana jest wizyta, cena wizyty i dodatkowe szczegóły,
//-stwórz klasę RegistrationDesk, która będzie miała metodę register(RegistrationRequest request),
//    zwracającą numer identyfikacyjny nowej     wizyty
//-pacjenci i wizyty powinny być zapisywane do lokalnej bazy danych składającej się z  plików
//    tekstowych. Stwórz do tego oddzielną klasę. Powinna ona mieć metody zwracające requesty i pacjentów.
//    Zastanów się nad różnymi argumentami tych metod.
