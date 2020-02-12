package src.SchildtWork.ErrorMessage;


public class ErrorMsg {
    String msgs[] = {"Error output", "Error input", "Error disk space", "Out of the bounds."};
    //int howBad[] = {3, 2, 1};
    static final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String getErrorInfo(int i) {

        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Unknown error";
    }
}

class ErrInfo {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();
        // При вызове метода используются константы,
        // объявленные с помощью ключевого слова final

        System.out.println(err.getErrorInfo(ErrorMsg.OUTERR)); //call static
        System.out.println(err.getErrorInfo(err.DISKERR));
        System.out.println(err.getErrorInfo(err.INDEXERR));



        //Err e = err.getErrorInfo(2);

//        System.out.println(e.msg + " level: " + e.severity);
//
//        e = err.getErrorInfo(19);
//
//        System.out.println(e.msg + " level: " + e.severity);

//        System.out.println(err.getErrorInfo(2));
//        System.out.println(err.getErrorInfo(19));
    }
}

//
//class Err {
//    String msg;
//    int severity;
//
//    public Err(String msg, int severity) {
//        this.msg = msg;
//        this.severity = severity;
//    }
//}