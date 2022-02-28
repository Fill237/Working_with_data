public class task14 {

    public static void main(String[] args){
        int[] array = new int[15];
            for (int i = 0; i < array.length; i++){
                array[i] = ((int) (Math.random()*41)-20);
            }
        int max = getMax(array);
        System.out.println("Максимальное значение в массиве: " +max);
        int min = getMin(array);
        System.out.println("Минимальное значение в массиве: " +min);

        int srMin = Math.abs(max);
        int srMax = Math.abs(max);
            if (srMax > srMin){
                System.out.println("Наибольшее среднее значение: " +srMax);
            } else
                System.out.println("Наибольшее среднее значение: " +srMin);
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
            for (int i = 1; i<inputArray.length; i++){
                if (inputArray[i]>maxValue){
                    maxValue=inputArray[i];
                }
            }
            return maxValue;
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
            for (int i = 1; i<inputArray.length; i++){
                if (inputArray[i]<minValue){
                    minValue=inputArray[i];
                }
            }
            return minValue;
    }

}