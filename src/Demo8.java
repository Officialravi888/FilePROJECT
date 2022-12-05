class Demo8 {
    void mixedOps() {
        float f = 10.10f;
        int j =10;
        j = (int) f * j;
        System.out.println("j = (int) f * j :" + j);
    }
    public static void main(String args[]){
        Demo8 A = new Demo8();
        A.mixedOps();
    }
}