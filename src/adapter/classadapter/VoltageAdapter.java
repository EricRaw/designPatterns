package adapter.classadapter;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src=output220V();
        int dstV = src / 44;
        return dstV;
    }
}
