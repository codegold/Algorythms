package src.SchildtWork.ErrorMessage;


public class ErrorInfo {
    String msgs[] = {"Error 1", "Error 2", "Error 3"};
    int howBad[] = {3, 2, 1};

    Err getErrorInfo(int i) {

        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howBad[i]);
        else
            return new Err("Unknown error", 0);
    }
}

class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e = err.getErrorInfo(2);

        System.out.println(e.msg + " level: " + e.severity);

        e = err.getErrorInfo(19);

        System.out.println(e.msg + " level: " + e.severity);

//        System.out.println(err.getErrorInfo(2));
//        System.out.println(err.getErrorInfo(19));
    }
}


class Err {
    String msg;
    int severity;

    public Err(String msg, int severity) {
        this.msg = msg;
        this.severity = severity;
    }
}