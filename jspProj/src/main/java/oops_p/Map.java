package oops_p;

import java.util.HashMap;

public class Map {
	HashMap<String, User> map = new HashMap<String, User>();
public Map() {
	// TODO Auto-generated constructor stub
}
	public Map(HashMap<String, User> map) {
		super();
		this.map = map;
	}

	public HashMap<String, User> getMap() {
		return map;
	}

	public void setMap(HashMap<String, User> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Map [map=" + map + "]";
	}
}
