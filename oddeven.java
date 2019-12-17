

    public class oddeven{

        int  oddEven = 0, t= 0;

         static int arr[] = {10,6,4,7,3,1,4,15,7,9,11,5,13,4,0,2,8,7,3,9,2,4,5,16,12,20,8};




        public  void oddEvenSort() throws InterruptedException {

            boolean isSorted = false;

            while (!isSorted) {
                isSorted = true;
                int temp = 0;


                for (int i = 1; i <= arr.length - 2; i = i + 2) {
                    if (arr[i] > arr[i + 1]) {
                        oddeventhread obj1=new oddeventhread(arr,i , temp);
                        obj1.start();

                            obj1.join();

                        isSorted = false;

                    }
                }

                
                for (int i = 0; i <= arr.length - 2; i = i + 2) {
                    if (arr[i] > arr[i + 1]) {
                        Thread thread = new Thread(new oddeventhread(arr,i , temp));
                        thread.start();
                        thread.join();
                        isSorted = false;
                    }
                }
            }


            return;
        }


        public static void main(String[] args) throws InterruptedException {
            oddeven oddEvenSorting = new oddeven();

            oddEvenSorting.oddEvenSort();

            for (int i = 0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }

