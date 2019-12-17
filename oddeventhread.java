

    public class oddeventhread extends Thread {
        int[] arr;
        int t;
        int i;


        public oddeventhread (int[] arr, int i, int t){
            this.arr = arr;
            this.t = t;
            this.i = i;
        }

        void swap(int[] arr,int i, int t){
            t= arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
        }

        @Override
        public void run() {
            swap(arr,i ,t);
        }
    }


