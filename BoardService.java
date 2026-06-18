// feature/B: 삭제 기능 추가
public boolean delete(int id) {
Board board = findById(id);
if (board == null)
throw new IllegalArgumentException("게시글을 찾을 수 없습니다. ID: " +
id);
return boards.remove(board);
}
// 수정 기능 추가
public Board update(int id, String newTitle, String newContent) {
Board board = findById(id);
if (board == null)
throw new IllegalArgumentException("게시글을 찾을 수 없습니다. ID: " +
id);
board.setTitle(newTitle);
board.setContent(newContent);
return board;
}
