package file;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class docfile {
	public static void main(String[] args) {
		/*
		 * cach 1 File file = new File("Test.txt"); try { BufferedReader br =
		 * Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8); String line =
		 * null; while (true) { line = br.readLine(); if (line == null) { break; } else
		 * { System.out.println(line); } } } catch (Exception e) { e.printStackTrace();
		 * }
		 */
		// cách 2
		File file2 = new File("Test.txt");
		try {
			List<String> allText = Files.readAllLines(file2.toPath(), StandardCharsets.UTF_8);
			for (String line : allText) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
