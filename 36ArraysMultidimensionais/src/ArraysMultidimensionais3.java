public class ArraysMultidimensionais3 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {1,2,3};

        arrayInt[0] = new int[]{1,2};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,5,6,};

        int[][] arrayInt2 = {{1,2,3},{1,2,3,4,5},{1,2,3,4,5,6,7,8}};

        for (int[] arBase : arrayInt) {
            System.out.println("\n ----------");
            for (int num : arBase) {
                System.out.println(num);
            }
        }
    }
}
