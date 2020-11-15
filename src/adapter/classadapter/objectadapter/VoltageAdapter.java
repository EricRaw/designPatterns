package adapter.classadapter.objectadapter;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
//适配器类
public class VoltageAdapter  implements IVoltage5V {
    //关联关系中的聚合
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV =0;
        if(voltage220V!=null){
            int src=voltage220V.output220V();
            System.out.println("对象适配器模式");
            dstV=src/44;
        }
        return dstV;
    }
}
