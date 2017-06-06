package exercises;

public class Diamond {

    private static final String ASTERISK = "*";
    private static final String SPACE = " ";
    private static final String NEWLINE = "\n";

    public String isoscelesTriangle(Integer numberOfLines) {
        String isoscelesTriangle = "";

        for (int row = 0; row < numberOfLines; row++) {
            for (int numberOfSpaces = 0; numberOfSpaces < numberOfLines - row; numberOfSpaces++) {
                isoscelesTriangle += SPACE;
            }
            for (int numberOfAsterisks = 0; numberOfAsterisks < row * 2 + 1; numberOfAsterisks++) {
                isoscelesTriangle += ASTERISK;
            }
            isoscelesTriangle += NEWLINE;
        }
        return isoscelesTriangle;
    }

    public String centeredDiamond(Integer numberOfLines) {
        String topDiamond = "";
        String bottomDiamond = "";

        for (int row = 0; row < numberOfLines; row++) {
            for (int numberOfSpaces = 0; numberOfSpaces < numberOfLines - row; numberOfSpaces++) {
                topDiamond += SPACE;
            }
            for (int numberOfAsterisks = 0; numberOfAsterisks < row * 2 + 1; numberOfAsterisks++) {
                topDiamond += ASTERISK;
            }
            topDiamond += NEWLINE;
        }

        for (int row = numberOfLines - 1; row > 0; row--)
        {
            for (int numberOfSpaces = row; numberOfSpaces < numberOfLines + 1; numberOfSpaces++) {
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

    public String centeredDiamondWithName(Integer numberOfLines, String name) {
        String topDiamond = "";
        String bottomDiamond = "";

        for (int row = 0; row < numberOfLines - 1; row++) {
            for (int numberOfSpaces = 0; numberOfSpaces < numberOfLines - row; numberOfSpaces++) {
                topDiamond += SPACE;
            }
            for (int numberOfAsterisks = 0; numberOfAsterisks < row * 2 + 1; numberOfAsterisks++) {
                topDiamond += ASTERISK;
            }
            topDiamond += NEWLINE;
        }

        topDiamond += SPACE + name + NEWLINE;

        for (int row = numberOfLines - 1; row > 0; row--)
        {
            for (int numberOfSpaces = row; numberOfSpaces < numberOfLines + 1; numberOfSpaces++) {
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
