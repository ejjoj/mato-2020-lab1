package pl.edu.wszib.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    //TODO:

    /**
     * Stworzyć klasę, która rozszerza użytkownika, niech się nazywa
     * "dowolne", napisać metodę birthday i napisać do tego testy.
     */

    @Test
    @DisplayName("Should increase age after birthday")
    public void shouldIncreaseAgeAfterBirthday() {
        // given: we create user
        final User user = new User("Pawel", "Pustelnik", 99);

        // when: user has birthday
        user.birthday();

        // then: age should be incremented by 1
        assertEquals(100, user.getAge(), "User age after birthday should be 100");
    }

    @Test
    @DisplayName("Should increase age after birthday by 2")
    public void shouldIncreaseAgeAfterBirthdayBy2() {
        // given: we create user
        final User user = new User("Bartosz", "Szymanski", 21);

        // when: user has birthday
        user.birthday();

        //then: age should be incremented by 2
        assertEquals(23, user.getAge(), "User age after birthday should be 23");
    }
}
