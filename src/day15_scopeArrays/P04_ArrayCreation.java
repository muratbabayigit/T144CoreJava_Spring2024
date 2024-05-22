package day15_scopeArrays;

import java.util.Arrays;

public class P04_ArrayCreation {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};

        String [] str={"a","b","c"};
        String [] kisi={"Ali"};

        /*
        oluştururken
        Data Türü - [] - array ismi ={ uygun seçilmiş datalar }
         */

        System.out.println(arr); //[I@4617c264
        System.out.println(str); //[Ljava.lang.String;@36baf30c


        //Array data türündeki variable'lar direk YAZDIRILAMAZLAR
        //direk yazdırırsanız size array'in referans değerini gösterir
        // Array'in içindeki elemanları yazdırmak istersek toString() methodndan faydalanırz

        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]



        System.out.println(Arrays.toString(str)); //[a, b, c]
        System.out.println(arr[3]); //4

        arr[3]=128;
        System.out.println(Arrays.toString(arr));

        //arr[5]=101;
        //System.out.println(Arrays.toString(arr));


        // direkt oluşturulan arraylerde eleman kaç tane yazılmışsa o kadar eleman alır
        // sonradan arttırılamazlar
        // 5 elemanlı bir array'e 6. elman eklenemz
        // 4 elemanlı bir array' döndürülemezler

        int [] yeniArr=new int[5]; //Boş array oluşturma(default olan 0'lardan oluşur)
        //yeniArr={12,21,35,50,63};
        int [] yeniArr2={4,6,78,9,13};
        System.out.println(Arrays.toString(yeniArr2));

        int [] yeniArr4={4,6,78,13}; //direkt oluşturuyor

        yeniArr2=yeniArr4;
        System.out.println(Arrays.toString(yeniArr2));

        System.out.println(arr.length);
        System.out.println(yeniArr4.length);

        System.out.println(Arrays.toString(yeniArr));
        System.out.println(yeniArr.length);

    }
}
