import java.io.*;

class Sample6
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("a��b����͂��Ă��������B");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      char res = str.charAt(0);

      switch(res){
         case 'a':
            System.out.println("a�����͂���܂����B");
            break;
         case 'b':
            System.out.println("b�����͂���܂����B");
            break;
         default:
            System.out.println("a��b����͂��Ă��������B");
            break;
      }
   }
}
