public class ArrayOperations {
        public static void main(String[] args) {

            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {3, 4, 5, 6, 7};

            System.out.print("Union: ");

            // Print elements of first array
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }

            // Add elements of second array if not already in arr1
            for (int i = 0; i < arr2.length; i++) {
                boolean found = false;

                for (int j = 0; j < arr1.length; j++) {
                    if (arr2[i] == arr1[j]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.print(arr2[i] + " ");
                }
            }

            System.out.print("\nIntersection: ");
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.print(arr1[i] + " ");
                    }
                }
            }
        }
    }

