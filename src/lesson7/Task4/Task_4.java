package lesson7.Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>(List.of(
                new Employee("Muhammadjon",12),
                new Employee("Muhammadali",25),
                new Employee("Xondamir",33),
                new Employee("Og'abek",47),
                new Employee("Azizbek",59)
        ));
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Employees.txt"))){
            outputStream.writeObject(employees);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(ObjectInputStream ios = new ObjectInputStream(new FileInputStream("Employees.txt"))) {
            List<Employee> employees1 = (List<Employee>) ios.readObject();
            employees1.forEach(System.out::println);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }
}
class Employee implements Serializable{
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
