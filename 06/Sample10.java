import java.io.*;

class Sample10
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("���т���͂��Ă��������i1�`5�j");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      switch(res){
         case 1:
         case 2:
            System.out.println("������������΂�܂��傤�B");
            break;
         case 3:
         case 4:
            System.out.println("���̒��q�ł���΂�܂��傤�B");
            break;
         case 5:
            System.out.println("�����ւ�D�G�ł��B");
            break;
         default:
            System.out.println("1�`5�܂ł̐��т���͂��Ă��������B");
            break;
      }
   }
}
