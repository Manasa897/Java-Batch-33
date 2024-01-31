package functionalinterfaces;
public class Sum {
    public static int sumofarray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}