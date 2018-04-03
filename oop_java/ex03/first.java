

public class first{

    first(String name){
        System.out.println("Parent constructor called");
        Hello(name);
    }

    void Hello(String name){
        System.out.println("Hello " + name);
    }

}
