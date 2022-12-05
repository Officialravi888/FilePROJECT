class Demo10 {
    char c;
    boolean b;
    public void defValue() {
        System.out.println("Default Character value : "+ c);
        System.out.println("Default Boolean value :" + b);
    }
    public void show() {
        char i= 'a';
        boolean b = true;
        System.out.println("Character value : "+ i);
        System.out.println("Boolean value :" + b);
    }
    public static void main(String args[]) {
        Demo10 obj = new Demo10();
        obj.defValue();
        obj.show();
    }
}