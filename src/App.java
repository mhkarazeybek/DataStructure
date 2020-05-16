public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //values Type - Reference Type 

        //Values Types
        /*
        Değer tipler bellekteki alana değer atayabildiğimiz tiplerdir
        byte
        short
        int
        long
        float
        double
        char
        string
        */
        int a = 5;

        // Stack                       Heap
        // a (5)


        //Reference Type
        /*
        Reference Tipler Bellekteki alana reference adresi alan tiplerdir.

        Stack                       Heap
        Object(#16AC44)             45 (#16AC44)
        array                       {1,3,5,7,9}
        array2                      {2,4,6,8,10} 

        class
        interface
        abstract
        diziler        
        */
        int[] array = new int[]{1,3,5,7,9};
        int[] array2 = new int[]{2,4,6,8,10};

        array = array2;
        array[3] =15;
        // for (int i : array2) {
        //     System.out.println(i);
        // }

        

    }
}
