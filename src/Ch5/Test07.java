package Ch5;

import java.util.LinkedList;

public class Test07 {
    public static void main(String[] args) {
        class Point {
            int x,y;
            public Point(int x, int y) {
                this.x=x; this.y=y;
            }
        }
        int R=6, C=8;
        String input=     "0000000#"+     "##0#0#0#"+     "0000000#"+     "0#####0#"+     "00000###"+     "###00000";
        char maze[][]=new char[R][C];
        for (int i = 0; i < input.length(); i++) maze[i/C][i%C]=input.charAt(i);
        LinkedList<Point> queue=new LinkedList<>();
        maze[0][0]='v'; // visited
        queue.addLast(new Point(0,0));
        int dx[]={0,0,1,-1}, dy[]={1,-1,0,0};
        while(!queue.isEmpty()){
            printMaze(maze);
            Point p=queue.removeFirst();
            for (int i = 0; i < dx.length; i++) {
                int x=p.x+dx[i], y=p.y+dy[i];
                if(x<0 || x>=R || y<0 || y>=C || maze[x][y]=='#' || maze[x][y]=='v') continue;
                maze[x][y]='v';
                queue.addLast(new Point(x,y));
            }
         }
    }
    private static void printMaze(char[][] maze) {
         for (int i = 0; i < maze.length; i++) System.out.println(maze[i]);
         System.out.println();
    }
}
