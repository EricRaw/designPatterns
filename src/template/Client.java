package template;

/**
 * @author EricRaww
 * @create 2020-12-15
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
        blackBeanSoyaMilk.make();
        SoyaMilk pennutSoyaMilk = new PennutSoyaMilk();
        pennutSoyaMilk.make();
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
