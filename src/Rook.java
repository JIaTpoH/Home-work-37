public class Rook {
  public enum Color {
    WHITE,
    BLACK,
  }
  private Color color;
  private int row;
  private int column;
  public Rook(Color color,int row, int column) {
    this.color = color;
    checkCoordinates(row, column);
    this.row = row;
    this.column = column;
  }
  public int getRow() {
    return row;
  }
  public int getColumn() {
    return column;
  }
  public void setCoordinates(int row, int column) {
    checkCoordinates(row,column);
  }
  private void checkCoordinates(int row, int column) {
    if (row < 1 || row > 8) {
      throw new IllegalArgumentException("Некорректный номер строки: " + row);
    }

    if (column < 1 || column > 8) {
      throw new IllegalArgumentException("Некорректный номер столбца: " + column);

    }
  }
}
