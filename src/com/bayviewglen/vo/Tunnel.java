/**
 * 
 */
package com.bayviewglen.vo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author kdeslauriers
 *
 */
public class Tunnel extends Space implements Serializable{

	public Tunnel(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	ArrayList<Building> buildings;
	ArrayList<Character> characters;
	ArrayList<Item> items;
	
	// This will have two exits that are building.  Each Building has a room that contains a tunnel
	// entrance.  This is the room that the player will be entering from a tunnel.
	
	
	// Tunnels may be joined together via other tunnels.  I have a few ideas about
	// this but for now I am leaving this undecided.
	
	
	
}
