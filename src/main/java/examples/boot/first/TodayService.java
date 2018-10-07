package examples.boot.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 다른 사람이 만든 클래스
@Service
public class TodayService {

    /*private 변수는 외부에서 접근할 수 없다.
    그런데 Spring은 어떻게 값을 할당할 수 있었을까?
    객체 지향의 관점에서는 어긋난다.
    그래서 @Autowired는 Spring이 아닌 곳에서는 작동하지 않는다.
    생성자 주입, @Autowired 둘 다 맞는 방식이지만, 본인에게 맞게 결정*/

    /*@Autowired
    private TodayBean todayBean;*/

    private TodayBean todayBean;

    //생성자 주입 방식
    public TodayService(TodayBean todayBean){
        this.todayBean=todayBean;
        System.out.println("TodayService Created : TodayService(TodayBean)");
    }
    /* TodayService를 생성하기 위해서는 TodayBean이 필요하다.
     * 그러면 스프링 컨테이너는 TodayService 객체 생성을 보류하고
     * TodayBean 객체를 먼저 생성한다.
     * */






    public String getTime(){
        return "오늘의 날짜와 시간 : "+todayBean.today();
    }

}
