import jdk.jshell.execution.Util;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        /*FileUtil.printFileInfo("/home/vishal/java/demos/bitcode.jpeg");
        FileUtil.printFileInfo("/home/vishal/java/demos");*/

        //File newFile1 = new File("/home/vishal/java/demos/java_java.txt");
        /*if(!newFile1.exists()) {
            try {
                newFile1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        /*if(newFile1.exists()) {
            newFile1.delete();
        }*/

        /*File vishalDir = new File("/home/vishal/java/demos/vishal_dir");
        if(!vishalDir.exists()) {
            vishalDir.mkdir();
        }

        System.out.println( vishalDir.delete() );*/

        /*File demosDir = new File("/home/vishal/java/demos/");
        System.out.println( demosDir.delete());*/

        /*File gamesDir = new File("/home/vishal/java/demos/games/ludo/bin");
        if (!gamesDir.exists()) {
            //System.out.println(gamesDir.mkdir());
            System.out.println(gamesDir.mkdirs());
        }*/

        //FileUtil.printListOfFileNames("/home/vishal/java");

        /*FileUtil.printListOfFileNames(
                "/home/vishal/java",
                new MyFileNameFilter()
        );

        FileUtil.printListOfFileNames(
                "/home/vishal/java",
                new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.endsWith(".pdf") || name.endsWith(".txt");
                    }
                }
        );*/

        //FileUtil.printListOfFiles("/home/vishal/java/demos");
        //FileUtil.printListOfFiles("/home/vishal/java/demos", new MyFileNameFilter());

        /*File dir = new File("/home/vishal/java/demos");
        File [] files = dir.listFiles(
                new FileFilter() {
                    @Override
                    public boolean accept(File file) {
                        return file.length() > (5 * 1024);
                    }
                }
        );
        for(File file : files) {
            System.out.println(file.getName() + " - " + file.length());
        }*/

        FileUtil.print(
                new File("/home/vishal/"),
                0
        );
    }

    static class MyFileNameFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            //System.out.println("Checking: " + name);
            if(name.contains("demo")) {
                return true;
            }
            return false;
        }
    }
}
