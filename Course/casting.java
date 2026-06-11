class Casting {
    public static void main(String[] args) {

        byte b = 127;
        int a = 12;

        a = b;
        System.out.println(a);


        byte c = 127;
        int d = 256;

        d = c;
        System.out.println(a);


        float f = 5.6f;
        int x = (int)f;
        System.out.println(x);

        int k = 257;
        byte z = 127;

        byte j = (byte)k;

        int s = (int)z;

        System.out.println(s);

        System.err.println(j);   // reminder Values

        byte by = 10;
        byte yb = 20;

        int res = by * yb;
        System.out.println(res);
        
        int xx = 7;
        int yy = 5;
        int aa = 5;
        int bb = 9;


        boolean result = xx < yy & aa < bb;
         boolean resu = aa == yy & aa > bb;

        System.out.println(result);
         System.out.println(resu);
    }

    }