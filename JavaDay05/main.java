import java.io.*;

public class main{
    public static void main(String[] args) throws IOException{
        ReadWrite RW = new ReadWrite();
	RW.ReadFile("test");
	RW.printRead();
	RW.setToWrite("Hello World\nFoo bar\n" + RW.getRead());
	RW.WriteFile("test2", true);
    }
}
