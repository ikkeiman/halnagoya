//�ԃN���X
class Car
{
   private int num;
   private double gas;
   public void setNumGas(int n, double g)
   {
      if(g > 0 && g < 1000){
         num = n;
         gas = g;
         System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
       }
       else{
         System.out.println(g + "�͐������K�\�����ʂł͂���܂���B");
         System.out.println("�K�\�����ʂ�ύX�ł��܂���ł����B");
       }
   }
   public void show()
   {
      System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
      System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
   }
}

class Sample2
{
   public static void main(String[] args)
   {
      Car car1 = new Car();

      //���̂悤�ȃA�N�Z�X�͂ł��Ȃ��Ȃ�܂��B
      //car1.num = 1234;
      //car1.gas = -10.0;

      car1.setNumGas(1234, 20.5);
      car1.show();

      System.out.println("�������Ȃ��K�\�����ʁi-10.0�j���w�肵�Ă݂܂�...�B");

      car1.setNumGas(1234, -10.0);
      car1.show();
   }
}
