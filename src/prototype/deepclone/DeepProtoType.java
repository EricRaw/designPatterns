package prototype.deepclone;

import java.io.*;

/**
 * @author EricRaww
 * @create 2020-11-08
 */
public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }


    //方法一：重写clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep=null;
        deep=super.clone();
        DeepProtoType deepProtoType=(DeepProtoType)deep;
        deepProtoType.deepCloneableTarget=(DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //方法二：通过对象的序列化实现
    public Object deepClone(){
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        Object object =null;
        try {
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出
            //反序列化
            oos.writeObject(this);
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            object =ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //close stream
        }
        return object;
    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}
