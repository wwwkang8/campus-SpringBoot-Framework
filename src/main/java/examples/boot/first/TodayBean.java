package examples.boot.first;

import java.time.LocalDateTime;

// 다른 사람이 만든 클래스라고 가정한다.
// 클래스만 있고 소스는 없다. 스프링이 관리해 주도록 하고 싶다.
// 하지만 다른 사람이 만든 클래스라 코드를 변경할 수 없다.
public class TodayBean {

    public TodayBean(){
        System.out.println("TodayBean Created");
    }

    public String today(){
        LocalDateTime localDateTime=LocalDateTime.now();
        return localDateTime.toString();
    }

}
