package OOPSQuestions;

//03.Create a class Animal with a method sound().create a subclass Dog that
//inherits from animal and prints "Dog barks". [Using Inheritance]


class Animal {
    void sound() {
    }
}
    class Dog extends Animal{
        //Overriding sound() method
        void sound(){
            System.out.println("Dog Barks");
        }
        }
public class Question03 {
    public static void main(String[] args) {
        Dog s1 = new Dog();
        s1.sound();
    }
}




//Overriding:  The same method name, return type,  and parameters must be the same.
//Overloading : Same method name but diff in parameter.





