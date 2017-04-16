package chap07;

//********************************************************************
//  CommandLine.java       Java Foundations
//
//  Demonstrates the use of command line arguments.
//
//  命令行参数保存在String对象数组中，并传递给main方法    
//  命令行参数可以使用引号将多个字作为一个参数对待（one two "two and half" three）
//
//  需用命令行来运行
//********************************************************************

public class CommandLine
{
   //-----------------------------------------------------------------
   //  Prints all of the command line arguments provided by the
   //  user.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      for (String arg : args)
         System.out.println (arg);
   }
}
