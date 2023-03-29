package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGenericClss {

	public static void main(String[] args) {
		// 자유게시판 게시그렝 대한 첨부파일
		// fBoardFile 변수에 BoardFile 객체 생성. 그 객체의 타입은 FreeBoard
		BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>();
		
		// 객체 넣는 방식1 : BoardFile 객체 안에 FreeBoard 타입 객체 생성 
		//-> FreeBoard에 대한 속성(멤버변수)가 set되지 않음
		fBoardFile.setT(new FreeBoard());
		fBoardFile.getT()
						.setfBoardNo(1);
		fBoardFile.getT()
						.setfBoardTitle("test2");
		fBoardFile.getT()
						.setfBoardContent("test2입니다.");
				
		// 객체 넣는 방식2 : FreeBoard 객체를 생성 후 FreeBoard에 대한 멤버변수 set
//		FreeBoard fBoard = new FreeBoard();
//		fBoard.setfBoardNo(1);
//		fBoard.setfBoardTitle("test");
//		fBoard.setfBoardContent("test입니다.");
//		fBoardFile.setT(fBoard);
		
		//fBoardFile의 freeBoard 에 대한 속성을 가져와 멤버변수 설정
		fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo());
		
		fBoardFile.setType(fBoardFile
				.getT()
				.getClass()
				.getSimpleName()
				.equals("FreeBoard") ? 1: 2);
		
		fBoardFile.setBoardFileNm("첨부파일");
		System.out.println("<<fBoardFile>>");
		System.out.println(fBoardFile);
		//BoardFile [boardNo=1, type=1, boardFileNm=첨부파일, t=FreeBoard [fBoardNo=1, fBoardTitle=test, fBoardContent=test입니다.]]
		

		
		// 공지사항 게시글에 대한 첨부파일
		BoardFile<NoticeBoard> nBoardFile = new BoardFile<NoticeBoard>();
//		nBoardFile.setT(new NoticeBoard());
//		nBoardFile.getT().setnBoardNo(2);
//		nBoardFile.getT().setnBoardTitle("");
//		nBoardFile.getT().setnBoardContent("");

		NoticeBoard nBoard = new NoticeBoard();
		nBoard.setnBoardNo(2);
		nBoard.setnBoardTitle("test");
		nBoard.setnBoardContent("test입니다");
		nBoardFile.setT(nBoard);
		
		
		nBoardFile.setBoardNo(nBoardFile.getT().getnBoardNo());
		nBoardFile.setType(nBoardFile
				.getT()
				.getClass()
				.getSimpleName()
				.equals("NoticeBoard") ? 2 : 1);
		nBoardFile.setBoardFileNm("첨부파일");
		
		System.out.println("\n<<nBoardFile>>");
		System.out.println(nBoardFile);
		
		
		
		
		
		
	}

}
