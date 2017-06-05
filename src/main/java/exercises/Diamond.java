package exercises;

public class Diamond {

    private static final String ASTERISK = "*";
    private static final String SPACE = " ";
    private static final String NEWLINE = "\n";

    public String isoscelesTriangle(Integer numberOfLines) {
        String isoscelesTriangle = "";

        for (int index = 0; index < numberOfLines; index++) {
            for (int kIndex = 0; kIndex < numberOfLines - index; kIndex++) {
                isoscelesTriangle += SPACE;
            }
            for (int jIndex = 0; jIndex < index * 2 + 1; jIndex++) {
                isoscelesTriangle += ASTERISK;
            }
            isoscelesTriangle += NEWLINE;
        }
        return isoscelesTriangle;
    }

    public String centeredDiamond(Integer numberOfLines) {
        return  null;
    }
}
