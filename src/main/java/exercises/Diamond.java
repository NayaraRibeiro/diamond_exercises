package exercises;

public class Diamond {

    private static final String ASTERISK = "*";
    private static final String SPACE = " ";
    private static final String NEWLINE = "\n";

    public String isoscelesTriangle(Integer numberOfLines) {
        String isoscelesTriangle = "";

        for (int i=0; i < numberOfLines; i++)
        {
            for (int k=0; k < numberOfLines - i; k++)
            {
                isoscelesTriangle += SPACE;
            }
            for (int j=0; j<i*2+1; j++)
            {
                isoscelesTriangle += ASTERISK;
            }
            isoscelesTriangle += NEWLINE;
        }
        return isoscelesTriangle;
    }
}
