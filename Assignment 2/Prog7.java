public class Prog7 {
    int e;
    public void _callbyvalue_(int a){
        a += 10;
        System.out.println("a = " + a);
    }
    public void _callbyreference_(Prog7 a){
        a.e = 10;
        System.out.println("a.e = " + a.e);
    }
    public static void main(String []args){
        int x = 20;
        Prog7 obj = new Prog7();
        System.out.println("Call By Value :-");
        System.out.println("(Not Modified)x = " + x);
        obj._callbyvalue_(x);
        System.out.println("(Modified)x = " + x);
        System.out.println("Call By Reference :-");
        obj.e = 5;
        System.out.println("(Not Modified)obj.e = " + obj.e);
        obj._callbyreference_(obj);
        System.out.println("(Modified)obj.e = " + obj.e);
    }
}