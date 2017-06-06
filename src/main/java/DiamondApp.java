import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import exercises.Diamond;

public class DiamondApp {

    public static void main(String Args[]){
        Diamond diamond = new Diamond();

        System.out.println("Isosceles triangle: \n" + diamond.isoscelesTriangle(3));
        System.out.println("Centered diamond: \n" + diamond.centeredDiamond(3));
        System.out.println("Centered diamond with name: \n" + diamond.centeredDiamondWithName(3, "Grace"));


    }
}
