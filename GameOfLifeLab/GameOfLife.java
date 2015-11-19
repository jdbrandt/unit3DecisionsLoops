import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 100 rows and 100 columns
    private static final int ROWS = 10;
    private static final int COLS = 10;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();

        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int ROW1 = 3, COL1 = 3;
        final int ROW2 = 3, COL2 = 4;
        final int ROW3 = 3, COL3 = 5;
        final int ROW4 = 4, COL4 = 3;
        final int ROW5 = 4, COL5 = 4;
        final int ROW6 = 4, COL6 = 5;
        final int ROW7 = 5, COL7 = 3;
        final int ROW8 = 5, COL8 = 4;
        final int ROW9 = 5, COL9 = 5;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        
        Rock rock1 = new Rock();
        Location loc1 = new Location(ROW1, COL1);
        rock1.putSelfInGrid(grid, loc1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(ROW2, COL2);
        rock2.putSelfInGrid(grid, loc2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(ROW3, COL3);
        rock3.putSelfInGrid(grid, loc3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(ROW4, COL4);
        rock4.putSelfInGrid(grid, loc4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(ROW5, COL5);
        rock5.putSelfInGrid(grid, loc5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(ROW6, COL6);
        rock6.putSelfInGrid(grid, loc6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(ROW7, COL7);
        rock7.putSelfInGrid(grid, loc7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(ROW8, COL8);
        rock8.putSelfInGrid(grid, loc8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(ROW9, COL9);
        rock9.putSelfInGrid(grid, loc9);
        
        


    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        
        Grid<Actor> grid = world.getGrid();
        
        for (int r = 0; r<ROWS; r++)
        {
            for (int c = 0; c<COLS; c++)
            {
                
                if (grid.get(new Location(r, c))!=null)
                {
                    
                    ArrayList<Actor> neighborhood = grid.getNeighbors(new Location(r, c));
                    int neighbors = neighborhood.size();
                    if (neighbors<2 || neighbors>4)
                    {
                        Location anonLoc = new Location(r, c);
                        grid.get(anonLoc).removeSelfFromGrid();
                    }
                    
                }
                else
                {
                    ArrayList<Actor> neighborhood = grid.getNeighbors(new Location(r, c));
                    int neighbors = neighborhood.size();
                    if (neighbors==3)
                    {
                        Rock anonRock = new Rock();
                        Location anonLoc = new Location(r, c);
                        anonRock.putSelfInGrid(grid, anonLoc);
                    }
                }
            }
        }
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public static int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public static int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
        GameOfLifeWorld gameWorld = new GameOfLifeWorld();
        gameWorld.step(world);
    }

}
