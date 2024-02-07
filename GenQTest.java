public class GenQTest {

    public static void main(String[] args) {
        Integer[] intArr = new Integer[10];
        // Type Inference with Diamond Operator
        // class-name<type-arg-list> var-name = new class-name<>(cons-arg-list);
        GenQ<Integer> q = new GenQImpl<>(intArr);

        try {
            for (int i = 0; i < 10; i++)
                q.enQueue(i * i);
        } catch (GenQException ex) {
            System.out.println(ex);
        }

        try {
            q.enQueue(100);
        } catch (GenQException ex) {
            System.out.println(ex);
        }

        System.out.println("Size: " + q.size());

        try {
            for (int i = 0; i < 5; i++)
                System.out.println(q.deQueue());
        } catch (GenQException ex) {
            System.out.println(ex);
        }

        System.out.println("Size: " + q.size());

        try {
            q.deQueue();
        } catch (GenQException ex) {
            System.out.println(ex);
        }

        System.out.println("Size: " + q.size());
        System.out.println();

        
        Double [] dArr = new Double[10];
        GenQ<Double> qd = new GenQImpl<>(dArr);

        try {
            for (int i = 0; i < 10; i++)
                qd.enQueue((double)i / 10);
        } catch (GenQException ex) {
            System.out.println(ex);
        }

        try {
            qd.enQueue(100.0);
        } catch (GenQException ex) {
            System.out.println(ex);
        }

        System.out.println("Size: " + qd.size());

        try {
            for (int i = 0; i < 5; i++)
                System.out.println(qd.deQueue());
        } catch (GenQException ex) {
            System.out.println(ex);
        }

        System.out.println("Size: " + qd.size());

        try {
            qd.deQueue();
        } catch (GenQException ex) {
            System.out.println(ex);
        }

        System.out.println("Size: " + qd.size());
        System.out.println();

    
        String[] sArr = new String[10];
        var qs = new GenQImpl<String>(sArr);
        // GenQ<String> qs = new GenQImpl<>(sArr);

        try {
            for (int i = 0; i < 10; i++)
                qs.enQueue("Number" + i);
        } catch (GenQException ex) {
            System.out.println(ex);
        }

        try {
            for (int i = 0; i < 5; i++)
                System.out.println(qs.deQueue());
        } catch (GenQException ex) {
            System.out.println(ex);
        }

        System.out.println("Size: " + qs.size());
    }
}
