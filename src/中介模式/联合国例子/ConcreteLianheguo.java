package 中介模式.联合国例子;

import com.sun.org.glassfish.external.amx.AMX;

public class ConcreteLianheguo extends lianheguo{

    Americam americam;
    England england;

    @Override
    void send(String mess, Country country) {
        if (country==americam){
            england.get(mess);
        }else {
            americam.get(mess);
        }
    }
}
