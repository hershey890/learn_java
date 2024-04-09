class ArrayDemo {
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 100;

        for(int i=0; i<anArray.length; i++) {
            System.out.println("element at index " + i + ": " + anArray[i]);
        }

        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = new int[5];
        
        String[][] names = {
            {"Mr.", "Mrs.", "Ms."},
            {"Smith", "Jones"}
        };
		
		int[] from = {1, 2, 3, 4};
		int[] to = new int[2];
		System.arraycopy(from, 2, to, 0, 2);
		for(int t: to)
			System.out.print(t + " ");
		System.out.println();

		String[] strArray = {"abc", "123"};
		System.out.println(java.util.Arrays.toString(strArray));
    }
}
