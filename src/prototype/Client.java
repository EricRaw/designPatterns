package prototype;

/**
 * @author EricRaww
 * @create 2020-11-08
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", 1, "white");
        sheep.setFriend(new Sheep("tom'friend", 1, "black"));
        Sheep friend = sheep.getFriend();
        System.out.println(friend.hashCode());
        System.out.println(sheep);
        System.out.println(sheep.hashCode());
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        Sheep clone = (Sheep)sheep.clone();
        Sheep friend1 = clone.getFriend();
        System.out.println(friend1.hashCode());
        System.out.println(friend == friend1);
        System.out.println(clone);
        System.out.println(clone.hashCode());

        sheep.setFriend(new Sheep("tom'friend1", 1, "black"));


        System.out.println(sheep);

    }
}
