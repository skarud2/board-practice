//B계정이 추가한 내용이닷!
//A계정이 추가한 내용이닷 
public class Board {
private int id;
private String title;
private String author;
}
// feature/A: 조회수 기능 추가
private int viewCount = 0;
public int getViewCount() { return viewCount; }
public void incrementViewCount() { this.viewCount++; }
