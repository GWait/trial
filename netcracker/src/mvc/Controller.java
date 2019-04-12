package mvc;

public class Controller {
    private ConsoleView view = new ConsoleView();
    private DataArray array;

    public void run(){
        array = view.fetchArray();
        view.printArray(array);
        array.sort();
        view.printArray(array);
    }
}
