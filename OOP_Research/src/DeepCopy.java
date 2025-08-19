public class DeepCopy {
    
    public static void main(String[] args) {
        Address address1 = new Address("New York");
        Person person1 = new Person("Francis", address1);

        // Create a deep copy
        Person person2 = person1.deepCopy();

        // Modify the address of person1
        person1.address.city = "Los Angeles";

        // person2's address remains unchanged
        System.out.println("Person 1 Address: " + person1.address.city); // Output: Los Angeles
        System.out.println("Person 2 Address: " + person2.address.city); // Output: New York
    }
}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Deep copy method
    Address deepCopy() {
        return new Address(this.city);
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy method
    Person deepCopy() {
        return new Person(this.name, this.address.deepCopy());
    }
}