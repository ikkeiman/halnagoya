import java.io.*;

class Sample4
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("�����܂ł̍��v�����߂܂����H");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int num = Integer.parseInt(str);

      int sum = 0;
      for(int i=1; i<=num; i++){
         sum += i;
      }

      System.out.println("1����" + num + "�܂ł̍��v��"+ sum + "�ł��B");
   }
}
