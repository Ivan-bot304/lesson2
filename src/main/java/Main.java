public class Main {
    public static void main(String[] args) {

        int[] array={9,0,8,7,4,5,4,3};
        CustomArray customArray=new CustomArray(array);
        System.out.println(customArray.toString());

        //добавление элемента в массив (в конец и в определенную позицию)
        customArray.insertInPosition(1,4);
        System.out.println(customArray.toString());

        //функцию вывод количества элементов в массиве
        System.out.println(customArray.length());

        //удаление элемента массива по индексу
        customArray.deleteInPosition(1);
        System.out.println(customArray.toString());

        //изменения значения по его индексу
        customArray.updateInPosition(4,5);
        System.out.println(customArray.toString());

        //функция вывода на экран всего массива
        System.out.println(customArray.toString());

        //функцию сортировки массива (по возрастанию и убыванию без изменения исходного массива)
        System.out.println(customArray.sort("MIN").toString() +" исходный: "+ customArray.toString());

        //функцию вывода максимального/минимального элемента
        System.out.println(customArray.finde("MAX"));

        //функцию заполнения массива одинаковыми элементами
        customArray.filling(3);
        System.out.println(customArray.toString());




    }
}
