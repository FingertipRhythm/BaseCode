package oop.oop2;

public class ValueTransferTest2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m=10;
        data.n=20;
        System.out.println("m="+data.m+",n="+data.n);

        ValueTransferTest2 test2 = new ValueTransferTest2();
        test2.swap(data);
        System.out.println("m="+data.m+",n="+data.n);
    }

    public void swap(Data data){
        int temp=data.m;
        data.m=data.n;
        data.n=temp;
    }
}
class Data{
    int m;
    int n;
}