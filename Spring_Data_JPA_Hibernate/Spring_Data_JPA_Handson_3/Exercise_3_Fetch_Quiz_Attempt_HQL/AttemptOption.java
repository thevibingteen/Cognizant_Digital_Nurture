public class AttemptOption {

    private int id;
    private Option option;

    public AttemptOption() {
    }

    public AttemptOption(int id, Option option) {
        this.id = id;
        this.option = option;
    }

    public int getId() {
        return id;
    }

    public Option getOption() {
        return option;
    }

}