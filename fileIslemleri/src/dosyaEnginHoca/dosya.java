package dosyaEnginHoca;
import java.io.*;
import java.util.*;
public class dosya {
	public static void main(String[] args) throws IOException {
		//Olan bir dosyan�n i�ine txt olu�turma//
		File file = new File("C:\\Users\\Hp\\Desktop\\file\\file.txt");
			file.createNewFile();
			
		//Dosya yazma-Dosyaya veri Ekleme//
		FileWriter writer = new FileWriter("C:\\Users\\Hp\\Desktop\\file\\file.txt");
		writer.write("Sammememet\n");
		writer.write("Cavavavaur\n");
		writer.write("123");
		writer.close();
		
		//Dosya Bilgilerini �ekme-okuma//
		Scanner reader = new Scanner(file);
		while(reader.hasNextLine()) {
			System.out.println(reader.nextLine());
		}
		reader.close();
		}}


