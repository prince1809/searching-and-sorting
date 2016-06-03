public class Main {

    public static void main(String[] args) {


        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;

       /*
        LinearSearch ls = new LinearSearch();
        int result = ls.search(arr,n,x);
        if(result == -1){
            System.out.println("Element Not Present");
        }else {
            System.out.println("Element found at "+ result);
        }
        */

        /*
        BinarySearch bs = new BinarySearch();
        int result = bs.recursiveSearch(arr,0,n-1,x);
        if(result == -1){
            System.out.println("Element Not Present");
        }else {
            System.out.println("Element found at "+ result);
        }
        */

        BinarySearch bs = new BinarySearch();
        int result = bs.iterativeSearch(arr,0,n-1,x);
        if(result == -1){
            System.out.println("Element Not Present");
        }else {
            System.out.println("Element found at "+ result);
        }



    }
}
