/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;

import java.util.List;

/**
 *
 * @author VINOD
 */
public class DepthFirst {
    public static boolean searcpath(int[][] maze, int x, int y, List<Integer> path)
    {
        if(maze[x][y]==9)
        {
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[x][y]==0)
        {
            maze[x][y]=2;
            int dx=-1;
            int dy=0;
            if(searcpath(maze,x+dx,y+dy,path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            dx=1;
            dy=0;
            if(searcpath(maze,x+dx,y+dy,path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            dx=0;
            dy=-1;
            if(searcpath(maze,x+dx,y+dy,path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            dx=0;
            dy=1;
            if(searcpath(maze,x+dx,y+dy,path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
}
