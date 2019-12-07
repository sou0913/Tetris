public class Map {
    private String sheet[][] = new String[5][10];
    
    public Map() {
    }
    public void initialize() {
        for (int i=0;i<this.sheet.length;i++) {
            for (int j=0;j<this.sheet[0].length;j++) {
                this.sheet[i][j] = ".";
            }
        }
    }
    public String[][] getSheet() {
        return sheet;
    }
    public void setSheet(String[][] sheet) {
        this.sheet = sheet;
    }
    public boolean check_below(int i,int j) {
        if (this.sheet[i+1][j] == "."){
            return true;
        } else {
            return false;
        }
    }
    public void isNoted(int i,int j) {
        this.sheet[i][j] = "x";
    }
    public void isErased(int i,int j) {
        try{
            this.sheet[i-1][j] = ".";
        } catch (ArrayIndexOutOfBoundsException e){}
    }
    public void show() {
        for(int i=0;i<this.sheet.length;i++) {
            for(int j=0;j<this.sheet[0].length;j++) {
                System.out.print(this.sheet[i][j]);
            }
            System.out.print("\n");
        }
        //カーソルを[0,0]に戻す
        System.out.print("\r\033[5A");
    }
}
