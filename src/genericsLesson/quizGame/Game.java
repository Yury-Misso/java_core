package genericsLesson.quizGame;

public class Game {
    public static void main(String[] args) {
        Team<Schoolar> schoolarTeam1 = new Team<>("�������� ������� 1");
        Schoolar schoolar1 = new Schoolar("����", 12);
        Schoolar schoolar2 = new Schoolar("���", 14);
        schoolarTeam1.addPersonToTeam(schoolar1);
        schoolarTeam1.addPersonToTeam(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team<>("�������� ������� 2");
        Schoolar schoolar3 = new Schoolar("����", 12);
        Schoolar schoolar4 = new Schoolar("���", 14);
        schoolarTeam2.addPersonToTeam(schoolar3);
        schoolarTeam2.addPersonToTeam(schoolar4);


        Team<Student> studentTeam1 = new Team<>("������� ��������� 1");
        Student student1 = new Student("����", 21);
        Student student2 = new Student("����", 19);
        studentTeam1.addPersonToTeam(student1);
        studentTeam1.addPersonToTeam(student2);

        Team<Student> studentTeam2 = new Team<>("������� ��������� 2");
        Student student3 = new Student("����", 21);
        Student student4 = new Student("����", 19);
        studentTeam2.addPersonToTeam(student3);
        studentTeam2.addPersonToTeam(student4);


        Team<Employee> employeeTeam1 = new Team<>("������� ������� 1");
        Employee employee1 = new Employee("������", 37);
        Employee employee2 = new Employee("�����", 35);
        employeeTeam1.addPersonToTeam(employee1);
        employeeTeam1.addPersonToTeam(employee2);

        Team<Employee> employeeTeam2 = new Team<>("������� ������� 2");
        Employee employee3 = new Employee("����", 37);
        Employee employee4 = new Employee("����", 35);
        employeeTeam2.addPersonToTeam(employee3);
        employeeTeam2.addPersonToTeam(employee4);


        for (int i = 0; i < 3; i++) {
            Team<Schoolar> winnerSchoolarTeam = schoolarTeam1.playWith(schoolarTeam2);
            System.out.println("� ������� ��������� �������� �������:\n" + winnerSchoolarTeam.getName() +
                    "\n� ��������:\n" + winnerSchoolarTeam.getPersonList());
        }

        for (int i = 0; i < 3; i++) {
            Team<Student> winnerStudentTeam = studentTeam1.playWith(studentTeam2);
            System.out.println("� ������������ ��������� �������� �������:\n" + winnerStudentTeam.getName() +
                    "\n� ��������:\n" + winnerStudentTeam.getPersonList());
        }

        for (int i = 0; i < 3; i++) {
            Team<Employee> winnerEmployeeTeam = employeeTeam1.playWith(employeeTeam2);
            System.out.println("� ������� ��������� �������� �������:\n" + winnerEmployeeTeam.getName() +
                    "\n� ��������:\n" + winnerEmployeeTeam.getPersonList());
        }
    }
}
