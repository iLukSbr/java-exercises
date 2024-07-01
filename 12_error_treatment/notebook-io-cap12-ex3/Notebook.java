import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;
    private static final String EXTENSION = ".txt";

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number.
            notes.remove(noteNumber);
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    /**
     * List all notes in the notebook.
     */
    public void listNotes()
    {
        for(String note : notes) {
            System.out.println(note);
        }
    }
    
    public void saveToFile(String filename){
        try{
            FileWriter writer = new FileWriter(filename + EXTENSION);
            for(String note : notes){
                writer.write(note);
            }
            writer.close();
        }catch(IOException e){
            System.out.println("Something went wrong while accessing the file.");
        }
    }
    
    public void readFromFile(String filename){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename + EXTENSION));
            String line = reader.readLine();
            while(line != null){
                notes.add(line);
                line = reader.readLine();
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("The file was not found.");
        }catch(IOException e){
            System.out.println("Something went wrong during file read or close.");
        }
    }
}
