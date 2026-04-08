package String;

public class ShortestPath {
    double shortestPath(String a,int x,int y){
        int p=x,q=y;
        for(int k=0;k<a.length();k++){
            switch(a.charAt(k)){
                case 'N':x++;
                break;
                case 'S':x--;
                break;
                case 'E':y++;
                break;
                case 'W':y--;
                break;
                default:break;
            }
        }
        return Math.sqrt(Math.pow(x-p,2)+Math.pow(y-q,2));
    }

    public static void main(String[] args) {
        ShortestPath obj=new ShortestPath();
        String w="WNEENESENNN";
        int x=0,y=0;
        System.out.println(obj.shortestPath(w,x,y));
    }
}
