class Question {
    public static void main(String []args){
        int[] arr={2,3,5,6,8};
        Product(arr);
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        }
    }
    public static int[] Product(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=arr[i-1]*left[i-1];
        }
        int[] right = new int[n];
        right[n-1]=1;
        for(int j=n-2;j>=0;j--){
            right[j]=arr[j+1]*right[j+1];
        }
        for(int k=0;k<n;k++){
            arr[k]=right[k]*left[k];
        }
        return arr;
    }
}
