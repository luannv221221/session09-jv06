package ra.generic;

public class GenericMethod {
    public <E> void printElementOfArray(E[] array){
        for (E e : array) {
            System.out.println(e);
        }
    }
}
