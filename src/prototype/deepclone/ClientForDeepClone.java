package prototype.deepclone;

/**
 * @author EricRaww
 * @create 2020-11-08
 */
public class ClientForDeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name="eric";
        deepProtoType.deepCloneableTarget=new DeepCloneableTarget("HY","HY class");
        System.out.println(deepProtoType);
//        DeepProtoType clone = (DeepProtoType)deepProtoType.clone();
        DeepProtoType clone =(DeepProtoType)deepProtoType.deepClone();
        System.out.println(clone);
        System.out.println(deepProtoType.hashCode());
        System.out.println(clone.hashCode());
        System.out.println(deepProtoType.deepCloneableTarget.hashCode());
        System.out.println(clone.deepCloneableTarget.hashCode());


    }
}
