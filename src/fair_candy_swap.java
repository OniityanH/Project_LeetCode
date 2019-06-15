public class fair_candy_swap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = IntStream.of(A).sum();
        int sumB = IntStream.of(B).sum();
        for (int i = 0; i< A.length; i++){
            for (int j = 0; j< B.length; j++){
                if (sumA - A[i] + B[j] == sumB - B[j] + A[i] ){
                    return new int[]{A[i], B[j]};
                }
            }
        }
        return null;
    }
}
