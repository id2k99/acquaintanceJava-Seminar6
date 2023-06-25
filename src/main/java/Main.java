import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MySet myobj = new MySet();
        System.out.println(myobj.add(1));
//        System.out.println(myobj.contains(1));
        System.out.println(myobj.add(2));
//        System.out.println(myobj.add(1));
        System.out.println(myobj.getValue(0));
        System.out.println(myobj.toString());
//        System.out.println(myobj.del(1));
//        System.out.println(myobj.del(2));
//        System.out.println(myobj.del(1));
//        System.out.println(myobj.isEmpty());
//        Iterator<Integer> iterator = myobj.iterator();
//        while (iterator.hasNext()){
//            int i = iterator.next();
//            System.out.println(i);
//        }

    }
}

class MySet {          // метод котоый добавляет новый элемент
   // private ArrayList<Integer> mylist = new ArrayList<>();
    private HashMap<Integer, Object> myDb = new HashMap();
    private static final Object MYOBJ = new Object();
    public boolean add(int elem) {
        return myDb.put(elem, MYOBJ) == null;
    }

    public boolean del(int elem) {         //метод который удаляет элемент
        return myDb.remove(elem) == MYOBJ;
    }

    public boolean isEmpty(){           //метод который вернёт true если в списке есть элемент
        return myDb.isEmpty();
    }

    public boolean contains(int elem){
        return myDb.containsKey(elem);
    }

    public int getValue(int id){   // метод который по индексу возвращает значение
        Object[] a = myDb.keySet().toArray();
        return (int) a[id];
        }

    public Iterator<Integer> iterator(){
        return myDb.keySet().iterator();
        }
    public String toString() {     // метод toString возвращающий строку с элементами множества
        Object[] a = myDb.keySet().toArray();
        String str = "";
        for (int i = 0; i < a.length; i++) {
            str = str + " " + a[i];
        }
        return str;
    }
}

