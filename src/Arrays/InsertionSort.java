package Arrays;

public class InsertionSort {

    //unlike other algo , sorting will start from left to right
    //hence we wil have firstUnsortedindex rather than last unsorted index
    //here we will start the outer loop with firstunsorted index reaches last
    //we will have a inner loop which will decrease till the number is less tha that index
    //works like the card game


    public static void main(String[] args) {
        int[] intArray={8,-2,78,59,12,3,0};

        for (int firstUnsortedElement=1;firstUnsortedElement<intArray.length;firstUnsortedElement++){
            int temp=intArray[firstUnsortedElement];
            int i=firstUnsortedElement;
            for (;i>0  ;i--){
                if(intArray[i-1]>temp){
                    //swap(intArray,i,i-1);
                    intArray[i]=intArray[i-1];

                }else{
                    break;
                }
            }
            intArray[i]=temp;
            for(int j=0 ;j<intArray.length;j++){
                System.out.print(intArray[j]);
            }
        }
        for(int j=0 ;j<intArray.length;j++){
            System.out.println(intArray[j]);
        }


    }
    public static void swap(int[] array,int index1,int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
