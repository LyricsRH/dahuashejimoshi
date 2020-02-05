package 享元模式;

import java.util.HashMap;

public class FlyWeightFactory {

    HashMap<String,FlyWeight> map=new HashMap<>();
    public FlyWeightFactory(){
        map.put("a",new ConcreteFlyWeight());
        map.put("b",new ConcreteFlyWeight());
    }
    public FlyWeight getFlyWeight(String name){
        return map.get(name);
    }
}
