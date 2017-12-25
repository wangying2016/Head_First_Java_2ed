public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        // my code
//        SimpleDotCom dot = new SimpleDotCom();
//
//        int[] locations = {2, 3, 4};
//        dot.setLocationCells(locations);
//
//        // test missing
//        String userGuess = "1";
//        String result = dot.checkYourself(UserGuess);
//        String testResult = "failed";
//        if (result.equals("miss")) {
//            testResult = "passed";
//        }
//
//        // test hit
//        userGuess = "2";
//        result = dot.checkYourself(userGuess);
//        if (result.equals("hit")) {
//            testResult = "passed";
//        }
//
//        // test kill
//        userGuess = "3";
//        dot.checkYourself(userGuess);
//        userGuess = "4";
//        result = dot.checkYourself(userGuess);
//        if (result.equals("kill")) {
//            testResult = "passed";
//        }
//
//        System.out.println(testResult);

        // author's code
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}