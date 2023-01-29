class ProblemFour {
	public static void main(String[] args){
		int[] point = {1, 2};
        String path = "NEWS";
        int x = point[0], y = point[1];
        for(char ch : path.toCharArray()){
            if(ch == 'N')
                x += 1;
            else if (ch == 'S')
                x -= 1;
            else if (ch == 'E')
                y += 1;
            else
                y -= 1;
        }
        int deltaX = point[0] - x;
        int deltaY = point[1] - y;
        System.out.println(Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}
}