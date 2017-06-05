package exercises;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DiamondTest {

    private Diamond diamond;

    @Before
    public void setUp() {
       diamond = new Diamond();
    }

    @Test
    public void shouldReturnIsoscelesTriangle(){
        assertThat(diamond.isoscelesTriangle(3), is("   *\n  ***\n *****\n"));
    }

    @Test
    public void shouldReturnCenteredDiamond(){
        assertThat(diamond.centeredDiamond(3), is("   *\n  ***\n *****\n  ***\n   *\n"));
    }



}