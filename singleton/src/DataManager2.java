/**
 * Created by Hi on 12/30/2019.
 */
public class DataManager2
{
    private static DataManager2 ourInstance=null;

    public static DataManager2 getInstance() {
       if(ourInstance == null)
       {
           ourInstance=new DataManager2();
       }

        return ourInstance;
    }
    public  String data;
    private DataManager2() {
        data="singleton class c#";
    }

    public  String getData()
    {
        return data;

    }
}
