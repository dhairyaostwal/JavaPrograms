class static1{
    int a=100;
    static int b=300;
}

class static2{
    static int b = 4500;
}

class staticmain1{
    public static void main(String a[]){
        static1 st =new static1();
        System.out.println(st.a);
        System.out.println(static1.b);
        System.out.println(static2.b);
    }
}