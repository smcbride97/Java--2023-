public class GenericMethod {
    // generic method
    // <type-param-list> ret-type meth-name(param-list)
    public static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[] x, V[] y) {
        if (x.length != y.length)
            return false;
        
        for (int i =0; i < x.length; i++)
            if (!x[i].equals(y[i]))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Integer[] nums2 = {1, 2, 3, 4, 5,};
        Integer[] nums3 = {1, 2, 7, 4, 5};
        Integer[] nums4 = {1, 2, 3, 4, 5 ,6};

        System.out.println(arrayEqual(nums, nums));
        System.out.println(arrayEqual(nums, nums2));
        System.out.println(arrayEqual(nums, nums3));
        System.out.println(arrayEqual(nums, nums4));

        Double[] doubles1 = {1.1, 2.2, 3.3, 4.4, 5.5};
        // System.out.println(arrayEqual(nums, doubles1));
    }
}
