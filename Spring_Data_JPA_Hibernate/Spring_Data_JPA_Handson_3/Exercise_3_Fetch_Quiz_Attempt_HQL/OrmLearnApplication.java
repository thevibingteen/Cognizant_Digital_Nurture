import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(
                        OrmLearnApplication.class,
                        args);

        AttemptService service =
                context.getBean(AttemptService.class);

        Attempt attempt =
                service.getAttempt(1, 1);

        System.out.println();

        System.out.println("User : "
                + attempt.getUser().getUserName());

        System.out.println("Attempt Date : "
                + attempt.getAttemptDate());

        System.out.println();

        for (AttemptQuestion question
                : attempt.getQuestions()) {

            System.out.println(
                    question.getQuestion().getQuestionText());

            for (Option option :
                    question.getQuestion().getOptions()) {

                System.out.println(
                        " - " + option.getOptionText());

            }

            System.out.println();

        }

    }

}