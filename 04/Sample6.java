import java.io.*;

class Sample6
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("������3���͂��Ă��������B");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str1 = br.readLine();
      String str2 = br.readLine();
      String str3 = br.readLine();

      int sum = 0;
      sum += Integer.parseInt(str1);
      sum += Integer.parseInt(str2);
      sum += Integer.parseInt(str3);

      System.out.println("3�̐��̍��v��" + sum + "�ł��B");
   }
}
