import java.util.Arrays;
import java.lang.*;


/**
 * Created by Root on 09.02.2016.
 */
public class MyArrayList {

    Object MyPrimaryArray[] = new Object[10];

    private int actualSize = 10;
    private int newSize = 10;
    private int index;
    private int currentPos =0;


    public MyArrayList() {
    }


    public void Add(int index, Object o){
        if (index > MyPrimaryArray.length) {
            MyPrimaryArray = resize(index); }

        if (!isEmpty(index))
            throw new ArrayStoreException("Element data already in use. Use SET method");


           else
               MyPrimaryArray[index] = o;
           }


    public void Set (int index, Object o) {
        MyPrimaryArray[index] = o;
    }

    public boolean isEmpty(int index) {

        if (MyPrimaryArray[index] == null) return true;
        else return false;
    }



    private Object[] resize (int index) {


        if (index > MyPrimaryArray.length) {
            Object LocalTempArray[] = new Object [index + index /2];
            System.arraycopy(MyPrimaryArray,0,LocalTempArray,0,MyPrimaryArray.length);
            newSize = LocalTempArray.length;
            return LocalTempArray;
        }

        else
            newSize = MyPrimaryArray.length + (MyPrimaryArray.length / 2);
        Object LocalTempArray[] = new Object[newSize];
        System.arraycopy(MyPrimaryArray,0,LocalTempArray,0,MyPrimaryArray.length);


        return LocalTempArray;

    }

    public void remove (int index) {


        MyPrimaryArray[index] = null;

//        for (int i = index; i < MyPrimaryArray.length -1; i++)
//            MyPrimaryArray[i] = MyPrimaryArray[i+1];
//
//        MyPrimaryArray[MyPrimaryArray.length-1] = null;
            }


    public boolean hasNext (){
        if (++currentPos < MyPrimaryArray.length ) return true;
        else return false;

    }

    public Object Next () {
        return MyPrimaryArray[currentPos];

    }

    public int length (){
        return MyPrimaryArray.length;
    }


    public Object Get (int index){
        return MyPrimaryArray[index];
    }



    public String checkClass (int index) {
        return MyPrimaryArray[index].getClass().getName();

    }

    @Override
    public String toString() {
        return  "{" +
                "MyPrimaryArray=" + Arrays.toString(MyPrimaryArray) +
                '}';
    }
}
