package tutorialPag;

import java.util.ArrayList;
import java.util.Scanner;

public class DataStructureAssignment6 {

	public static void main(String[] args) {
		ArrayList<String> allSongs = new ArrayList<String>();
		ArrayList<String> artists = new ArrayList<>();
		ArrayList<String> partyPlaylist = new ArrayList<>();
		
		allSongs.add("SICKO MODE");
		artists.add("Drake");
		
		allSongs.add("OTW");
		artists.add("Khalid");
		
		allSongs.add("New Patek");
		artists.add("Lil Uzi Vert");
		
		int choice = 0;
		
		do {
		for(int i = 0; i < allSongs.size(); i++) {
			System.out.println(i + " " + allSongs.get(i)
							  + " " + artists.get(i));
			
		}
		
		System.out.println("1. add to library \n" +
							"2. delete from library \n" +
							"3. add to party playlist \n" +
							"4. exit");
		
		Scanner input = new Scanner(System.in);
		int choice1 = input.nextInt();
		
		switch(choice1) {
		case 1:
			input.nextLine(); // Gets rid of extra enter character
			System.out.println("enter song title: ");
			allSongs.add(input.nextLine());
			System.out.println("enter artist: ");
			artists.add(input.nextLine());
			break;
			
		case 2:
			System.out.println("Enter song number to delete: ");
			int delete = input.nextInt();
			allSongs.remove(delete);
			artists.remove(delete);
			break;
			
		case 3:
			System.out.println("enter song # to add to party playlist:");
			partyPlaylist.add(allSongs.get(input.nextInt()));
			break;
			
		case 4:
			System.out.println("BYE");
			break;
			
		default:
			System.out.println("invalid option");
			
		}//end switch
			}while(choice != 4);
		for(int i = 0; i < allSongs.size(); i++) { // Print all songs
			System.out.println(i + " " + allSongs.get(i)
							  + " " + artists.get(i));
			
		}//end for
		
	}

}



