package esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;
    @Autowired
    private JobClient jobClient;
    public String sayHello() {
        return jobClient.sayHello();
    }

    public List<Candidat> findAll() {
        return candidatRepository.findAll();
    }
}
