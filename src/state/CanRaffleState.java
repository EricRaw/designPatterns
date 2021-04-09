package state;

import java.util.Random;

/**
 * 可以抽奖的状态
 * @author EricRaww
 * @create 2021-04-09
 */
public class CanRaffleState extends State {
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣取过了积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等");
        Random random = new Random();
        int num = random.nextInt(10);
        if(num==0){
            activity.setState(activity.getDispenseState());
            return true;
        }else {
            System.out.println("so sorry,没有中奖");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没有中奖");

    }
}
