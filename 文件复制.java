import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.sun.java.util.jar.pack.Package.File;

public class copy{
    public static void main(String[] args){
        //源文件路径
        String sourcefilepath="C:\\Users\\20704\\Desktop\\Java SE知识点.jpg";
        //目标文件路径
        String destfilepath="C:\\Users\\20704\\Desktop\\Java SE知识点1.jpg";
        copyfile(sourcefilepath,destfilepath);

    }
    public static void copyfile(string sourcefilepath,string destfilepath){
        //1.取的源文件与目标文件的File对象
        File sourcefile =new file(sourcefilepath);
        File destfile=new file(destfilepath);
        //2.取地输入输出流
        InputStream in=new FileInputStream(sourcefile);
        OutputStream out=new FileOutputStream(destfile);
        //3.数据输入输出
        int len=0;
        byte[] data=new byte[1024];
        long start=System.currentTimeMillis();
        while((len=in.read(data))!=-1){
            out.write(data, 0, len);

        }
        long end=System.currentTimeMillis();
        Sysrem.out.println("耗时"+(end-start)+"毫秒");

    }
}