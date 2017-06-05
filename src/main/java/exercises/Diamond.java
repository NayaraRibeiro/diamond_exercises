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
        String topDiamond = "";
        String bottomDiamond = "";

        for (int index = 0; index < numberOfLines; index++) {
            for (int kIndex = 0; kIndex < numberOfLines - index; kIndex++) {
                topDiamond += SPACE;
            }
            for (int jIndex = 0; jIndex < index * 2 + 1; jIndex++) {
                topDiamond += ASTERISK;
            }
            topDiamond += NEWLINE;
        }

        for (int row = numberOfLines - 1; row > 0; row--)
        {
            for (int kIndex = row; kIndex < numberOfLines + 1; kIndex++) {
                bottomDiamond += SPACE;
            }

            for (int numberOfAsterisks = (row * 2) - 1; numberOfAsterisks > 0; numberOfAsterisks--)
            {
                bottomDiamond += ASTERISK;
            }
            bottomDiamond += NEWLINE;
        }
        return topDiamond + bottomDiamond;
    }
}
