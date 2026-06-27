package hw01;

public class Task3 {
    public class Person{
        public Person() {
            this ("张三", 20);
        }

        public Person(String tempName, int tempAge) {
            name = tempName;
            age = tempAge;
        }

        String name;
        int age;
        void speak(){
            System.out.println(String.format("name=%s,age=%d",name,age));
        }
    }

    public class Employee extends Person{
        Employee(){

        }

        Employee(String tempName,int tempAge, double tempSalary) {
            super(tempName, tempAge);
            salary = tempSalary;
        }
        
        double salary;
        void computeSalary(double hours,int rate) {
            salary = hours * rate;
        }
    }
}
