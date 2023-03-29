package chap17_generic.clazz;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup<T> {
	private List<T> groupList = new ArrayList<T>();

	public StudyGroup() {
		
	}
	
	public List<T> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<T> groupList) {
		this.groupList = groupList;
	}
	
	public List<String> getCap(){
		List<String> capList = new ArrayList<String>();
		for (T t: groupList) {
			capList = 
		}
//		for(int i=0; i <groupList.size(); i++) {
//			Map<String, String> groupMap = groupList.
//		}
		return capList;
	}
	
	public List<String> getMember(){
		
	}
	
	
	
	

}
