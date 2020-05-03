import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num,d=0,f=0,num1;
        System.out.print("LINHAS: ");
        num = leia.nextInt();
        for(int i = 0; i <= num-1; i++){
            System.out.print("NÚMEROS: ");
            num1 = leia.nextInt();
            if(num1 >= 10 && num1 <=20){
                d+=1;
            }else{
                f+=1;
            }
        }

        System.out.println(d+" in");
        System.out.println(f+" out");

    }
}
