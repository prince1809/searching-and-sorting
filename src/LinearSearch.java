/**
 * Created by prince on 6/3/16.
 */
public class LinearSearch {

    public int search(int arr[], int n, int x){

        for (int i = 0; i < n; i++){
            if(arr[i] == x)
                return i;
        }

        return -1;
    }

}
