package Lectures.Lecture_003;

//public class main1 {
//    public static void main(String[] args) {
//        Object o = 1; GetType(o); // java.lang.Integer
//        o = 1.2; GetType(o); // java.lang.Double
//    }
//    static void GetType(Object obj) {
//        System.out.println(obj.getClass().getName());
//    }
//}

//public class main1 {
//    public static void main(String[] args) {
//        System.out.println(Sum(1, 2));
//        System.out.println(Sum(1.0, 2));
//        System.out.println(Sum(1, 2.0));
//        System.out.println(Sum(1.2, 2.1));
//    }
//    static Object Sum(Object a, Object b) {
//        if (a instanceof Double && b instanceof Double) {
//            return (Object) ((Double) a + (Double) b);
//        } else if (a instanceof Integer && b instanceof Integer) {
//            return (Object) ((Integer) a + (Integer) b);
//        } else if (a instanceof Double && b instanceof Integer) {
//            return (Object) ((Double) a + (Integer) b);
//        } else if (a instanceof Integer && b instanceof Double) {
//            return (Object) ((Integer) a + (Double) b);
//        } else return 0;
//    }
//}

//import java.util.Arrays;
//
//public class main1 {
//    public static void main(String[] args) {
//        int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9};
//        int[] arr1 = new int[arr.length + 10];
//
//        System.arraycopy(arr, 0, arr1, 0, arr.length);
//        for (int i = arr.length; i < arr1.length ; i++) {
//            arr1[i] = i;
//        }
//        System.out.println(Arrays.toString(arr1));
//    }
//}

//import java.util.Arrays;
//public class main1 {
//    static int[] AddItem(int[] array, int item) {
//        int length = array.length;
//        int[] temp = new int[length + 1];
//        System.arraycopy(array, 0, temp, 0, length);
//        temp[length] = item;
//        return temp;
//    }
//    public static void main(String[] args) {
//        int[] a = new int[] { 0, 9 };
////        for (int i : a) { System.out.printf("%d ", i); }
//        a = AddItem(a, 2);
//        a = AddItem(a, 3);
////        for (int j : a) { System.out.printf("%d ", j); }
//        System.out.println(Arrays.toString(a));
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//
//public class main1 {
//    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(2809);
//        list.add("string line");
//        for (Object o : list) {
////            System.out.println(o);
//
//        }
//    }
//
//    static void lists() {
//        //    Разные способы создания
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>(10);
//        ArrayList<Integer> list4 = new ArrayList<>(list3);
//    }
//}

//import java.util.Arrays;
//import java.util.List;
//public class main1 {
//    public static void main(String[] args) {
//        int day = 29;
//        int month = 9;
//        int year = 1990;
//        Integer[] date = { day, month, year };
//        System.out.println(Arrays.toString(date));
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d); // [29, 9, 1990]
//    }
//}

//import java.util.Arrays;
//import java.util.List;
//public class main1 {
//    public static void main(String[] args) {
//        StringBuilder day = new StringBuilder("28");
//        StringBuilder month = new StringBuilder("9");
//        StringBuilder year = new StringBuilder("1990");
//        StringBuilder[] date = { day, month, year };
//        List<StringBuilder> d = Arrays.asList(date);
//        System.out.println(d); // [29, 9, 1990]
//        date[1] = new StringBuilder("09");
//        System.out.println(d); // [29, 09, 1990]
//
//    }
//}

//import java.util.List;
//public class main1 {
//    public static void main(String[] args) {
//        Character value = null;
//        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
//        System.out.println(list1);
//        List<Character> list2 = List.copyOf(list1);
//        System.out.println(list2);
//    }
//}

//import java.util.*;
//public class main1 {
//    public static void main(String[] args) {
//        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
//        for (int item : list) { System.out.println(item); }
//        Iterator<Integer> col = list.iterator();
//        while (col.hasNext()) {
//            System.out.println(col.next());
//        }
//    }
//}
