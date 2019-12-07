public class main {
    public static void main(String args[]) {
        //最初
        Map map = new Map();
        Block block = new Block();
        map.initialize();
        // 落下動作
        for(int i=0;i<5;i++) {
            map.isErased(block.getRow(),block.getColumn());
            map.isNoted(block.getRow(),block.getColumn());
            map.show();
            if (map.check_below(block.getRow(),block.getColumn())) {
                block.fall();
            } else {break;}
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){};
        }
    }
}