public class ArraySortWithoutSortMethod {
    public static void main(String[] args) {

        //initialising array
        int[] arr = {1, 5, 22, 3, 8, 6, 21, 51};
        int temp = 0;

        //printing the array before sorting
        System.out.println("Array before sorting: ");
        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();

        //sorting the array
        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        //printing array after sorting
        System.out.println("Array after sorting: ");
        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
