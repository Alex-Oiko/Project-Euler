package maximum.path;

public class Pair<K,V>{
	
	private Object K;
	private Object V;
	
	public Pair(Object K,Object V){
		this.K = K;
		this.V=V;
	}

	public Object getK() {
		return K;
	}

	public void setK(Object k) {
		K = k;
	}

	public Object getV() {
		return V;
	}

	public void setV(Object v) {
		V = v;
	}
	
}
