
public class ex {

    public static void main(String[] args) {

        outer:
        for (int iteration = 0; iteretion < 1; iteration++) {
            for (int innerIteration = 0; innerIteration < 10; innerIteration++) {
                if (innerIteration % 2 > 0) {
                    continue outer;
                }
            }
        }
    }
}
