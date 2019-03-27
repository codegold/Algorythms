package MyTests;

import java.util.*;
    public class FromCyberFo {

        public static void main(String[] args) {
            Integer [] m =  {1, 2, 2, 3, 4, 5, 5};
// for(Integer i=6; i>=0; i--){
// System.out.println(m[i]);
//}
            Set<Integer> sp1 = new HashSet<Integer>();
            for (int i=0; i<m.length; i++)
            {
                sp1.add(m[i]);
            }

            List qwerty = new ArrayList(sp1);
            //Collections.reverse(qwerty);
            System.out.println(qwerty);

        }
    }

