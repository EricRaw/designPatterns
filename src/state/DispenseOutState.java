package state;

/**
 * 奖品发放完毕状态
 * @author EricRaww
 * @create 2021-04-09
 */
public class DispenseOutState extends State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发放完了，请下次参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完了，请下次参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完了，请下次参加");
    }
}
