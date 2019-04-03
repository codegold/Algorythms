package Lafore.ObjectSort;

class PersonData {
    private String lastName;
    private String firstName;
    private int age;

    //---------------------------------------------------------------------------

    public PersonData(String last, String first, int a) {           //Constructor
        firstName = first;
        lastName = last;
        age = a;
    }
    //---------------------------------------------------------------------------

    public void displayPerson() {
        System.out.print("Last name: " + lastName);
        System.out.print(".  First name: " + firstName);
        System.out.println(". Age: " + age);
    }
    //---------------------------------------------------------------------------

    public String getLast() {
        return lastName;
    }
/////////////////////////////////////////////////////////////////////////////////

    class ArrayInOb {
        private PersonData[] a;
        private int nElems;

        //-----------------------------------------------------------------------

        public ArrayInOb(int max) {                                 //Constructor
            a = new PersonData[max];
            nElems = 0;
        }
//-------------------------------------------------------------------------------

        public void insert(String last, String first, int age) {
            a[nElems] = new PersonData(last, first, age);
            nElems++;
        }
//-------------------------------------------------------------------------------

        public void display() {
            for (int i = 0; i < nElems; i++) {
                a[i].displayPerson();   //попробовать sout a[i] =  " "
                System.out.println(" ");
            }
        }
//-------------------------------------------------------------------------------

        public void insertionSort() {
            int in, out;
            for (out = 1; out < nElems; out++) {
                in = out;
                PersonData temp = a[out];
                while (in > 0 && a[in - 1].getLast().compareTo(temp.getLast()) > 0) ;
                {
                    a[in] = a[in - 1];
                    --in;
                }
                a[in] = temp;
            }
        }
    }


    class ObjectSortApp {
        public void main(String[] args) {
            int maxSize = 100;
            ArrayInOb arr = new ArrayInOb(maxSize);
        }
    }
}
/////////////////////////////////////////////////////////////////////////////////



