package Arrays;


//arrays are fantastic when we want to access the elements using index
//TIme Complexity and Memory Complexity



public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arrayForBubbleSort={8,-2,78,59,12,3,0};
        int length=arrayForBubbleSort.length;

        for (int i=0;i<length;i++){
            for(int j=0;j<length-(i+1);j++){
                if(arrayForBubbleSort[j]>arrayForBubbleSort[j+1]){
                    int temp=arrayForBubbleSort[j];
                    arrayForBubbleSort[j]=arrayForBubbleSort[j+1];
                    arrayForBubbleSort[j+1]=temp;
                }else{
                    continue;
                }
            }
        }
        for(int i=0 ;i<arrayForBubbleSort.length;i++){
            System.out.println(arrayForBubbleSort[i]);
        }
    }

}
