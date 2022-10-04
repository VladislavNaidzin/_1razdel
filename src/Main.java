import java.util.Arrays;

public class Main {
public static void main (String[] args)
{
      //3 nomer
//    int chisloX;
//    int []array=new int[10];
//    chisloX=(int)((Math.random()-0.5)*20);
//    for (int i=0;i< array.length;i++) {
//       array[i]=(int)((Math.random()-0.5)*20);}
//    System.out.print("изначальный массив: ");
//    System.out.println(Arrays.toString(array));
//    System.out.print("удаляемое число: ");
//    System.out.println(chisloX);
//    System.out.print("конечный массив:    ");
//    System.out.println(Arrays.toString(moveElement(array, chisloX)));
//



//    for (int i=0;i< array.length;i++)
//    {if(array[i]==chisloX)
//    {for (int j=i;i< array.length;j++)
//    {array[i]=array[i+1];
//        arr
//        //array[array.length]=null;  }
//    }
//
//    }











    //3 nomer
//boolean  isPrime=true;
//    for (int i=2;i<= 10000000;i++) {
//        isPrime=true;
//        for (int j=2;j<i;j++)
//        {if (i%j==0)
//        {isPrime=false;
//        break;}
//        }
// if (isPrime) System.out.println(i );
//    }






















        //2.1 nomer
//    int bufer,min,imin;
//    int []array=new int[10];
//    for (int i=0;i< array.length;i++) {
//        array[i]=(int)((Math.random()-0.5)*200);}
//
//
//    for (int j=array.length;j>0;j--){imin=array.length-j;min=999999;
//        for (int i=array.length-j;i<array.length;i++) {
//
//            if (array[i]<min){min=array[i];imin=i;}}
//
//        bufer=  array[array.length-j];
//        array[array.length-j]=min;
//        array[imin]= bufer;
//    }
//
//    for (int mas:array
//    ) {System.out.println(mas );
//
//    }

    //2nomer
//    int bufer;
//    int []array=new int[10];
//    int []array2=new int[10];

//    for (int i=0;i< array.length;i++) {
//       array[i]=(int)((Math.random()-0.5)*200);}
//
//
//    Arrays.sort(array);
//    array2=Arrays.stream(array).sorted().toArray();
//    for (int mas:array
//         ) {System.out.println(mas );
//
//    }
//    System.out.println("\n" );
//    for (int mas:array2
//    ) {System.out.println(mas );
//
//    }



































    //1 nomer
//int sum=0, max=-1, min=999999;
//
//int []array=new int[50000];
//    for (int i=0;i< array.length;i++) {
//        array[i]=(int)(Math.random()*100);
//    }
//
//
//    for (int massiv:array) {
//if (massiv<min)min=massiv;
//if (massiv>max)max=massiv;
//sum=sum+massiv;
//    }sum= sum/ array.length;
//
//    for (int i=0;i< array.length;i++) {
//        System.out.println(array[i]);
//    }System.out.print("\n\n");
//
//    System.out.println("ебучее максимальное число = "+ max);
//    System.out.println("ебучее минимальное число = "+ min);
//    System.out.println("ебучая сумма = "+ sum);
}




        //3 nomer
//    private static int[] moveElement(int[] array, int chislo) {
//int newlen=array.length;
//        for(int i = 0; i< array.length; i++) {
//            if (array[i] == chislo) {
//                newlen--;
//            } else {
//                array[i - array.length + newlen] = array[i];
//            }
//        }
//
//    return Arrays.copyOf(array,newlen);}
//
//



//    public static int[] removeElement(int[] nums, int val){
//
//}

}
