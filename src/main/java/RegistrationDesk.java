import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by RENT on 2018-03-10.
 */
public class RegistrationDesk {

    private Map<Integer,RegistrationRequest> visits =new HashMap<>();
    private Map<Integer,Pacijent> patients = new HashMap<>();
    public int aadPatient(Pacijent pacijent){
        patients.put(pacijent.getId(),pacijent);
        return pacijent.getId();
    }
    public Optional<Pacijent> getPacjent (int id){
        Pacijent pacijent = patients.get(id);
        if (pacijent==null) return Optional.empty();
        else return Optional.of(pacijent);
    }
    public Optional<RegistrationRequest> getRegistrationRequest (int id){
        RegistrationRequest registrationRequest =visits.get(id);
        if (registrationRequest==null) return Optional.empty();
        else return Optional.of(registrationRequest);
    }
    public int register (RegistrationRequest request){
        visits.put(request.getIdVisit(),request);
        return request.getIdVisit();
    }
}
