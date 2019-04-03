package Lafore;

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

    class ArrayInOn {
        private PersonData[] a;
        private int nElems;

        //---------------------------------------------------------------------------

        public ArrayInOn(int max) {                                 //Constructor
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

        }
    }
}



