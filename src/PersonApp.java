public class PersonApp {
    public static void main(String[] args) {
        //Membuat object
        //Cara pertama membuat object
        var person1 = new Person();
        //Manipulasi field
        person1.name = "Asep Penyu";
        person1.address = "Jawa";
        //Memanggil method dari class
        person1.sayHello("Asep Penyu");

        //Akses data person1
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        //Cara pertama
        Person person2 = new Person();
        person2.name = "Budi";
        person2.address = "Sunda";
        person2.sayHello("SEPPP");

        //Cara kedua membuat object
        Person person3;
        person3 = new Person();
        person3.name = "Nandang";
        person3.address = "Batak";
        person3.sayHello("SONNNN");

        //Tampilkan object ke layar
        System.out.println(person2);
        System.out.println(person3);
    }
}
