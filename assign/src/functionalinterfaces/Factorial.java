package functionalinterfaces;
public class Factorial {
    public static int checkfactorial(int num){
        int fac=1;
        for(int i=1;i<=num;i++){
            fac*=i;
        }
        return fac;
    }
}