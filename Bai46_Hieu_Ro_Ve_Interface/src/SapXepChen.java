
public class SapXepChen implements SapXep_Interface{

	@Override
	public void sapXepTang(int[] arr) {
		int n = arr.length;
		int key, j;
		for(int i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
	}

	@Override
	public void sapXepGiam(int[] arr) {
		int n = arr.length;
		int key, j;
		for(int i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while(j >= 0 && arr[j] < key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}
