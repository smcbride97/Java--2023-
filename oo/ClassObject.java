package oo;

public class ClassObject {
    private static int counter;

    public ClassObject() {
        counter++;
    }

    public static int getNumofInstances() {
        return counter;
    }

    public int getNum() {
        return counter;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++){
            ClassObject obj = new ClassObject();
            System.out.println(getNumofInstances());
            System.out.println(obj.getNum());
        }
    }
    
}
