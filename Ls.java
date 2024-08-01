import java.util.Scanner;
class Lse{
    static int lse(int k){
        int x[]=(1,2,3,4,5,6,7);
        for(int i=0;i<x.length;i++){
            if(x[i]==k){
                return (i+1);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc;=new Scanner(System.in);
        int k=sc.nextInt();
        int a=lse(k);
        System.out.println(a);
        
    }
}