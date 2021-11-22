package edu.itstep;

public class User {

    String _firstName;
    String _lastName;
    int _age;

    public User() {
    }

    public User(String firstName, String lastName, int age) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._age = age;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        this._firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        this._lastName = lastName;
    }

    public int getAge() {
        return _age;
    }

    public void setAge(int age) {
        this._age = age;
    }
}
