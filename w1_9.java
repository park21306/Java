import java.util.Scanner;
class Prime{
    
    public boolean IsPrime(int a){
        boolean check = true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                check = false;
                break;
            }
        }
        return check;
    }
    
}
public class testPrime {
    public static void main(String[] args) {
        Prime obj = new Prime();
        Scanner input = new Scanner(System.in);
        boolean first = true;
        int max=0;
        while(true){
            int x = input.nextInt();
            if(x==0){break;}
            if(obj.IsPrime(x)){
                if(first){
                max = x;
                first = false;
            }
                if(x>max){
                    max = x;
                }
            }
        }
        if(max==0){
            System.out.println("-1");
        }
        else{
            System.out.println(max);
        }
    }
}
