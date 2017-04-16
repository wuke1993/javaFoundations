package chap07;

//********************************************************************
//  CommandLine.java       Java Foundations
//
//  Demonstrates the use of command line arguments.
//
//  �����в���������String���������У������ݸ�main����    
//  �����в�������ʹ�����Ž��������Ϊһ�������Դ���one two "two and half" three��
//
//  ����������������
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
