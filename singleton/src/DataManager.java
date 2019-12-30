/**
 * Created by Hi on 12/30/2019.
 */
public class DataManager {
    private static DataManager ourInstance = new DataManager();

    public static DataManager getInstance() {
        return ourInstance;
    }
    public  String data;
    private DataManager() {
        data="singleton class java";
    }

    public  String getData()
    {
        return data;

    }




}
