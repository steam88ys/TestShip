package kr.hs.study.beans;

public class yacht implements Ship{
    @Override
    public void maxspeed(int speed) {
        System.out.println("최대 속도: "+speed);
    }

    @Override
    public void passenger(int passenger) {
        System.out.println("탑승 인원: "+passenger);
    }
}
