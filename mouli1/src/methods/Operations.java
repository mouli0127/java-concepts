package methods;

public class Operations {
	
	    //with no input and no return type
		public void show() {
			
			System.out.println("inside show function");
		}
		//method with string input
		public void process(String x) {
			String data = "Mr.Mrs " + x;
			System.out.println(data);
		}
		//method with int
		public void addTen(int x) {
			x = x + 10;
			System.out.println(x);
		}
		// funtion with two inputs
		public void sum(int x, int y) {
			int res= x+y;
			System.out.println(res);
					
		}
		//funtion that retuns int
		public int getNum() {
			int b =89;
			return b;
		}


	//funtion with str as return type
		public String getMsg() {
			String msg ="Registration success";
			return msg;
		}
		// method with i/p args and return value
		public int add(int x, int y) {
			int res= x+y;
			return res;
		}
		//input: two nums
		//return :  big value
		public int big(int a, int b) {
			if(a>b) {
				return a;
			}else {
				return b;
			}
		}
		//input: two nums
				//return : small value
				public int small(int a, int b) {
					if(a<b) {
						return a;
					}else {
						return b;
					}
				}

}
