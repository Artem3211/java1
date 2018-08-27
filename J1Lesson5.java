/**
 * Java. Level 1. Lesson 2. Example of homework
 *
 * @author Artem Ershov
 * @version dated august 27, 2018
 */


class J1Lesson5 {

    public static void main(String[] args) {
        Worker[] worker = new Worker[5];
        worker[0] = new Worker("Alexeev Alex Aleksandrovich", "Manager", "Alex@gmail.com", "324237", "30000", 25);
        worker[1] = new Worker("Pupkin Vova Vadimovich", "SMM", "Vova@gmail.com", "324237", "40000", 35);
        worker[2] = new Worker("Artemov Artem Artemovich", "Admin", "Artem@gmail.com", "324237", "30343", 45);
        worker[3] = new Worker("Vasiliev Tony Vasilievich", "Director", "Tony@gmail.com", "324237", "302356", 34);
        worker[4] = new Worker("Bobov Bob Bobovich", "programmer", "Bob@gmail.com", "324237", "343456", 46);
        for (Worker e : worker) if (e.getAge() > 40) e.getFullInfo();
    }
}
   class Worker {
       String fullName;
       String position;
       String email;
       String telephone;
       String salary;
       int age;

       Worker(String fullName, String position, String email, String telephone, String salary, int age) {
           this.fullName = fullName;
           this.position = position;
           this.email = email;
           this.telephone = telephone;
           this.salary = salary;
           this.age = age;


       }
       void getFullInfo(){
           System.out.println( fullName = "," + position + "," + email + "," + telephone + "," + salary + "," + age);
       }
       int getAge() {
           return age;
       }
   }
