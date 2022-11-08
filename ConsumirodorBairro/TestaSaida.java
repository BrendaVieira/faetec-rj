import java.io.*;


public class TestaSaida {

	public static void main(String[] args) throws IOException {
	OutputStream os = new FileOutputStream("Saída.txt");
	OutputStreamWriter osw = new OutputStreamWriter(os);
	BufferedWriter bw = new BufferedWriter(osw);
	
	bw.write("Leandro");
	
	bw.close();
	}

}
