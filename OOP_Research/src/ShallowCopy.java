
public class ShallowCopy {
    public static void main(String[] args) {
        Address address1 = new Address("New York");
        Person person1 = new Person("Alice", address1);

        // Create a shallow copy
        Person person2 = person1.shallowCopy();

        // Modify the address of person1
        person1.address.city = "Los Angeles";

        // Both person1 and person2 share the same Address object
        System.out.println("Person 1 Address: " + person1.address.city); // Output: Los Angeles
        System.out.println("Person 2 Address: " + person2.address.city); // Output: Los Angeles
    }
}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy method
    Person shallowCopy() {
        return new Person(this.name, this.address);
    }
}
