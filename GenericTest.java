public class GenericTest {
    public static void main(String[] args) {
        // The process of removing/replacing generic type T with concrete type is called erasure
        Generic<Integer> intObject = new Generic<Integer>(88);
        System.out.println(intObject);

        //Generic<Integer> intObject2 = new Generic<Double>(88.8);

        Generic<Double> doubleObject = new Generic<Double>(88.8);
        System.out.println(doubleObject);

        Generic<String> stringObject = new Generic<String>("Hello");
        System.out.println(stringObject);

        Generic<Boolean> bObject = new Generic<Boolean>(true);
        System.out.println(bObject);

        GenericTwo<Integer, String> tObject = new GenericTwo<Integer, String>(88, "Generic");
        System.out.println(tObject);

        GenericNumber<Integer> number = new GenericNumber<Integer>(10);
        System.out.println(number.reciprocal());

        GenericNumber<Double> numberD = new GenericNumber<Double>(0.1);
        System.out.println(numberD.reciprocal());

        //GenericNumber<String> numberS= new GenericNumber<String>("hello");
        //System.out.println(numberS.reciprocal());

        //GenericPair<Integer, String> pair = new GenericPair<Integer, String>(1, "hello");
        GenericPair<Integer, Integer> pair = new GenericPair<Integer, Integer>(1, 10);
        GenericPair<Number, Integer> pair2 = new GenericPair<Number, Integer>(1.1, 10);
        //GenericPair<Integer, Number> pair3 = new GenericPair<Integer, Number>(1,10.1);

        GenericNumber<Integer> numberInt1 = new GenericNumber<Integer>(10);
        GenericNumber<Integer> numberInt2 = new GenericNumber<Integer>(-10);
        System.out.println(numberInt1.absEqual(numberInt2));

        GenericNumber<Double> numberD1 = new GenericNumber<Double>(10.2);
        GenericNumber<Double> numberD2 = new GenericNumber<Double>(-10.2);
        System.out.println(numberD1.absEqual(numberD2));

        GenericNumber<Double> numberD3 = new GenericNumber<Double>(-10.0);
        System.out.println(numberInt1.absEqual(numberD3));

        GenericConstructor gc = new GenericConstructor(6);
        System.out.println(gc.getX());
        GenericConstructor gc2 = new GenericConstructor(6.3);
        System.out.println(gc2.getX());

        Integer[] arry = {1,2,3};
        GenericIfClass<Integer> gic = new GenericIfClass<Integer>(arry);
        System.out.println(gic.contains(2));
        System.out.println(gic.contains(5));

        Double[] darry = {1.1, 2.2, 3.3};
        GenericIfClass<Double> gdc = new GenericIfClass<>(darry);
        System.out.println(gdc.contains(5.6));
        System.out.println(gdc.contains(2.2));

        String[] sarry = {"hello", "world"};
        GenericIfClass<String> gsc = new GenericIfClass<>(sarry);
        System.out.println(gsc.contains("hello"));
        System.out.println(gsc.contains("morning"));
    }
}
