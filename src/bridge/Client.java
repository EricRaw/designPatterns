package bridge;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
public class Client {
    public static void main(String[] args) {
        FolderPhone folderPhone = new FolderPhone(new Apple());
        folderPhone.open();
        folderPhone.call();
        folderPhone.close();
        UpRightPhone upRightPhone = new UpRightPhone(new Apple());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();
    }
}
