import fj.data.Array;
import static fj.data.Array.array;
import static fj.data.List.fromString;
import static fj.function.Characters.isLowerCase;

public final class ArrayExists {
    public static void main(String[] args) {
        final Array<String> a = array ("Hello", "Three", "what", "DAY", "iS", "iT");
        final boolean b = a.exists(s -> fromString(s).forall(isLowerCase));
        System.out.println(b); // true ("what" is the only value that qualifies; try removing it)
    }
}