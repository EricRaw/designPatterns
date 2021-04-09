package state;

/**
 * @author EricRaww
 * @create 2021-04-03
 * 状态抽象类
 */
public abstract class State {
    /**
     * 扣除积分
     */
    public abstract void deductMoney();
    /**
     *是否抽中奖品
     */
    public abstract boolean raffle();
    /**
     *发放奖品
     */
    public abstract void dispensePrize();
}
