package co.devskills.springbootboilerplate;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Challenge3Controller {

    @PostMapping("/challenge-3")
    public int implementation(
            @RequestBody int[] array) {

        // Write the code for Challenge 3 here
        throw new NotYetImplementedException();
    }
}