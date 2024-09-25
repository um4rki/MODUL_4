package lesson3.Task5;

/**
 * Created by: Umar
 * DateTime: 9/11/2024 6:05 PM
 */
public final class ImmutableTask {
    private final String name;
    private final Integer age;


    public ImmutableTask(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "ImmutableTask{" +
                "name='" + name + '\'' +
                ", description='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ImmutableTask immutableTask = new ImmutableTask("Hello", 10);
        System.out.println(immutableTask);
    }
}
