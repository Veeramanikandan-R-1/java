public class Main{
    public static int[] InsertionSort(int[] inputArr){     
        int arrSize = inputArr.length;
        for(int i =1; i<arrSize;i++){
            System.out.println(i);
            int key = inputArr[i];
            int j = i-1;
            System.out.println("j "+j);
            while(j>=0 && inputArr[j]>key){
                inputArr[j+1] = inputArr[j];
                j--;
            }
            inputArr[j+1] = key;
        }
        return inputArr;
    }
    public static void main(String[] args) {
        int[] testArr = {111,5,6,5,43};
        int[] result = InsertionSort(testArr);
        System.out.println("result: ");
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}