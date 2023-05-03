package genericsLesson.quizGame;

public class Game {
    public static void main(String[] args) {
        Team<Schoolar> schoolarTeam1 = new Team<>("Школьная команда 1");
        Schoolar schoolar1 = new Schoolar("Иван", 12);
        Schoolar schoolar2 = new Schoolar("Юра", 14);
        schoolarTeam1.addPersonToTeam(schoolar1);
        schoolarTeam1.addPersonToTeam(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Школьная команда 2");
        Schoolar schoolar3 = new Schoolar("Саша", 12);
        Schoolar schoolar4 = new Schoolar("Ира", 14);
        schoolarTeam2.addPersonToTeam(schoolar3);
        schoolarTeam2.addPersonToTeam(schoolar4);


        Team<Student> studentTeam1 = new Team<>("Команда студентов 1");
        Student student1 = new Student("Гена", 21);
        Student student2 = new Student("Олег", 19);
        studentTeam1.addPersonToTeam(student1);
        studentTeam1.addPersonToTeam(student2);

        Team<Student> studentTeam2 = new Team<>("Команда студентов 2");
        Student student3 = new Student("Федя", 21);
        Student student4 = new Student("Коля", 19);
        studentTeam2.addPersonToTeam(student3);
        studentTeam2.addPersonToTeam(student4);


        Team<Employee> employeeTeam1 = new Team<>("Команда рабочих 1");
        Employee employee1 = new Employee("Михаил", 37);
        Employee employee2 = new Employee("Роман", 35);
        employeeTeam1.addPersonToTeam(employee1);
        employeeTeam1.addPersonToTeam(employee2);

        Team<Employee> employeeTeam2 = new Team<>("Команда рабочих 2");
        Employee employee3 = new Employee("Абду", 37);
        Employee employee4 = new Employee("Исак", 35);
        employeeTeam2.addPersonToTeam(employee3);
        employeeTeam2.addPersonToTeam(employee4);


        for (int i = 0; i < 3; i++) {
            Team<Schoolar> winnerSchoolarTeam = schoolarTeam1.playWith(schoolarTeam2);
            System.out.println("В шольной викторине выиграла команда:\n" + winnerSchoolarTeam.getName() +
                    "\nс игроками:\n" + winnerSchoolarTeam.getPersonList());
        }

        for (int i = 0; i < 3; i++) {
            Team<Student> winnerStudentTeam = studentTeam1.playWith(studentTeam2);
            System.out.println("В студенческой викторине выиграла команда:\n" + winnerStudentTeam.getName() +
                    "\nс игроками:\n" + winnerStudentTeam.getPersonList());
        }

        for (int i = 0; i < 3; i++) {
            Team<Employee> winnerEmployeeTeam = employeeTeam1.playWith(employeeTeam2);
            System.out.println("В шольной викторине выиграла команда:\n" + winnerEmployeeTeam.getName() +
                    "\nс игроками:\n" + winnerEmployeeTeam.getPersonList());
        }
    }
}
