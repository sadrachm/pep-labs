public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        if (arr.length==0){
            return -1;
        }        
        int maxima = arr[0];
        for (int x : arr) {
            if (x > maxima) {
                maxima = x;
            }
        }


        return maxima;
    }
}
