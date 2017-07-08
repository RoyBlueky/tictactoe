/*
Name: LI YIFAN
Program: A game program called TICTACTOE
 */

import java.util.*;
public class Tictactoe {
	
	private static int player = 1;			//a static field for switch players	
	private static boolean win = false;		//a static field to check the winning condition
	private static boolean did = false;		//a static field to mark if the computer did anything

	
	//method to print the board
	static void printboard(String[][] a){
		for(int i=0; i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+ " ");
			System.out.println();
		}
	}
	
	//method to reset the game
	static void newgame(String[][]a){
		for(int i=0; i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				a[i][j] = "-";
		}
		win = false;
		player = 1;
	}
	
	//method to build a user-friendly surface
	static void helps(){
		String [][] help = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		printboard(help);
		System.out.println("To play the game, enter the number to place your pieces on it position.");
	}
	
	//method to decide who will go first
	static void whofirst(){
		Scanner makeguess = new Scanner(System.in);		// scanner to take the users guesses
		System.out.println("Choosing who goes first. Please enter 0 or 1, if you win you will go first, else you go after");
		if((int)(Math.random()*1.9999999999999999999999)== makeguess.nextInt()){
			System.out.println("Congratulations! You can go first.");
		}
		else{
			System.out.println("Sorry, you go after");
			}
	}
	
	//method to decide who will go first(PVC)
	static void whofirstPVC(){
		Scanner guess = new Scanner(System.in);   // scanner to take the users guesses
		System.out.println("Choosing who goes first. Please enter 0 or 1, if you win you will go first, else computer go");
		if((int)(Math.random()*1.9999999999999999999999)== guess.nextInt()){
			System.out.println("Congratulations! You can go first.");
			player =1;
		}
		else{
			System.out.println("Sorry, computer will go first");
			player =2;
			}
	}
	
	//method to put the pieces
	static void play(String[][]b){
		Scanner pst= new Scanner(System.in);	//scanner to take the position which the user want to input
			System.out.println("Player "+ getplayer() + ", Please enter your location of pieces.");
			int position = pst.nextInt();		//variable to store the position
		if(player ==1){
			if(position==1){
				if(b[0][0] =="-"){
					b[0][0] = "X";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);	//recurs until a virtual value has been inputed. All below are the same.
					}
			}
			else if(position==2){
				if(b[0][1] =="-"){
					b[0][1] = "X";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==3){
				if(b[0][2] =="-"){
					b[0][2] = "X";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==4){
				if(b[1][0] =="-"){
					b[1][0] = "X";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==5){
				if(b[1][1] =="-"){
					b[1][1] = "X";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==6){
				if(b[1][2] =="-"){
					b[1][2] = "X";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==7){
				if(b[2][0] =="-"){
					b[2][0] = "X";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==8){
				if(b[2][1] =="-"){
					b[2][1] = "X";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==9){
				if(b[2][2] =="-"){
					b[2][2] = "X";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else{
				System.out.println("This position is not available. Please choose another one.");
				play(b);
			}
			player =2;   //switch players after one player is done, blow is same.
		}
		else if(player ==2){
			if(position==1){
				if(b[0][0] =="-"){
					b[0][0] = "O";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==2){
				if(b[0][1] =="-"){
					b[0][1] = "O";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==3){
				if(b[0][2] =="-"){
					b[0][2] = "O";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==4){
				if(b[1][0] =="-"){
					b[1][0] = "O";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==5){
				if(b[1][1] =="-"){
					b[1][1] = "O";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==6){
				if(b[1][2] =="-"){
					b[1][2] = "O";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==7){
				if(b[2][0] =="-"){
					b[2][0] = "O";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==8){
				if(b[2][1] =="-"){
					b[2][1] = "O";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else if(position==9){
				if(b[2][2] =="-"){
					b[2][2] = "O";
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					play(b);
					}
			}
			else{
				System.out.println("This position is not available. Please choose another one.");
				play(b);
			}	
			player =1;
		}		
	}	

	//method that build the basic AI
	static void AI(String[][]a){
		winAI(a); 	//call the win and defend method
		if(did == false){
			if(a[1][1]== "-"){
				a[1][1] ="O";
				did = true;
			}
		}
		if(did == false){                 
			if(a[1][1] =="X")
			AImode1(a); //call the first special AImode
		}
		
		if(did == false){
			int checkO =0;	//variable to check the number of O
			int checkX =0;  //variable to check the number of X
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					if(a[i][j] == "X")
						checkX++;		
					if(a[i][j] =="O")
						checkO++;
				}
				if(checkX==2 &&checkO==1){
					AImode2(a); //call the second special method
				}
			}
		}
		
		if(did == false){
			for(int i = 0; i<a.length; i++){
				for(int j = 0; j<a[i].length; j++){
					if(a[i][j] == "-" && did == false){
						a[i][j] = "O";
						did = true;
					}
				}
			}
		}
	}
	
	//method that give the AI basic win and defend move
	static void winAI(String [][] a){
		int checkO=0;  //variable to check the number of O
		int checkX=0;  //variable to check the number of X
		int row;	//variable to store the location of the situation
		if(player == 2 && did == false){
			for(int i=0; i<a.length; i++ ){
				for(int j=0; j<a[i].length; j++){
					if(a[i][j] == "O" )
						checkO++;
					if(a[i][j] == "X")
						checkX++;				
				}
				if(checkO ==2 && checkX == 0 && did == false){
					System.out.println("I'm IIIII" + i);
					row = i;
					for(int k=0; k<a[row].length;k++){
						if(a[row][k] == "-"){
							a[row][k] = "O";
							win = true;
							did = true;
						}	
					}			
				}
				checkO = 0; //reset the value
				checkX = 0;	//reset the value
			}
			for(int i=0; i<a.length; i++ ){
				for(int j=0; j<a[i].length; j++){
					if(a[i][j] == "O" )
						checkO++;
					if(a[i][j] == "X")
						checkX++;				
				}
				if(checkO == 0 && checkX ==2 && did == false){
					row = i;
					for(int k=0;k<a[row].length;k++){
						if(a[row][k] =="-"){
							a[row][k] = "O";
							did = true;
						}
					}
				}
				checkO=0;	//reset the value
				checkX=0;	//reset the value
			}
			if(win == false && did == false){
				int col;	//the value to store the location of the situation
				checkO=0;	//reset the value
				checkX=0;	//reset the value
				for(int j =0;j<a.length;j++){
					for(int i =0; i<a.length;i++){
						if(a[i][j] =="O")
							checkO++;
						if(a[i][j] =="X")
							checkX++;
					}
					if(checkO == 2 && checkX == 0 && did == false){
						col = j;
						for(int k =0; k<a[col].length;k++){
							if(a[k][col] == "-")
								a[k][col] = "O";
							win = true;
							did = true;
						}
					}
				checkO=0;	//reset the value
				checkX=0;	//reset the value
				}
				
				for(int j =0;j<a.length;j++){
					for(int i =0; i<a.length;i++){
						if(a[i][j] =="O")
							checkO++;
						if(a[i][j] =="X")
							checkX++;
					}
					if(checkO == 0 && checkX ==2 && did == false){
						col = j;
						for(int k=0;k<a[col].length;k++){
							if(a[k][col] =="-"){
								a[k][col] = "O";
								did = true;
							}
						}
					}
				
				checkO =0;	//reset the value
				checkX =0;	//reset the value
				
				}
			}
			if(win == false && did == false){
				checkO=0;	//reset the value
				checkX=0;	//reset the value
				if(a[0][0] == "X")
					checkX++;
				else if(a[0][0] == "O")
					checkO++;
				if(a[1][1] == "X")
					checkX++;
				else if(a[1][1] == "O")
					checkO++;
				if(a[2][2] == "X")
					checkX++;
				else if(a[2][2] == "O")
					checkO++;
				if(checkO==2 && checkX ==0  && did == false){
					if(a[0][0] == "-")
						a[0][0] = "O";
					else if(a[1][1] == "-")
						a[1][1] = "O";
					else
						a[2][2] = "O";
					win = true;
					did = true;
				}
				else if(checkO==0 && checkX ==2  && did == false){
					if(a[0][0] == "-")
						a[0][0] = "O";
					else if(a[1][1] == "-")
						a[1][1] = "O";
					else
						a[2][2] = "O";
					did = true;
				}	
			}
			if(win == false && did == false){
				checkO=0;	//reset the value
				checkX=0;	//reset the value
				if(a[0][2] == "X")
					checkX++;
				else if(a[0][2] == "O")
					checkO++;
				if(a[1][1] == "X")
					checkX++;
				else if(a[1][1] == "O")
					checkO++;
				if(a[2][0] == "X")
					checkX++;
				else if(a[2][0] == "O")
					checkO++;
				if(checkO==2 && checkX ==0 && did == false){
					if(a[0][2] == "-")
						a[0][2] = "O";
					else if(a[1][1] == "-")
						a[1][1] = "O";
					else
						a[2][0] = "O";
					win = true;
					did = true;
				}
				if(checkO==0 && checkX ==2 && did == false){
					if(a[0][2] == "-")
						a[0][2] = "O";
					else if(a[1][1] == "-")
						a[1][1] = "O";
					else
						a[2][0] = "O";
					did = true;
				}
			}
		}
	}
	
	//method that put the pieces(for computer)
	static void playPVC(String[][]b){
		if(player ==1){
			Scanner pstPVC= new Scanner(System.in);   //Scanner to check the position
			System.out.println("Please enter your location of pieces.");
			int position = pstPVC.nextInt();   //variable to store the position
			if(position==1){
				if(b[0][0] =="-"){
					b[0][0] = "X";
					player =2;	// after change the player
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					playPVC(b);		//recurs the method until a virtual value has been inputed, blow is same
					}
			}
			else if(position==2){
				if(b[0][1] =="-"){
					b[0][1] = "X";
					player =2;
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					playPVC(b);
					}
			}
			else if(position==3){
				if(b[0][2] =="-"){
					b[0][2] = "X";
					player =2;
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					playPVC(b);
					}
			}
			else if(position==4){
				if(b[1][0] =="-"){
					b[1][0] = "X";
					player =2;
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					playPVC(b);
					}
			}
			else if(position==5){
				if(b[1][1] =="-"){
					b[1][1] = "X";
					player =2;
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					playPVC(b);
					}
			}
			else if(position==6){
				if(b[1][2] =="-"){
					b[1][2] = "X";
					player =2;
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					playPVC(b);
					}
			}
			else if(position==7){
				if(b[2][0] =="-"){
					b[2][0] = "X";
					player =2;	
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					playPVC(b);
					}
			}
			else if(position==8){
				if(b[2][1] =="-"){
					b[2][1] = "X";
					player =2;
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					playPVC(b);
					}
			}
			else if(position==9){
				if(b[2][2] =="-"){
					b[2][2] = "X";
					player =2;
				}
				else{
					System.out.println("This position is not available. Please choose another one.");
					playPVC(b);
					}
			}
			else{
				playPVC(b);
				System.out.println("This position is not available. Please choose another one.");
			}
		}
		else if(player ==2){
			System.out.println("computer turn");
			AI(b);  //call the AI method
			did = false; //reset the computer move
			player =1;	//change the player after played
		}		
	}	
	
	//First special AI
	static void AImode1(String[][] a){
		if(did == false && a[0][0] == "-" && a[0][2] == "-" && a[2][0] == "-" && a[2][2] == "-"){
			a[0][0] = "O";
			did = true;
		}
		if(did == false && a[2][2] == "X" && a[0][2] == "-"){
			a[0][2] ="O";
			did = true;
		}
	}
	
	//Second special AI
	static void AImode2(String[][]a){
		if(a[0][0] == "X" && a[2][1] =="X" && a[1][1] == "O" && did == false && a[2][0] == "-"){
			a[2][0] = "O";
			did = true;
		}
		if(a[0][2] == "X" && a[2][1] =="X" && a[1][1] == "O" && did == false && a[2][2] == "-"){
			a[2][2] = "O";
			did = true;
		}
		if(a[2][0] == "X" && a[0][1] =="X" && a[1][1] == "O" && did == false && a[0][0] == "-"){
			a[0][0] = "O";
			did = true;
		}
		if(a[2][2] == "X" && a[0][1] =="X" && a[1][1] == "O" && did == false && a[0][2] == "-"){
			a[0][2] = "O";
			did = true;
		}
		
		if(a[1][2] == "X" && a[1][1] == "O" && did == false  && a[0][2] == "-"){
			if(a[0][0] == "X" || a[0][1] == "X"){
				a[0][2] ="O";
				did = true;
			}
			if(a[2][0] == "X" || a[2][1] == "X"){
				a[2][2] = "O";
				did = true;
			}
		}
		
		if(a[1][0] == "X" && a[1][1] == "O" && did == false && a[0][0] == "-"  && a[2][0] == "-"){
			if(a[0][2] == "X" || a[0][1] == "X"){
				a[0][0] ="O";
				did = true;
			}
			if(a[2][2] == "X" || a[2][1] == "X"){
				a[2][0] = "O";
				did = true;
			}
		}
		
		if(a[1][1] == "X" && a[1][1] == "O" && did == false && a[0][0] == "-" && a[0][2] == "-"){
			if(a[1][0] == "X" || a[2][0] == "X"){
				a[0][0] ="O";
				did = true;
			}
			if(a[1][2] == "X" || a[2][2] == "X"){
				a[0][2] = "O";
				did = true;
			}
		}
		
		if(a[2][1] == "X" && a[1][1] == "O" && did == false && a[2][0] == "-" && a[2][2] == "-"){
			if(a[0][0] == "X" || a[1][0] == "X"){
				a[2][0] ="O";
				did = true;
			}
			if(a[2][1] == "X" || a[2][0] == "X"){
				a[2][2] = "O";
				did = true;
			}
		}
		
	}

	//access the field(win)
	static boolean getwin(){
		return win;
	}
	
	//access the field(player)
	static int getplayer(){
		return player;
	}
	
	//method to decide the winner
	static void wol(String [][]a){
		for(int i=0; i<a.length;i++){
			if(a[i][0] != "-" && a[i][0]==a[i][1] &&a[i][0]==a[i][2]&&a[i][1]==a[i][2])
				win = true;
			else if(a[0][i]!="-" &&  a[0][i]==a[1][i] && a[0][i]==a[2][i] && a[1][i]==a[2][i])
				win = true;
			else if(a[0][0] !="-" &&  a[0][0] == a[1][1] && a[1][1] == a[2][2] && a[0][0] ==a[2][2])
				win = true;
			else if(a[0][2] !="-" && a[1][1] == a[0][2] && a[0][2] == a[2][0] && a[2][0] ==a[1][1])
				win = true;
		}
	}
	
	//method to announce the winner(computer)
	static void winningPVC(){
		if(player==2)
			System.out.println("Congratulations~!!!!!!!!!!!!!!!!!!!!!!!!!!! MY AI is in truble");
		else if(player==1)
			System.out.println("Congratulations~!!!!!!!!!!!!!!!!!!!!!!!!!!!Computer VICTORY~!!");
	}

	//method to announce the winner
	static void winning(){
		if(player==2)
			System.out.println("Congratulations~!!!!!!!!!!!!!!!!!!!!!!!!!!!PLAY 1 VICTORY~!!");
		else if(player==1)
			System.out.println("Congratulations~!!!!!!!!!!!!!!!!!!!!!!!!!!!PLAY 2 VICTORY~!!");
	}
	
	
	public static void main(String[] args) {
		
		String [][] board = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};		
		while(true){
			helps();
			Scanner mode= new Scanner(System.in);	//scanner to get the mode
			System.out.println("Please choose mode: (1 for player v/s player, others player v/s AI)");
			if(mode.nextInt() == 1){
				System.out.println("Welcome to PVP mode.");
				whofirst();
				int counter =0;	//variable that use to check if the game is tie
				while(win==false && counter<9){
					play(board);
					printboard(board);
					wol(board);
					counter++;
				}		
				if(counter==9&&win==false){
					System.out.println("The game is tie.");
				}
				else
					winning();
				Scanner onemore = new Scanner(System.in);	//scanner if the user want to play again
				System.out.println("Do you want to play again? (y/n)");
				if(onemore.next().charAt(0) != 'y'){
					System.out.println("Thank you for playing this game.   FIN");
					break;
				}
			}
			else{
				System.out.println("Welcome to PVC mode");
				whofirstPVC();
				int counter =0;		//variable which use to check the die condition
				while(win==false && counter<9){
					playPVC(board);
					printboard(board);
					wol(board);
					counter++;
				}		
				if(counter==9&&win==false){
					System.out.println("The game is tie.");
				}
				else
					winningPVC();
				Scanner onemoretime = new Scanner(System.in); 	//Scanner to check if the user want to play one more time
				System.out.println("Do you want to play again? (y/n)");
				if(onemoretime.next().charAt(0) != 'y'){
					System.out.println("Thank you for playing this game.   FIN");
					break;	
				}
			}
				newgame(board);
		}		
	}

}
