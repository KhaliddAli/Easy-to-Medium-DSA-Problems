import java.util.*;
public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int i=0 ; i<r ; i++)
		{
			for(int j=0 ; j<c ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		int t = r*c;
		int ele =0;
		int left = 0 , right = c-1 , top = 0 , bottom = r-1;

		while(ele<t)
		{

			for(int i=left ; ele<t && i<=right; i++)
			{
				System.out.print(arr[top][i] + " ");
				ele++;
			}
			top++;
			for(int i=top ;ele<t &&  i<=bottom; i++)
			{
				System.out.print(arr[i][right] + " ");
				ele++;
			}
			right--;
			for(int i=right ; ele<t && i>=left; i--)
			{
				System.out.print(arr[bottom][i] + " ");
				ele++;
			}
			bottom--;
			for(int i=bottom ;ele<t &&  i>=top; i--)
			{
				System.out.print(arr[i][left] + " ");
				ele++;
			}
			left++;


		}

		sc.close();
    }
}

/*
 * int left = 0, right = col - 1, top = 0, bottom = row - 1;

int tot = row * col;
int ele = 0;
while(ele < tot)
	for(int i = left; i <= right && ele < tot; i++)
		System.out.print(arr[top][i] + " ");
		ele++;
	top++;
	for(int i = top; i <= bottom && ele < tot; i++)
		System.out.print(arr[i][right] + " ");
		ele++;
	right--;
	for(int i = right; i >= left && ele < tot; i--)
		System.out.print(arr[bottom][i] + " ");
		ele++;
	bottom++;
	for(int i = bottom; i >= top && ele < tot; i--)
		System.out.print(arr[i][left] + " ");
		ele++;
	left++;

 */