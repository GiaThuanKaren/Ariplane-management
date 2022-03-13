import java.io.IOException;

public class Test {
   public static void main(String[] args) throws IOException  {
	 RWFile rw = new RWFile();
	 CustomerList bl = new CustomerList();
	 String cusPath = "C:\\Users\\DELL\\Desktop\\Tri\\Source\\customer.txt";
	 rw.readFile(bl, cusPath);
   }
}
