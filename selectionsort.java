class selectionsort{
    public static void main(String[] args){
        int arr[]={8,4,6,43,0,2};
        for(int i=0;i<arr.length;i++){
            int mid=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mid]){
                    int temp=arr[j];
                    arr[j]=arr[mid];
                    arr[mid]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
        }
        System.out.println(arr[arr.length-2]);
    } 
}
