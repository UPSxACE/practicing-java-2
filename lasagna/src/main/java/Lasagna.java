public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minutesPassed){
        return expectedMinutesInOven() - minutesPassed;
    }

    public int preparationTimeInMinutes(int numLayers){
        return numLayers * 2;
    }

    public int totalTimeInMinutes(int numLayers, int minutesPassed){
        return preparationTimeInMinutes(numLayers) + minutesPassed;
    }
}
