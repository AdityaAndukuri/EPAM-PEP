
//import for Scanner and other utility classes
import java.util.*;
  
public class Rod_Cutting {
    public static int find_special(int x){
        int count = 0;
        while(x>0){
            x--;
            x/=2;
            count++;
            
        }
        return count;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x,test;
        test = sc.nextInt();
        while(test>0){
        x= sc.nextInt();
        System.out.println(find_special(x)-1);
        test--;
        }
 
    }
}