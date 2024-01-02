class COD
{
  public static void main(String[] args) {
    byte b = 12;
    //short s = (byte)b;
    //int a = (byte)b;

    short s = b;
    int a = b;

    int x = 12;
   // byte y=(int)x;
   byte y = (byte)x;

   System.out.println("Byte --> Short"+" "+b+"-->"+s);
   System.out.println("Byte --> Int"+" "+b+"-->"+a);
   System.out.println(y);
  }
}
