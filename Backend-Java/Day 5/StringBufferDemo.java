public class StringBufferDemo {

    public static void main(String[] args) {
        
        StringBuffer sb=new StringBuffer("Hello");  
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java
        
        sb.insert(1,"Java");//now original string is changed 
        System.out.println(sb);//prints HJavaello

        sb.replace(1,3,"Java");
        System.out.println(sb);//prints HJavalo

        sb.delete(1,3);
        System.out.println(sb);//prints Hlo

        sb.reverse();
        System.out.println(sb);//prints olleH

        sb.reverse();
        System.out.println(sb);//prints Hello

        sb.setCharAt(1,'i');
        System.out.println(sb);//prints Hillo

        sb.setLength(2);
        System.out.println(sb);//prints Hi

        sb.setLength(5);
        System.out.println(sb);//prints Hi \u0000\u0000

        sb.setLength(10);
        System.out.println(sb);//prints Hi \u0000\u0000\u0000\u0000\u0000

        sb.setLength(0);
        System.out.println(sb);//prints nothing


    }
    
}
