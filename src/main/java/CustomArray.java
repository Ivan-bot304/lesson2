import java.util.Arrays;

public class CustomArray {

   private int[] array;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public void insertInPosition(int pos, int value){
        if(pos<=(array.length-1)){
            int[] newArray = array.clone();
            array = new int[newArray.length+1];
            for(int i = 0; i  < pos; i++){
                array[i] = newArray[i];
            }
            array[pos]=value;
            for (int i = pos ; i <= newArray.length-1; i++){
                array[i + 1] = newArray[i];
            }
        }
    }

    public int length(){
        return array.length;
    }

    public void  deleteInPosition(int pos){
        if(pos<=(array.length-1)){
            int[] newArray = array.clone();
            array = new int[newArray.length-1];
            for(int i = 0; i  < pos; i++){
                array[i] = newArray[i];
            }
            for (int i = pos + 1; i <= newArray.length-1; i++){
                array[i - 1] = newArray[i];
            }
        }
    }

    public void filling (int value){
        for(int i = 0; i <=array.length-1; i++){
            array[i]=value;
        }
    }

    public void updateInPosition(int pos, int value){
        if(pos<=(array.length-1)){
            array[pos]=value;
        }
    }

    public int finde (String arg){
        // arg = "MAX" - поиск макс
        // arg = "MIN" - поиск мин
        int[] result = sort(arg).getArray();
        return result[result.length-1];
    }

    public CustomArray sort(String arg){
        // arg = "MAX" - Сортировка по возрастанию
        // arg = "MIN" - Сортировка по убыванию
        int[] newArray = array.clone();
        CustomArray result = new CustomArray (quickSort(newArray,0, array.length-1, arg));
        return result;
    }

    private int[] quickSort(int[] newArray, int low, int high, String arg) {

        if (newArray.length == 0)
            return newArray;

        if (low >= high)
            return newArray;

        int middle = low + (high - low) / 2;
        int opora = 0;
        opora = newArray[middle];
        int i = low, j = high;
        while (i <= j) {

            if(arg.equals("MIN")) {
                while (newArray[i] > opora) {
                    i++;
                }
                while (newArray[j] < opora) {
                    j--;
                }
            }
            if(arg.equals("MAX")) {
                while (newArray[i] < opora) {
                    i++;
                }
                while (newArray[j] > opora) {
                    j--;
                }
            }

            if (i <= j) {
                int temp = newArray[i];
                newArray[i] = newArray[j];
                newArray[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(newArray, low, j, arg);

        if (high > i)
            quickSort(newArray, i, high, arg);

        return newArray;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public int[] getArray() {
        return array;
    }
}
