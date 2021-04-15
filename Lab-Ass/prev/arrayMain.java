package Pack1;

import algorithm.*;
import java.util.*;

public class arrayMain extends array {

  public void findDuplicate(int a[]) {
      for(int i=0;i<a.length;i++){
          if(int j=i+1;j<a.length;j++){
              if(a[i]==a[j]){
                  System.out.println("Duplicate at "+i+" "+j);
              }
              a[j]=-1;
          }
      }

        System.out.println("Elements in array = ");
      for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
      }
  }

  public static void main(String args[]){
      arrayMain m = new arrayMain();
      m.to_get();
      m.findDuplicate(a);
  }
}
