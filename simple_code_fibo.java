class solution{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<5;i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        //System.out.println(fibonacci(n));
    }
}
