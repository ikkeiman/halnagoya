import java.io.*;

class Sample11
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("���Ԗڂ̏������΂��܂����H�i1�`10�j");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      for(int i=1; i<=10; i++){
         if(i == res)
            continue; 
         System.out.println(i + "�Ԗڂ̏����ł��B");
      }
   }
}
