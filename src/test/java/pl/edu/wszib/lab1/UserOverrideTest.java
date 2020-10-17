package pl.edu.wszib.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserOverrideTest {

    @Test
    @DisplayName("Should increase age after birthday by 2")
    public void shouldIncreaseAgeAfterBirthdayBy2() {
        // given: we create user
        final User user = new UserOverride("Bartosz", "Szymanski", 21);

        // when: user has birthday
        user.birthday();

        //then: age should be incremented by 2
        assertEquals(23, user.getAge(), "User age after birthday should be 23");
    }
}
