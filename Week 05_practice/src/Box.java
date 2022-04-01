
public class Box {
	int width, length, height;
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
	}
	
	boolean isSameBox(Box obj) {
		if ((obj.width == this.width)&(obj.length==this.length)
				&(obj.height==this.height))
			return true;
		else
			return false;
	}
}

