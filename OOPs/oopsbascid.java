package OOPs;

//abstract class
public class oopsbascid {
    public static void main(String[] args) {
        cube an = new cube(); 
        an.eat();
        
    }
}

abstract class animal{
    animal(){
        System.out.println("i am the parent animal");
    }
    void eat(){
        System.out.println("i am eating!!!!");
    }
     
    abstract void walk();
}


class tiger extends animal {
    tiger(){
        System.out.println("im tiger");
    }
    void walk(){
        System.out.println("i am walking");
    }
}
class cube extends tiger{
    cube(){
        System.out.println("im cube");
    }
    void walk(){
        System.out.println("i am runnuing");
    }
}
