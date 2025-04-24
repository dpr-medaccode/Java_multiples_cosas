import java.io.Serializable;
import java.util.Arrays;

public class Numeros implements Serializable {

    private int array[] = new int[10];

    public Numeros () {

        for (int i = 0; i < array.length; i++){

            array[i] = (int)(Math.random() * 101);
        }

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Numeros [array=" + Arrays.toString(array) + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Numeros other = (Numeros) obj;
        if (!Arrays.equals(array, other.array))
            return false;
        return true;
    }


}
