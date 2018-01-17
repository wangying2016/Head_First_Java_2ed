class MyException extends Exception {

}

public class MyExceptionTestDrive {
    public void doRiskyTing () throws MyException {
        System.out.println("throw MyException");
        if (true) {
            throw new MyException();
        }
    }

    public static void main(String[] args) {
        MyExceptionTestDrive t = new MyExceptionTestDrive();
        try {
            t.doRiskyTing();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

