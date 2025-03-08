package co.devskills.springbootboilerplate;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Challenge1Controller {

    @PostMapping("/challenge-1")
    public boolean implementation(
            @RequestBody int[] array) {

        // Write the code for Challenge 1 here
        throw new NotYetImplementedException();
    }
}