public class Main {
    public static void main(String[] args) {
    Person person1 = new Person("Alice", 25, "123 Street Name");
    person1.displayInfo();
        // Ubah nilai atribut menggunakan setter
        person1.setName("Bob");
        person1.setAge(30);
 
        // Tampilkan kembali informasi
        System.out.println("Updated Information:");
        person1.displayInfo();
    }
}