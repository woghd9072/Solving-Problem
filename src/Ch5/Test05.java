package Ch5;

public class Test05 {
    public static void main(String[] args) {
        int R=5, C=6;
        String s="012345678901234567890123456789";
        char maze[][]=new char[R][C];

        for (int i = 0; i < s.length(); i++) maze[i/C][i%C] = s.charAt(i);

        for (int i = 0; i < maze.length; i++) System.out.println(maze[i]);
        System.out.println();
    }
}
