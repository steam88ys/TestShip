package kr.hs.study;

import kr.hs.study.beans.Ship;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Ship s1 = ctx.getBean("p1", Ship.class);
        s1.maxspeed(180);
        s1.passenger(30);
    }
}