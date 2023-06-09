public class TestMethod {
    public static double getSum(double[] array) {
        double sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static double getAverage(double[] array) {
        return getSum(array)/array.length;
    }
    public static int getValueOfLastElement(int[] array) {
        return array[array.length-1];
    }
    public static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public static int[] getMInMaxValue(int[] array) {
        int[] minMaxValue = {getMinValue(array), getMaxValue(array)};
        return minMaxValue;
    }
    public static String getLongestString(String[] array) {
        String longestString = array[0];
        int[] l = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            l[i] = array[i].length();
        }
        for (int i=0; i<array.length; i++) {
            if (array[i].length() == getMaxValue(l)) {
                longestString = array[i];
            }
        }
        return longestString;
    }
    public static int[] getInversedArray(int[] array){
        int[] inversedArray = new int[array.length];
        int j = array.length;
        for (int i = 0; i < inversedArray.length; i++) {
            inversedArray[i] = array[j -1];
            j--;
        }
        return inversedArray;
    }

    public static void main(String[] args) {
        int[] myInt = {-3, 4, 54, 92, 42};
        double[] myDouble = {1.82, 82.23, 7.25, 42.899, 6.79}; 
        String[] myBuah = {"semangka" , "mengkudu", "apel", "jeruk"};

        // confirm method getSum
        System.out.println(getSum(myDouble));

        // confirm method getAverage
        System.out.println(getAverage(myDouble));

        // confirm method getValueOfLastElement
        System.out.println(getValueOfLastElement(myInt));

        // confirm method getMinValue
        System.out.println(getMinValue(myInt));

        // confirm method getMaxValue
        System.out.println(getMaxValue(myInt));

        // confirm method getMinMaxValue
        int[] minMax =  getMInMaxValue(myInt);
        for (int i = 0; i < minMax.length; i++) {
            System.out.print(minMax[i] + " ");
        }
        System.out.println();

        // confirm method getLongestString
        System.out.println(getLongestString(myBuah));

        // confirm method getInversedArray
        int[] inversed =  getInversedArray(myInt);
        for (int i = 0; i < inversed.length; i++) {
            System.out.print(inversed[i] + " ");
        }

    }   
}
