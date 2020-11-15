package adapter.classadapter.interfaceadapter;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter= new AbsAdapter(){
            //仅覆盖需要用到的方法
            @Override
            public void m2() {
                System.out.println("my m2");
            }
        };
        absAdapter.m2();
        absAdapter.m1();
    }
}
