import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttemptService {

    @Autowired
    private AttemptRepository repository;

    public Attempt getAttempt(int userId,
                              int attemptId) {

        return repository.getAttempt(userId, attemptId);

    }

}