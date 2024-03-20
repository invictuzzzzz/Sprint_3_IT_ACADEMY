package TEMA_2.NIVEL_2;

public abstract class Payment {

    public void executeWith(Callback callback) {
        if (callback != null) {
           callback.call();
        }
        execute();
    }
    public abstract void execute();
}
