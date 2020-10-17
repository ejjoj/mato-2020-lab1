package pl.edu.wszib.lab1;

public class User {
    private final String firstname;
    private final String lastname;
    protected int age;

    public User(String firstname,
                String lastname,
                int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    void birthday() {
        this.age++;
    }

    public int getAge() {
        return this.age;
    }
}


class UserOverride extends User {

    public UserOverride(String firstname, String lastname, int age) {
        super(firstname, lastname, age);
    }

    @Override
    void birthday() {
        super.age += 2;
    }
}
