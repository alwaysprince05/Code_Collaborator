import java.util.ArrayList;

public class SubStr {
    public static void main(String[] args) {
        String str="abcde";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                // step 1
                // i=0; j=1, // print -> a
                 // i=0; j=2, // print -> ab
                  // i=0; j=3, // print -> abc
                   // i=0; j=4, // print -> abcd
                    // i=0; j=5, // in second loop for last character we have to run till length
                    // print ->abcde
                    // step 2:
                     // i=1; j=1, // print -> (1,1)->(1,0)// error// show j should start from i+1
                    //  // i=1; j=2, // print -> b
                     // i=1; j=3, // print -> bc
                      // i=1; j=4, // print -> bcd
                       // i=1; j=5, // print -> bcde
                       // step 3: i=2;j=3;print-> c
                        // i=2; j=4, // print -> cd
                         // i=2; j=5, // print -> cde
                         // step 4:
                         // i=3;j=4;print d
                         // i=3;j=5;print de
                         // step 5:
                         // i=4;j=5; print -> e
        System.out.println(str.substring(i,j));
             }
        }
    }
}