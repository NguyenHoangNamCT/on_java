
public class PhanMemMayTinh implements MayTinhBoTui_Interface, SapXep_Interface{

	@Override
	public void sapXepTang(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i ++)
			for(int j = i + 1; j < n; j++)
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
	}

	@Override
	public void sapXepGiam(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i ++)
			for(int j = i + 1; j < n; j++)
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
	}

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
