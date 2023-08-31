import java.io.File;
import java.io.FilenameFilter;

public class FileUtil {
    public static void printFileInfo(String filePath) {
        File file = new File(filePath);
        System.out.println("Abs Path: " + file.getAbsolutePath());
        System.out.println("Is file: " + file.isFile() + " is dir: " + file.isDirectory());
        System.out.println("length = " + file.length());
        System.out.println("Exists: " + file.exists());
        System.out.println("Last modified: " + file.lastModified());
        System.out.println("RWE: " + file.canRead() + " " + file.canWrite() + " " + file.canExecute() );
        System.out.println("is hidden: " + file.isHidden());
        System.out.println("---------------------------------------------------");

    }

    public static void printListOfFileNames(String dirPath) {

        File dir = new File(dirPath);
        if(dir.isFile()) {
            return;
        }

        String [] fileNames = dir.list();
        for(String fileName : fileNames) {
            System.out.println( fileName );
        }

    }

    public static void printListOfFileNames(String dirPath, FilenameFilter filenameFilter) {
        File dir = new File(dirPath);
        String [] fileNames = dir.list(filenameFilter);
        System.out.println("***************************************");
        for(String fileName : fileNames) {
            System.out.println(fileName);
        }
    }

    public static void printListOfFiles(String dirPath) {
        File dir = new File(dirPath);

        File [] files = dir.listFiles();
        for(File file : files) {
            System.out.println(file.getName() + " - " + (file.isFile() ? "F" : "D"));
        }
        System.out.println("----------------------------------");
    }

    public static void printListOfFiles(String dirPath, FilenameFilter filter) {
        File dir = new File(dirPath);

        File [] files = dir.listFiles(filter);
        for(File file : files) {
            System.out.println(file.getName() + " - " + (file.isFile() ? "F" : "D"));
        }
        System.out.println("----------------------------------");
    }

    public static void print(File file, int tabs) {
        for(int i = 0; i < tabs; i++) {
            System.out.print("\t");
        }
        System.out.println(file.getName());
        if(file.isFile()) {
            return;
        }

        tabs++;
        File [] files = file.listFiles();
        if(files != null && files.length > 0) {
            for (File file1 : files) {
                print(file1, tabs);
            }
        }
    }

}
