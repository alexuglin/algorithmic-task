import model.Person;
import validation.ErrorDTO;
import validation.SizeValidator;
import validation.Validator;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("J", "DoeDoeDoeDoe", LocalDate.of(2999, 04, 29));
        Validator<Person> validator = new SizeValidator<>();
        List.of(person).stream()
                .map(validator::validate)
                .flatMap(Set::stream)
                .map(ErrorDTO::getMessage)
                .forEach(System.out::println); //List.of(person)validator.validate(person).stream().map(ErrorDTO::getMessage).forEach(System.out::println);
    }
}
