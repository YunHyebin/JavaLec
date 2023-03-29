package chap17_generic.clazz;

import java.util.HashMap;
import java.util.Map;

public class GroupA implements Group {
	private Map<String, String> memMap
	= new HashMap<String, String>();
	
	//기본생성자
	public GroupA() {
		this.memMap.put("홍길동", "조장");
		this.memMap.put("김말숙", "조원");
		this.memMap.put("김이름", "조원");
		this.memMap.put("이이름", "조원");
		this.memMap.put("박이름", "조원");
	
	}

	public Map<String, String> getMemMap() {
		return memMap;
	}

	public void setMemMap(Map<String, String> memMap) {
		this.memMap = memMap;
	}
	
	

}
