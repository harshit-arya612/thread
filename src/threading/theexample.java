package threading;

public class theexample extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);

            try
            {
                sleep(500);

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
public static void main(String []a)
{
    theexample obj = new theexample();
    obj.start();
}

}
