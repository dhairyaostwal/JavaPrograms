class array {

  public static void main(String a[]) {
    int arr[] = new int[20];
    int arr1[] = { 10, 30, 20 };

    int n = arr1.length;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        if (arr1[i]>arr1[j]) {
            int temp =arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.println(arr1[i]);
    }
  }
}
