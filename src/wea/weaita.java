package wea;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;





public class weaita {
	
	public static void main(String[] args) throws Exception {
		String pathDir = "C:\\Users\\Sojiroh\\Downloads\\jc2";
		Path pathDirectorio = Paths.get(pathDir);
		try (DirectoryStream<Path> pathFiles = Files.newDirectoryStream(pathDirectorio)) {
			
			for (Path p: pathFiles) {
				
				System.out.println(p.getFileName());
				
	
				
			}
		} catch (IOException e) {
		
			throw new Exception("Error al procesar directorio: " + e.getMessage());
		}
		

	}
	

}
