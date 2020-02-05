package 享元模式.example1;

import java.util.HashMap;

public class WebsiteFactory {

    HashMap<String,Website> table=new HashMap<>();

    public Website getWebsite(String name){
        if (!table.containsKey(name)){
            table.put(name,new ConcreteWebsite(name));
        }
        return table.get(name);
    }

    public int getWebCount(){
        return  table.size();
    }
}
