import java.io.*;
import groovy.io.*;

def call(Map config=[:]) {
    def dir = new File("C:\\code\\sample_android_app-java");
    
    new File(dir.path + '\\releasenotes.txt').withWriter('utf-8')
    { 
        writer ->
        dir.eachFileRecurse(FileType.ANY) { file -> 
            if (file.isDirectory()) {
               writer.writeLine(file.name); 
            }
            else
            { 
                writer.writeLine('\t' + file.name + '\t' + file.length());
            }
       }
    }
}