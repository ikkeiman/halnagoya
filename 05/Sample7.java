import java.io.*;

class Sample7
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("���Ȃ��͒j���ł����H");
      System.out.println("Y�܂���N����͂��Ă��������B");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      char res = str.charAt(0);

      if(res == 'Y' || res == 'y'){
         System.out.println("���Ȃ��͒j���ł��ˁB");
      }
      else if(res == 'N' || res == 'n'){
         System.out.println("���Ȃ��͏����ł��ˁB");
      }
      else{
         System.out.println("Y�܂���N����͂��Ă��������B");
      }
   }
}
