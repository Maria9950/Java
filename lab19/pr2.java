package lab19;

enum TrafficLight {
    RED(30),     //красный горит 30 секунд
    YELLOW(5),   //жёлтый 5 секунд
    GREEN(25);   //зелёный 25 секунд

    private final int seconds;

    TrafficLight(int seconds) {
        this.seconds = seconds;
    }

    //дополнительный метод
    public void showTime() {
        System.out.println(name() + " горит " + seconds + " секунд");
    }
}

public class pr2 {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            light.showTime();
        }
    }
}