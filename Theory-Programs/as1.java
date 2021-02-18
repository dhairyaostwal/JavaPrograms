import java.util.*;

class maxSubarray{
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    int a[] = new int[n];

    void getData(){

    for(int i=0;i<n;i++){
        int inp = s.nextInt();
        a[i] = inp;
    }
    }

    void showData(){
    for(int i=0;i<n;i++){
        System.out.println(a[i]-1);
    }
    }

}

class assMain{
    public static void main(String arg[]){
        maxSubarray m = new maxSubarray();
        m.getData();
        m.showData();
    }
}