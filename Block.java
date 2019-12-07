import java.util.Random;
public class Block {
    private int row;
    private int column;
    public Block() {
        Random r = new Random();
        this.row = 0;
        this.column = r.nextInt(10);
    }
    public int getRow() {
        return this.row;
    }
    public int getColumn() {
        return this.column;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public void fall(){
        this.row +=1;
    }
}