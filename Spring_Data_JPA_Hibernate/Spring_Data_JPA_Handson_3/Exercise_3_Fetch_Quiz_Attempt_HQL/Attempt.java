import java.time.LocalDate;
import java.util.List;

public class Attempt {

    private int id;
    private LocalDate attemptDate;
    private User user;
    private List<AttemptQuestion> questions;

    public Attempt() {
    }

    public Attempt(int id, LocalDate attemptDate, User user) {
        this.id = id;
        this.attemptDate = attemptDate;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getAttemptDate() {
        return attemptDate;
    }

    public void setAttemptDate(LocalDate attemptDate) {
        this.attemptDate = attemptDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<AttemptQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<AttemptQuestion> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Attempt{id=" + id +
                ", date=" + attemptDate + "}";
    }

}