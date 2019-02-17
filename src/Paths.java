import java.util.ArrayList;
import java.util.List;

public class Paths {
	private int id;
	private List<Site> list;

	public List<Site> getList() {
		return list;
	}

	public void setList(List<Site> list) {
		this.list = list;
	}

	public Paths(int id) {
		this.id = id;
		this.list = new ArrayList<Site>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}