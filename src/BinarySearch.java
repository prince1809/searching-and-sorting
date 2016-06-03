/**
 * Created by prince on 6/3/16.
 */
public class BinarySearch {

    public int recursiveSearch(int arr[], int l, int r, int x){

        if( r >= l){
            int mid = l + (r-1)/2;

            if(arr[mid] == x)
                return mid;

            if(arr[mid] > x)
                return recursiveSearch(arr, l, mid-1, x);

            return recursiveSearch(arr, mid+1, r, x);
        }

        return -1;
        
    }
}
