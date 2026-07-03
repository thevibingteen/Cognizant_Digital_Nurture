import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate() {

        LOGGER.info("START - authenticate()");

        String jwtToken =
                "eyJhbGciOiJIUzI1NiJ9.demo.jwt.token";

        AuthenticationResponse response =
                new AuthenticationResponse(jwtToken);

        LOGGER.info("END - authenticate()");

        return response;
    }
}