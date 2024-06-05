package day23_stringBuuilderAccessModifier;

public class P01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Have a nice day");
        System.out.println(str);
        str.append("!");

        System.out.println(str);


        StringBuilder str2=new StringBuilder(7); //kapastesi 7 olarak ayarlandı
        System.out.println(str2.append("have a nice day"));
        //kapasitesi 72yi aşacak şekilde bir ekleme yapıldığı için
        //kapasite ototmatik olarak 2 katı alınıp 2 ekelenecek şekilde 16(2*eski kapasite+2) oldu
        System.out.println(str2);
        str2.replace(7,9,"WiseQuarter");
        System.out.println(str2.delete(5, 11));
        System.out.println(str2.insert(4, "Güzeldir"));


        StringBuilder str3=new StringBuilder("Java Candır");
        System.out.println(str3);
        System.out.println(str3.substring(5));//Candır
        System.out.println(str3); //Java Candır

        System.out.println(str3.toString().toLowerCase()); //java candır
        System.out.println(str3); // Java Candır
        System.out.println(str3.reverse());//rıdnaC avaJ




    }
}
