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
        int salary;
        void computeSalary(int hours,int rate) {
            salary = hours * rate;
        }
    }
}
