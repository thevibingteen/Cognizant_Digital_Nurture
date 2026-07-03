public class AttemptQuestion {

    private int id;
    private Question question;
    private AttemptOption selectedOption;

    public AttemptQuestion() {
    }

    public AttemptQuestion(int id,
                           Question question,
                           AttemptOption selectedOption) {
        this.id = id;
        this.question = question;
        this.selectedOption = selectedOption;
    }

    public int getId() {
        return id;
    }

    public Question getQuestion() {
        return question;
    }

    public AttemptOption getSelectedOption() {
        return selectedOption;
    }

}