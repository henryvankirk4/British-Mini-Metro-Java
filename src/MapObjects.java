public class MapObjects {
    Map map;
    Town[][] mixedObjectArray = new Town[24][24];
    public MapObjects(Map map){
        this.map = map;
    }
    public void addRandomTown(){
        int x;
        int y;
        do {
            x = (int) (Math.random() * 24);
            y = (int) (Math.random() * 24);
        } while (checkValidSpot(x, y));
mixedObjectArray[y][x] = new Town(x, y);
    }
    public boolean checkValidSpot(int x, int y){
        return true;
    }
    class Town{
        int x;
        int y;
        public Town(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

}
