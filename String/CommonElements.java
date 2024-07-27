
public class CommonElements {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 3, 5, 7, 11};
        int[] c = {3, 5, 7, 9, 12};

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length && k < c.length)
			{
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
                k++;
            } else {
                if (a[i] <= b[j] && a[i] <= c[k]) {
                    i++;
                } else if (b[j] <= a[i] && b[j] <= c[k]) {
                    j++;
                } else {
                    k++;
                }
            }
        }
    }
}