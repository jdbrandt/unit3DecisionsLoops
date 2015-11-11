import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

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
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 5;
    private final int COLS = 5;
    
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
        final int ROW1 = 5, COL1 = 1;
        final int ROW2 = 5, COL2 = 2;
        final int ROW3 = 6, COL3 = 1;
        final int ROW4 = 6, COL4 = 2;
        final int ROW5 = 5, COL5 = 11;
        final int ROW6 = 6, COL6 = 11;
        final int ROW7 = 7, COL7 = 11;
        final int ROW8 = 4, COL8 = 12;
        final int ROW9 = 8, COL9 = 12;
        final int ROW10 = 3, COL10 = 13;
        final int ROW11 = 9, COL11 = 13;
        final int ROW12 = 3, COL12 = 14;
        final int ROW13 = 9, COL13 = 14;
        final int ROW14 = 6, COL14 = 15;
        final int ROW15 = 4, COL15 = 16;
        final int ROW16 = 8, COL16 = 16;
        final int ROW17 = 5, COL17 = 17;
        final int ROW18 = 6, COL18 = 17;
        final int ROW19 = 7, COL19 = 17;
        final int ROW20 = 6, COL20 = 18;
        final int ROW21 = 3, COL21 = 21;
        final int ROW22 = 4, COL22 = 21;
        final int ROW23 = 5, COL23 = 21;
        final int ROW24 = 3, COL24 = 22;
        final int ROW25 = 4, COL25 = 22;
        final int ROW26 = 5, COL26 = 22;
        final int ROW27 = 2, COL27 = 23;
        final int ROW28 = 6, COL28 = 23;
        final int ROW29 = 1, COL29 = 25;
        final int ROW30 = 2, COL30 = 25;
        final int ROW31 = 6, COL31 = 25;
        final int ROW32 = 7, COL32 = 25;
        final int ROW33 = 3, COL33 = 35;
        final int ROW34 = 4, COL34 = 35;
        final int ROW35 = 3, COL35 = 36;
        final int ROW36 = 4, COL36 = 36;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        
        Rock rock1 = new Rock();
        Location loc1 = new Location(ROW1, COL1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(ROW2, COL2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(ROW3, COL3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(ROW4, COL4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(ROW5, COL5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(ROW6, COL6);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(ROW7, COL7);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(ROW8, COL8);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(ROW9, COL9);
        grid.put(loc9, rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(ROW10, COL10);
        grid.put(loc10, rock10);
        
        Rock rock11 = new Rock();
        Location loc11 = new Location(ROW11, COL11);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(ROW12, COL12);
        grid.put(loc12, rock12);
        
        Rock rock13 = new Rock();
        Location loc13 = new Location(ROW13, COL13);
        grid.put(loc13, rock13);
        
        Rock rock14 = new Rock();
        Location loc14 = new Location(ROW14, COL14);
        grid.put(loc14, rock14);
        
        Rock rock15 = new Rock();
        Location loc15 = new Location(ROW15, COL15);
        grid.put(loc15, rock15);
        
        Rock rock16 = new Rock();
        Location loc16 = new Location(ROW16, COL16);
        grid.put(loc16, rock16);
        
        Rock rock17 = new Rock();
        Location loc17 = new Location(ROW17, COL17);
        grid.put(loc17, rock17);
        
        Rock rock18 = new Rock();
        Location loc18 = new Location(ROW18, COL18);
        grid.put(loc18, rock18);
        
        Rock rock19 = new Rock();
        Location loc19 = new Location(ROW19, COL19);
        grid.put(loc19, rock19);
        
        Rock rock20 = new Rock();
        Location loc20 = new Location(ROW20, COL20);
        grid.put(loc20, rock20);
        
        Rock rock21 = new Rock();
        Location loc21 = new Location(ROW21, COL21);
        grid.put(loc21, rock21);
        
        Rock rock22 = new Rock();
        Location loc22 = new Location(ROW22, COL22);
        grid.put(loc22, rock22);
        
        Rock rock23 = new Rock();
        Location loc23 = new Location(ROW23, COL23);
        grid.put(loc23, rock23);
        
        Rock rock24 = new Rock();
        Location loc24 = new Location(ROW24, COL24);
        grid.put(loc24, rock24);
        
        Rock rock25 = new Rock();
        Location loc25 = new Location(ROW25, COL25);
        grid.put(loc25, rock25);
        
        Rock rock26 = new Rock();
        Location loc26 = new Location(ROW26, COL26);
        grid.put(loc26, rock26);
        
        Rock rock27 = new Rock();
        Location loc27 = new Location(ROW27, COL27);
        grid.put(loc27, rock27);
        
        Rock rock28 = new Rock();
        Location loc28 = new Location(ROW28, COL28);
        grid.put(loc28, rock28);
        
        Rock rock29 = new Rock();
        Location loc29 = new Location(ROW29, COL29);
        grid.put(loc29, rock29);
        
        Rock rock30 = new Rock();
        Location loc30 = new Location(ROW30, COL30);
        grid.put(loc30, rock30);
        
        Rock rock31 = new Rock();
        Location loc31 = new Location(ROW31, COL31);
        grid.put(loc31, rock31);
        
        Rock rock32 = new Rock();
        Location loc32 = new Location(ROW32, COL32);
        grid.put(loc32, rock32);
        
        Rock rock33 = new Rock();
        Location loc33 = new Location(ROW33, COL33);
        grid.put(loc33, rock33);
        
        Rock rock34 = new Rock();
        Location loc34 = new Location(ROW34, COL34);
        grid.put(loc34, rock34);
        
        Rock rock35 = new Rock();
        Location loc35 = new Location(ROW35, COL35);
        grid.put(loc35, rock35);
        
        Rock rock36 = new Rock();
        Location loc36 = new Location(ROW36, COL36);
        grid.put(loc36, rock36);


    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    private void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        // insert magic here...
        
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
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
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
    }

}
