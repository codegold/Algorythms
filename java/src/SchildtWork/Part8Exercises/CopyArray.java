package src.SchildtWork.Part8Exercises;

public class CopyArray {
    public static void main(String[] args) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i = 0; i < nums1.length; i++) {
            nums1[i] = i;
        }

        if (nums2.length >= nums1.length){
            for (int j = 0; j < nums2.length; j++) {
                nums2[j] = nums1[j];
            }
        }
    }
}
