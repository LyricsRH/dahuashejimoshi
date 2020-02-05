package 适配器模式.基本例子.篮球翻译例子;

public class MiddleTranslator extends Player {
    public MiddleTranslator(String name) {
        super(name);
        foreignMiddle.setName(name);
    }

    ForeignMiddle foreignMiddle=new ForeignMiddle();

    @Override
    void attack() {
            foreignMiddle.进攻();
    }

    @Override
    void defend() {
            foreignMiddle.防守();
    }
}
