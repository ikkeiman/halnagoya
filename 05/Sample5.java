import java.io.*;

class Sample5
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("��������͂��Ă��������B");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      switch(res){
         case 1:
            System.out.println("1�����͂���܂����B");
            break;
         case 2:
            System.out.println("2�����͂���܂����B");
            break;
         default:
            System.out.println("1��2����͂��Ă��������B");
            break;
       }
   }
}
