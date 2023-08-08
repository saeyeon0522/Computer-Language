public class SplitTrim {
    public static void main(String[] args) {
        // split
        String lang = "Java, Cpp, Python, Javascript, Kotlin, Swift";
        String [] langs = lang.split(", ");
        System.out.println(langs.length);
        for (String l : langs) System.out.println(l);

        // trim
        String inside = "   \t abcd \tdef   ";
        String trimInside = inside.trim();
        System.out.println(trimInside); // inside space isn't removed
        String side = "   \t   xyz \t  ";
        String trimSide = side.trim();
        System.out.println(trimSide); // all whitespaces are removed
    }
}
