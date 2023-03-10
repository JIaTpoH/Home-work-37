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
    ckeckCoordinates(row,column);
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
}
