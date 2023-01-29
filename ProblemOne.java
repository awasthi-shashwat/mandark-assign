class ProblemOne {
	public static void main(String[] args){
		int[] a = {1, 4, 6, 5, 1, 5};
        int[] b = {3, 2, 3, 2, 2, 2};
        int maxA = -1;
        int maxB = -1;
        int n = a.length;
        for(int i=0;i<n;i++){
            if(b[i] > a[i]){
                maxA = Math.max(maxA, b[i]);
                maxB = Math.max(maxB, a[i]);
            } else {
                maxA = Math.max(maxA, a[i]);
                maxB = Math.max(maxB, b[i]);
            }
        }
        System.out.println(maxA*maxB);
	}
}