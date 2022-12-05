class Demo9 {
    byte b;
    short sh;
    int i;
    long l;
    float f;
    double d;

    public void show() {
        System.out.println("b :" +"         "+b);
        System.out.println("Short :"+"     "+sh);
        System.out.println("Int :" +"       "+i);
        System.out.println("Long :" + "     "+l);
        System.out.println("Float :" + "    "+f);
        System.out.println("Double :" + "   "+d);
    }

    public static void main(String[] args) {
        Demo9 Obj = new Demo9();
        Obj.show();
    }
}