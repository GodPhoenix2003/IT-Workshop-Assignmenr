public class Prog15{
    public static void main(String[] args)throws Exception{
        String str = new String("Hello World");
        StringBuffer stb = new StringBuffer("Buffer");
        System.out.println("String Class Functions:");
        str = str.trim();
        System.out.println("Example of trim: "+str);
        System.out.println("Example of toUpperCase: "+str.toUpperCase());
        System.out.println("Example of toLowerCase: "+str.toLowerCase());
        System.out.println("Example of toString: "+str.toString());
        System.out.println("Example of valueOf: "+String.valueOf(str));
        System.out.println("Example of charAt: "+str.charAt(0));
        System.out.println("Example of compareTo: "+str.compareTo("Hello World"));
        System.out.println("Example of equals: "+str.equals("Hello World"));
        System.out.println("Example of indexOf: "+str.indexOf("World"));
        System.out.println("Example of length: "+str.length());
        System.out.println("Example of substring: "+str.substring(0,5));
        char [] ch = str.toCharArray();
        System.out.println("Example of toCharArray: "+ch[0]);

        System.out.println("StringBuffer Class Functions:");
        System.out.println("Example of append: "+stb.append("Buffer"));
        System.out.println("Example of capacity: "+stb.capacity());
        System.out.println("Example of charAt: "+stb.charAt(0));
        System.out.println("Example of delete: "+stb.delete(0,5));
        System.out.println("Example of deleteCharAt: "+stb.deleteCharAt(0));
        stb.ensureCapacity(20);
        System.out.println("Example of ensureCapacity: "+stb.capacity());
        stb.getChars(0, 2, ch, 0);
        System.out.println("Example of getChars: "+ch[0]+ch[1]+ch[2]+ch[3]);
        System.out.println("Example of indexOf: "+stb.indexOf("Buffer"));
        System.out.println("Example of insert: "+stb.insert(0,"Buffer"));
        System.out.println("Example of length: "+stb.length());
        stb.setCharAt(0,'B');
        System.out.println("Example of setCharAt: "+stb);
        stb.setLength(10);
        System.out.println("Example of setLength: "+stb);
        System.out.println("Example of substring: "+stb.substring(0,5));
        System.out.println("Example of toString: "+stb.toString());
    }
}