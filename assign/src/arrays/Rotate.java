package arrays;
public class Rotate {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int n=2;
        System.out.println("Given array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<n;i++){
            int j,f;
            f=a[0];

            for (j=0;j< a.length-1;j++){
                a[j]=a[j+1];
            }
            a[j]=f;
        }
        System.out.println("Display after rotation");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}