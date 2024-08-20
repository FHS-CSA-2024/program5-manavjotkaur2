//import stuff here?

//Your code here

public class Program5 {
    public static void main(String[] args){
        double royaleMiles = 286.0;
        double royaleGallons = 9.0;
        double koopakingMiles = 412.0;
        double koopakingGallons = 40.0;
        double pipeframeMiles = 361.0;
        double pipeframeGallons = 18.0;
        double badwagonMiles = 161.0;
        double badwagonGallons = 11.0;
        double royaleAverage = (royaleMiles/royaleGallons);
        royaleAverage = royaleAverage*10;
        royaleAverage = royaleAverage + 0.5;
        royaleAverage = (int)royaleAverage;
        royaleAverage = (double)royaleAverage/10;
        double koopakingAverage = koopakingMiles/koopakingGallons;
        koopakingAverage = koopakingAverage*10;
        koopakingAverage = koopakingAverage + 0.5;
        koopakingAverage = (int)koopakingAverage;
        koopakingAverage = (double)koopakingAverage/10;
        double pipeframeAverage = pipeframeMiles/pipeframeGallons;
        pipeframeAverage *= 10;
        pipeframeAverage += 0.5;
        pipeframeAverage = (int)pipeframeAverage;
        pipeframeAverage = (double)pipeframeAverage/10;
        double badwagonAverage = badwagonMiles/badwagonGallons;
        badwagonAverage *= 10;
        badwagonAverage += 0.5;
        badwagonAverage = (int)badwagonAverage;
        badwagonAverage = (double)badwagonAverage/10;
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println("Royale averaged " + royaleAverage + " m/g");
        System.out.println("Koopa King averaged " + koopakingAverage + " m/g");
        System.out.println("Pipe Frame averaged " + pipeframeAverage + " m/g");
        System.out.println("Badwagon averaged " + badwagonAverage + " m/g");
    }
}


//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.1 m/g
Badwagon averaged 14.6 m/g

*/
