
class operators{
    public static void main(String args[]){
        
        int a = 2;
        int b = 3;
        int result = a + b;
        System.out.println(result);

        int c = 2;
        int d = 3;
        int results = c * d;
        System.out.println(results);

        int e = 20;
        int f = 3;
        int resultss = e / f;
        System.out.println(resultss); //result = 6 (it gives only the quotient without a remainder) Also, this is an integer datatype

        int g = 20;
        int h = 3;
        int resultsss = g % h;
        System.out.println(resultsss); //result = 2 (This is the remainder from the previous calculation)

        //incrementing numbers
        int i = 3;
        i = i + 1;
        System.out.println(i);

        //or
        int j = 3;
        j += 1;
        System.out.println(j);

        // or incrementing by 1
        int k = 3;
        k++; //fetch the value then increment
        System.out.println(k);

        // or
        int m = 3;
        ++m; //increment then fetch the value
        System.out.println(m);

        //decrementing numbers
        int l = 3;
        l--;
        System.out.println(l);



        ////// COMPARING VALUES
        // BOOLEAN

        int n = 3;
        int o = 2;
        boolean ans = n < o;
        System.out.println(ans); //result = false

        int p = 3;
        int q = 3;
        boolean anss = p >= q;
        System.out.println(anss); //result = true

        int r = 3;
        int s = 3;
        boolean ansss = r != s;
        System.out.println(ansss); //result = false

        double t = 2.6;
        double u = 4.9;
        boolean anssss = t <= u;
        System.out.println(anssss); //result = true



        // COMPARING TWO DIFFERENT OPERATIONS
        //USE OF LOGICAL OPERATORS
        int v = 3;
        int w = 2;
        int x = 15;
        int y = 10;
        boolean res = v > w && x > y;
        System.out.println(res); //result = true


        int aa = 3;
        int bb = 2;
        int cc = 15;
        int dd = 10;
        boolean ress = aa > bb && cc < dd;
        System.out.println(ress); //result = false

        int ee = 3;
        int ff = 2;
        int gg = 15;
        int hh = 10;
        boolean resss = ee > ff || gg > hh;
        System.out.println(resss); //result = true
        System.out.println(!resss); //result = false
    }
}