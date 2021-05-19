interface inter1 {
    public String show();
}

public class lambdaexp4{
    public static void main(String args[]){
        inter1 s=()->{
            return "No parameter";
        };
        System.out.println(s.show());
    }
}