package co.devskills.springbootboilerplate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Challenge3Controller {

    @PostMapping("/challenge-3")
    public boolean implementation(
            @RequestBody int[] array) {

        // Write the code for Challenge 3 here

        return true;
    }
}