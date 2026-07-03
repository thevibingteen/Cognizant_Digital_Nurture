import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

    @Autowired
    private SkillRepository repository;

    public void addSkill(Skill skill) {
        repository.save(skill);
    }

}