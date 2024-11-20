// class Outer{//outer
// static int StudentiD=101;

// static class StaticClass{//inner c lass
// void display(){
// System. out. println( "Studentld= : " +StudentiD) ;
// }
// public static void main(String[] args) {

// Outer.StaticClass obj-new Outer.StaticClass();
// obj. display();
// }
// }

class demo {

    public static void main(String args[]) {

        String str1, str2, str3;

        str3 = new String("jim");

        str1 = new String("jack");

        str2 = str1;

        str1 = new String("jill");

        str3 = str2;

        System.out.println(str3);

    }

}
