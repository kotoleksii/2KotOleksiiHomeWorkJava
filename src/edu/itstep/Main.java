package edu.itstep;

public class Main {

    public static void main(String[] args) {
        ArrayListUser list = new ArrayListUser();

        list.addFirst(new User("dadadada", "tyyttytyty", 11));
        list.addLast(new User("khkjkjjl", "rettetet", 12));
        list.addLast(new User("zxcxcxcxc", "nvnvcnc", 13));
        list.addFirst(new User("rrrrtrtrttr", "ioioiouy", 14));
        System.out.println();

        int total = 0;

        for (int i = 0; i < list.size(); i++) {
            total += list.get(i).getAge();
        }

        System.out.println("Users average age in the list: " + total / list.size());
    }
}
