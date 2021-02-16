class parentA{
    void parentA(){
        System.out.println("ParentA method");
    }
}

class parentB{
    void parentB(){
        System.out.println("ParentB method");
    }
}

class child extends parentA, parentB{
    void child(){
        System.out.println("Child method");
    }
}   

class multipleInher{
    public static void main(String ar[]){
        child c = new child();
        c.child();
    }
}

// interface cannot be created if object cannot be created

// all methods declared in interface are abstract