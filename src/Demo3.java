class Demo3 {
    static void jaggOps() {int ar[][] = new int[3][];
        ar[0]=new int [1];
        ar[1] = new int[2];
        ar[2] = new int [3];
        for(int i=0;i<ar.length;i++)
            for(int j=0;j<ar[i].length;j++)
                ar[i][j] = i*j;
        for(int i=0;i<ar.length;i++)
            for(int j=0;j<ar[i].length;j++)
                System.out.println("The value at location:ar["+i+"]"+"["+j+"]"+ " is :" + ar[i][j]);
    }
    public static void main(String args[]) {
        jaggOps();
    }
}