public class IT24102555Lab2Q1{
     public static void main (String[] args)
   {
          //Given perimeter
          double perimeter=100;
          //width is 3/4 of the length
          //perimeter formula:2*(length+width)=perimeter
          //width=3/4*length
          //perimeter formula:
          //2*(length+3/4*length)=perimeter
          //2*(7/4*length)=perimeter
          //7/2*length=perimeter
          //length=(2*perimeter)/7

          double length=(2*perimeter)/7;
          double width=(3.0/4.0)*length;


          System.out.println("length of the fence is:"+length);
          System.out.println("width of the fence is:"+width);
   }
}