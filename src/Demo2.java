class Demo2{
    static void foreachOps() {
        int[][] ar = {{13,22},{36,43},{56,68},{71,83}};
        for(int i []: ar)
            for (int j : i)
                System.out.print(j+" ");
    }
    public static void main(String args[]) {foreachOps();
    }
}