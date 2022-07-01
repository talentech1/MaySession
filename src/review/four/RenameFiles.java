package review.four;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RenameFiles {

	public static void main(String[] args) throws IOException {

		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a file to rename");
			String oldFileName = input.nextLine();

			System.out.println("Enter a new file name");
			String newFileName = input.nextLine();

			renameFile(oldFileName, newFileName);
		}

	}

	public static void renameFile(String fileName, String newFileName) throws IOException {
		Path source = Paths.get("./Rename/" + fileName);
		Files.move(source, source.resolveSibling(newFileName));
	}

}
