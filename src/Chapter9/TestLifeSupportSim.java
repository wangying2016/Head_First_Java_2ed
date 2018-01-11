import java.util.*;

class V2Radiator {
    V2Radiator(ArrayList<SimUnit> list) {
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2Radiator"));
            // System.out.println("v2 radiator created");
        }
    }
}

class V3Radiator extends V2Radiator {
    V3Radiator(ArrayList<SimUnit> lglist) {
        super(lglist);
        for (int g = 0; g < 10; g++) {
            lglist.add(new SimUnit("V3Radiator"));
            // System.out.println("v3 radiator created");
        }
    }
}

class RetentionBot {
    RetentionBot(ArrayList<SimUnit> rlist) {
        rlist.add(new SimUnit("Retention"));
        // System.out.println("retention created");
    }
}


class SimUnit {
    String botType;
    SimUnit(String type) {
        botType = type;
        System.out.println(type + " was created");
    }
    int powerUse() {
        if ("Retention".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}

// now
// 10 v2 radiator bots, 10 v3 radiator bots
// v2 : v3 == 1 : 1 rather than 1 : 2
// 20 retentioin bots
// radiator : retention == 1 : 1 rather than 3 : 4
// radiator bots power uses 20 * 40 == 80 rather than 60
// retention bots power uses 20 * 2 == 40
// total power use 120 rather than 100

public class TestLifeSupportSim {
    public static void main (String[] args) {
        ArrayList<SimUnit> aList = new ArrayList<SimUnit>();
        // 5 V2 radiator
        V2Radiator v2 = new V2Radiator(aList);
        // 5 v2 radiator, and 10 v3 radiator
        V3Radiator v3 = new V3Radiator(aList);
        // 20 retention bots
        for (int z = 0; z < 20; z++) {
            RetentionBot ret = new RetentionBot(aList);
        }
    }
}