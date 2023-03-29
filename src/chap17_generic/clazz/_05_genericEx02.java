package chap17_generic.clazz;

public class _05_genericEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyGroup<Group> stGr = new StudyGroup<Group>();
		
		List<Group> gList = new ArrayList<Group>();
		
		gList.add(new GroupA());
		
		stGr.setGroupList(gList);
		
		stGr.ge
	}

}
