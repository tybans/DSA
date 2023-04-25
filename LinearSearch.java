public class LinearSearch {
    // store the value that need to be checked into a variable
    // traverse the array 
    //check whether the array element is equal to the value to be searched
    // if yes then display else keep on searching it.

    public static int linearMeth(int[] arr, int value ){
        for(int i = 0;i <=arr.length-1; i++ ){
            if(arr[i]==value){
                System.out.println("Item found: " +arr[i]);
                return i;
            }
            
            
        }
        System.out.println("Item not found");
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 8, 10};
        int value = 8;
        System.out.println("The value found at index: "+linearMeth(arr, value));

    }
}