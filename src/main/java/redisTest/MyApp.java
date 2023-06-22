package redisTest;
import redis.clients.jedis.Jedis;

import java.util.List;

public class MyApp {

    public static void main(String[] args) {
        try {
            Jedis jedis = new Jedis("localhost",1000);
// prints out "Connection Successful" if Java successfully connects to Redis server.
            System.out.println("Connection Successful");
            System.out.println("The server is running " + jedis.ping());
            jedis.set("company-name", "500Rockets.io");
            System.out.println("Stored string in redis:: "+ jedis.get("company-name"));

            // open a connection to Redis

//            jedis.set("foo", "a" );
//            String value = jedis.get("foo");
//            System.out.println(value);

            jedis.lpush("tutorial-list", "Redis");
            jedis.lpush("tutorial-list", "Mongodb");
            jedis.lpush("tutorial-list", "Mysql");

            List<String> list = jedis.lrange("tutorial-list", 0 ,5);
            
            for(int i = 0; i<list.size(); i++) {
                System.out.println("Stored string in redis:: "+list.get(i));
            }


        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
