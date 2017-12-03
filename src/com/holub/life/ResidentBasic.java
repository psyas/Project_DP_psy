package com.holub.life;

public class ResidentBasic extends Resident {

	@Override
	public int countNeighbors(Cell north, Cell south, Cell east, Cell west, Cell northeast, Cell northwest,
			Cell southeast, Cell southwest) {
		
		int neighbors = 0;
		
		if( north.	  isAlive()) ++neighbors;
		if( south.	  isAlive()) ++neighbors;
		if( east. 	  isAlive()) ++neighbors;
		if( west. 	  isAlive()) ++neighbors;
		if( northeast.isAlive()) ++neighbors;
		if( northwest.isAlive()) ++neighbors;
		if( southeast.isAlive()) ++neighbors;
		if( southwest.isAlive()) ++neighbors;
		
		return neighbors;
	}

	@Override
	public boolean destinifyCell(boolean alive, int neighbors) {
		
		return (neighbors==3 || (alive && neighbors==2));
	}

}
