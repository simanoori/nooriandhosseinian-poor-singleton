/**
 * Created by Hi on 12/30/2019.
 */
public class Main
{
    public static void main(String[] args) {
        String data=DataManager.getInstance().getData();
        System.out.println(data);


        String data2=DataManager2.getInstance().getData();
        System.out.println(data2);
    }
}
