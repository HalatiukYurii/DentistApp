import java.time.LocalDate;

/**
 * Created by RENT on 2018-03-10.
 */
public class RegistrationRequest {
    private Pacijent pacijent;
    private LocalDate dataVisit;
    private String doctorsName;
    private double cenaVisit;
    private int idVisit;

    public RegistrationRequest() {

    }


    public int getIdVisit() {
        return idVisit;
    }

    public void setIdVisit(int idVisit) {
        this.idVisit = idVisit;
    }

    public RegistrationRequest(int idVisit) {

        this.idVisit = idVisit;
    }

    public Pacijent getPacijent() {
        return pacijent;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }

    public LocalDate getDataVisit() {
        return dataVisit;
    }

    public void setDataVisit(LocalDate dataVisit) {
        this.dataVisit = dataVisit;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
    }

    public double getCenaVisit() {
        return cenaVisit;
    }

    public void setCenaVisit(double cenaVisit) {
        this.cenaVisit = cenaVisit;
    }

    public RegistrationRequest(Pacijent pacijent, LocalDate dataVisit, String doctorsName, double cenaVisit) {
        this.pacijent = pacijent;
        this.dataVisit = dataVisit;
        this.doctorsName = doctorsName;
        this.cenaVisit = cenaVisit;
    }

    public void setDataVisit(String s) {
    }
}
