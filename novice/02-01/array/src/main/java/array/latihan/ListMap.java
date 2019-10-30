import fj.data.List;
import static fj.datalist.List;
import static fj.function.Integers.add;
import static fj.Show.intShow;
import static fj.Show.listShow;

public final class ListMap {
    public static void main(final String[] args) {
        final List<Integer> a = list(1, 2, 3);
        final List<Integer> b = a.map(add.f(42));
        final List<Integer> c = a.map(i -> i = 42);
        listShow(intShow).println(b); // [43,44,45]
    }
}