public class Main {

    public static void main(String[] args) {

        LinearSearch ls = new LinearSearch();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ls.search(arr,n,x);
        if(result == -1){
            System.out.println("Element Not Present");
        }else {
            System.out.println("Element found at "+ result);
        }

    }
}
