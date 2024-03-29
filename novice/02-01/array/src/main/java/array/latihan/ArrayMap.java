import fj.data.Array;
import static fj.data.Array.array;
import static fj.function.Integers.add;
import static fj.Show.arrayShow;
import static fj.intShow;

public final class ArrayMap {
    public static void main(String[] args) {
        final Array<Integer> a = array(1, 2, 3);
        final Array<Integer> b = a.map(add.f(42));
        final Array<Integer> c = a.map(i -> i + 42);
        arrayShow(intShow).println(b); // {43,44,45}
        arrayShow(intShow).println(c); // {43,44,45}
    }
}