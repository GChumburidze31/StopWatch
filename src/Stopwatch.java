import java.time.Duration;
import java.time.LocalTime;

public class Stopwatch {

    private LocalTime startTime;
    private LocalTime endTime;

    public Stopwatch (){this.startTime = null;}

    public void start(){
        endTime = null;
        startTime = LocalTime.now();
    }


    public void stop(){
        endTime = LocalTime.now();
    }



    public long elapsedTime (){

        Duration duration = Duration.between(startTime,endTime);

        return duration.getSeconds();
    }



}
