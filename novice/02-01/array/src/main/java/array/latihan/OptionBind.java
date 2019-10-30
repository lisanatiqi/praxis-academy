import fj.F;
import fj.data.Option;
import static fj.Show.intShow;
import static fj.Show.optionShow;
import static fj.data.Option.none;
import static fj.data.Option.some;

public final class OptionBind {
    public static void main(final String[] args) {
        final Option<Integer> o1 = some(7);
        final Option<Integer> o2 = some(8);
        final Option<Integer> o3 = none();

        F<Intger, Option<Integer>> f = i -> i % 2 == 0 ? some(i * 3) : none();
        final Option<Integer> o4 = o1.bind(f);
        final Option<Integer> o5 = o2.bind(f);
        final Option<Integer> o6 = o3.bind(f);

        optionShow(intShow).println(o4); // none
        optionShow(intShow).println(o5); // some(24)
        optionShow(intShow).println(o6); // none
    }
}