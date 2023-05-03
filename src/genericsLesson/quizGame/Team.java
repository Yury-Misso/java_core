package genericsLesson.quizGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Person> {
    private String name;
    private List<T> personList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPersonToTeam(T person) {
        personList.add(person);
        System.out.println("В команду " + name + " был добавлен участник " + person.getName());
    }

    public Team playWith(Team<T> team) {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            return this;
        } else {
            return team;
        }
    }


    public String getName() {
        return name;
    }

    public List<T> getPersonList() {
        return personList;
    }
}
