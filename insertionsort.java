import java.util.Scanner;
class insertionsort{
    public static void main(String[] args){
        Scanner h = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=h.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the elements:");
            arr[i]=h.nextInt();
        }
        int i=0;
        for( i=1;i<arr.length;i++){
            int target=arr[i];
            int j =i-1;
            while(j>=0&&arr[j]>target){
                arr[j+1]=arr[j];
                j--;
                 
            }
            arr[j+1]=target;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

      
    } 
}