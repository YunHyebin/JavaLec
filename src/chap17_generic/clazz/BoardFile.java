package chap17_generic.clazz;

import java.util.List;

public class BoardFile<T> {
	//T == FreeBoard는 boardNo == fBoardNO
	// T == NoticeBoard는 boardNo == nBoardNO
	private int boardNo;
	//1. 자유게시판(FreeBoard), 2. 공지게시판(NoticeBoard)
	private int type;
	private String boardFileNm;
	
	private T t;
	
	private List<T> tList;
	
//	서버에 응답을 받아올 때
//	ResPonseEntity<T>

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getBoardFileNm() {
		return boardFileNm;
	}

	public void setBoardFileNm(String boardFileNm) {
		this.boardFileNm = boardFileNm;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "BoardFile [boardNo=" + boardNo + ", type=" + type + ", boardFileNm=" + boardFileNm + ", t=" + t + "]";
	}
	
	
	
	
	
	/*
	 * // 일일히 다 모든 키를 가져야 했음 int nBoardNo; int fBoardNo;
	 */
	

}
