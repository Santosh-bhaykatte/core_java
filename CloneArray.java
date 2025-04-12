package core_Java;

public class CloneArray {
    public static void main(String[] args) {
        //For 1d array - creates deep copy, means copy actual values
        //For 2d array - creates shallow copy, means copy references
        int[] arr = {1, 2, 3, 4, 5};
        int[][] _2dArr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        //cloning 1d array
        int[] cloneArr = arr.clone();

        cloneArr[1] = 9;
        System.out.println(cloneArr[1]);
        System.out.println(arr[1]);

//        System.out.println("clone1dArr: "+ Arrays.toString(cloneArr));

        boolean isTrue = (arr == cloneArr) ? true : false;
        System.out.println("Are equal: "+ isTrue);

        System.out.println();

        //cloning 2d array
        int[][] clone2dArr = _2dArr.clone();

        clone2dArr[0][1] = 9;
        System.out.println(clone2dArr[0][1]);
        System.out.println(_2dArr[0][1]);

//        System.out.println("clone1dArr: "+ Arrays.toString(clone2dArr));

        //After cloning outer arrays references pointing to different memory locations but,
        //inner arrays share the same references
        boolean areEqual = (_2dArr[0] == clone2dArr[0]) ? true : false;
        System.out.println("Are equal: "+ areEqual);
    }
}
