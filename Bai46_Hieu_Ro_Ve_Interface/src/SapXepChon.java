
public class SapXepChon implements SapXep_Interface{

	@Override
	public void sapXepTang(int[] arr) {
		int n = arr.length;
		int min;
		for(int i = 0; i < n -1 ; i++) {
			min = i;
			for(int j = i + 1; j < n; j++)
				if(arr[min] > arr[j])
					min = j;
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}

	@Override
	public void sapXepGiam(int[] arr) {
		int n = arr.length;
		int max;
		for(int i = 0; i < n -1 ; i++) {
			max = i;
			for(int j = i + 1; j < n; j++)
				if(arr[max] < arr[j])
					max = j;
			if(max != i) {
				int temp = arr[max];
				arr[max] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
