package 实验五.ex3.util;

import java.io.File;

/**
 * Created by 36249 on 2016/12/1.
 */
public class FileList {

    private static final int DIRECTORY = 0;
    private static final int FILE = 1;

    public static void printContentsInOneDirectory(String directoryPath){

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        for(int i = 0; i < files.length; ++i){

            if(files[i].isDirectory()){

                print(files[i].getName(),DIRECTORY,0);
            }
            else{

                print(files[i].getName(),FILE,0);
            }
        }
    }

    public static void readFileAndDirectory(String directoryPath){

        readFileAndDirectory(directoryPath,0);
    }


    private static void readFileAndDirectory(String directoryPath,int deepth){

        File[] files;
        File directory = new File(directoryPath);

        files = directory.listFiles();
        for(int i = 0; i < files.length ;++i){

            if(files[i].isDirectory()){

                print(files[i].getName(),DIRECTORY,deepth);
                readFileAndDirectory(files[i].getPath(),deepth+1);
            }
            else{

                print(files[i].getName(),FILE,deepth);
            }
        }
    }
    private static void print(String fileName,int mode,int deepth){

        String fileMode;
        if(mode == DIRECTORY){

            fileMode = "目录";
        }
        else{

            fileMode = "文件";
        }

        for(int i = 0; i < deepth ; ++i){

            System.out.print("--");
        }
        System.out.println("[" + fileMode + "]"
            + " " + fileName);
    }

}
