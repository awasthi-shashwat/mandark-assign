class ProblemFive {
	public static void main(String[] args) {
        System.out.println(helper(8));
        System.out.println(helper(28));
        System.out.println(helper(496));
    }

    public static boolean helper(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i==0) {
                if (i * i != num)
                    sum = sum + i + num / i;
                else
                    sum = sum + i;
            }
        }
        return sum == num && num != 1;
    }
}