import java.io.*;

class Sample3
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("��������͂��Ă��������B");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      if(res == 1){
         System.out.println("1�����͂���܂����B");
      }
      else{
         System.out.println("1�ȊO�����͂���܂����B");
      }
   }
}
