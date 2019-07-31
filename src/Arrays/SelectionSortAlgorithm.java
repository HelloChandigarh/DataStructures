package Arrays;

//Get the largest unsorted index(the last index of the array)
//then search for the index of the largest element(loop thro the array till lastunsortedIndex
//interchange the largest element with the value at the largest unsorted index
//decrement the last unsorted index by 1
//Repeat

//This is an unstable algorithm as the relative position gets changed if the two elements are same
// but in bubble sort ,Its not the case
public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arrayForSelectionSort={8,-2,78,59,12,3,0};
        //int lastUnsortedIndex=arrayForSelectionSort.length-1;

        for (int lastUnsortedIndex=arrayForSelectionSort.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int indexOfLargestElement=0;
            for(int j=1;j<=lastUnsortedIndex;j++){
                if(arrayForSelectionSort[j]>arrayForSelectionSort[indexOfLargestElement]){
                    indexOfLargestElement=j;
                }
            }
            int temp=arrayForSelectionSort[indexOfLargestElement];
            arrayForSelectionSort[indexOfLargestElement]=arrayForSelectionSort[lastUnsortedIndex];
            arrayForSelectionSort[lastUnsortedIndex]=temp;

        }
        for(int i=0 ;i<arrayForSelectionSort.length;i++){
            System.out.println(arrayForSelectionSort[i]);
        }
    }


}
