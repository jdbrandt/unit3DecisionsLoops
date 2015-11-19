import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.util.ArrayList;
public class GameOfLifeWorld extends ActorWorld
{
    final static int ROWS = GameOfLife.getNumRows();
    final static int COLS = GameOfLife.getNumCols();
    public GameOfLifeWorld()
    {}
    public void step(ActorWorld world)
    {
       Grid<Actor> oldGrid = world.getGrid();
       BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(ROWS, COLS);
       ActorWorld newWorld = new ActorWorld(newGrid); 
       
        for(int r = 0; r < ROWS; r++)
        {
            for(int c = 0; c < COLS; c++)
            {
                ArrayList<Actor> neighborhood = oldGrid.getNeighbors(new Location(r, c));
                int neighbors = neighborhood.size();
                if (oldGrid.get(new Location(r, c))!= null && neighbors >= 2 && neighbors < 4 || neighbors==3 && oldGrid.get(new Location(r, c))== null)
                {
                    Rock anonRock = new Rock();
                    anonRock.putSelfInGrid(newGrid, new Location(r, c));
                }
            }
        }
        
        
        
        
        
        
    }
}

