package 原型模式;

public class SurfaceClone extends Resume {
    public SurfaceClone(int id) {
        super(id);
    }

    @Override
    public Resume clones() throws CloneNotSupportedException {
       //使用clone方法必须要使用Cloneable接口
        return (Resume) this.clone();
    }
}
