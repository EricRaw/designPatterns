package state;

/**
 * 不能抽奖状态
 * @author EricRaww
 * @create 2021-04-03
 */
public class NoRaffleState extends State {
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除50积分，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    /**
     * 当前状态不能抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖呦");
        return false;
    }

    /**
     * 当前状态不能发奖品
     * @return
     */
    @Override
    public void dispensePrize() {
        System.out.println("不能发奖品");
    }
}
