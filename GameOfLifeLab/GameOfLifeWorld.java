import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;


import java.util.ArrayList;
public class GameOfLifeWorld extends ActorWorld
{
    private final static int ROWS = GameOfLife.getNumRows();
    private final static int COLS = GameOfLife.getNumCols();
    
    public GameOfLifeWorld(BoundedGrid<Actor> grid)
    {
        super(grid);
    }
    
    public void step()
    {
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(ROWS, COLS);
        BoundedGrid<Actor> grid = (BoundedGrid<Actor>) getGrid();
        for(int r = 0; r < ROWS; r++)
        {
            for(int c = 0; c < COLS; c++)
            {
                ArrayList<Actor> neighborhood = grid.getNeighbors(new Location(r, c));
                int neighbors = neighborhood.size();
                if (grid.get(new Location(r, c))!= null && neighbors >= 2 && neighbors < 4 || neighbors==3 && grid.get(new Location(r, c))== null)
                {
                    Rock anonRock = new Rock();
                    anonRock.putSelfInGrid(newGrid, new Location(r, c));
                }
            }
        }
        
        setGrid(newGrid);        
    }
}

