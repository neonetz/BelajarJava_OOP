public class Person {
    //Membuat class
    String name;
    String address;
    final String country = "Indonesia";

    //Method di class
    void sayHello(String paramName){
        //Tampilkan ke layar
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
