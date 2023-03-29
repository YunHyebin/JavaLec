package chap13_objectArray;

public class LectureManage {
	ILectureClass[] allLecture = new ILectureClass[100];
	
	public void add(ILectureClass target) {
		if(target == null) {
			//target이 null일 때

		}else {
			// target이 null이 아닐 때
			int Index = allLecture.length;
			if(Index < 100) {
				allLecture[Index] = target;
			}else {
				// 100 초과시 
			}
		}
		
	}
	
	public void remove(IlectureClass target) {
		if(target != null && allLecture != null) {
			if(allLecture.length > 0) {
				for(ILectureClass item : allLecture) {
					if(target == item) {
						
					}
				}
			}
		}
		
	}

}
