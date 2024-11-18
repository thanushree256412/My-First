import java.io.File;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Filedemo
{
  public static void main(String[] args)
  {
Scanner br= new Scanner(System.in);
DateFormat sdf=new SimpleDateFormat("MMMM DD , YYYY , hh:mma");
System.out.println("Enter the file name:");
String FileName=br.nextLine();
File f=new File(FileName);
String extension=null;
if(f.isDirectory())
{
 System.out.println(f.getName() +"is a directory");
 System.out.println("Directory size:"+f.length()+"bytes");
 System.out.println("File Last modified : "+sdf.format(f.lastModified()));
 System.out.println("List of Files:");
 String dir[]=f.list();
 for(int i=0;i<dir.length;i++)
 {
 System.out.println(dir[i]);
}
}
else if(f.isFile())
{
  int i=FileName.lastIndexOf(".");
  if(i>0)
  {
  extension=FileName.substring(i+1);
  }
System.out.println("File type:"+extension);
System.out.println(f.getName() +"is a file");
if(f.canRead())
{
System.out.println(FileName+"is readable");
}else
{
 System.out.println(FileName+"is not readable");
 }
 if(f.canWrite())
 {
  System.out.println("Filesize: "+f.length()+" bytes");
   System.out.println(sdf.format(f.lastModified())); 
   }
   }
   else
   {
   System.out.println(f.getName()+"File doesnt exist");
   }
   }
   }
   
   
   
   
   
   
   
   
   
   
