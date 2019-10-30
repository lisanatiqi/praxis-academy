import fj.data.Array;
import static fj.data.Array.array;
import static fj.data.List.fromString;
import static fj.function.Characters.isLowerCase;

public final class ArrayForAll {
    public static void main(String[] args) {
        final Array<String> a = array("Hello", "There", "what", "day", "is", "it");
        final boolean b = a.forall(s -> fromString(s).forall(isLowerCase));
        System.out.println(b); // false ("There" is a counter-example; try removing it)
    }
}