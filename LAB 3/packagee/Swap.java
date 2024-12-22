package packagee;

public class Swap{
		public void SwapInts(MyInt c, MyInt d){
			MyInt temp = new MyInt();
			temp.x = c.x;
			c.x = d.x;
			d.x = temp.x;
		}
	}