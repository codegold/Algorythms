package src.AlgorythmsWork.AlgoDraw.DataArray;

public class ClassDataApp {
    public static void main(String[] args) {
    int maxSize = 100;
    ClassDataArray arr = new ClassDataArray(maxSize);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
//        arr.insert("Velasquez", "Jose", 72);
//        arr.insert("Lamarque", "Henry", 54);
//        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        arr.displayA();
        System.out.println();
        System.out.println("Try to find Stimson.");
        String searchKey = "Stimson";
        Person found = arr.find(searchKey);
        if(found != null){
            System.out.print("Found ");
            found.displayPerson();
        } else
            System.out.println("Can't find " + searchKey);

        System.out.println();
        System.out.println("Deleting Smith and Creswell");
        arr.delete("Smith");
        arr.delete("Creswell");

        arr.displayA();

    }
}
