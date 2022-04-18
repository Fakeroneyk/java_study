package server;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyControl {

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId) {
        Person person = new Person(personId, "Crazyit", 30);
        return person;
    }
}
