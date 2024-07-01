import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class Notebook implements Serializable {
    private static final String EXTENSION = ".ser";
    
    // Storage for an arbitrary number of notes.
    private transient ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the notebook.
     */
    public Notebook() {
        notes = new ArrayList<>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note) {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes() {
        return notes.size();
    }

    /**
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeNote(int noteNumber) {
        if (noteNumber >= 0 && noteNumber < numberOfNotes()) {
            notes.remove(noteNumber);
        }
    }

    /**
     * List all notes in the notebook.
     */
    public void listNotes() {
        for (String note : notes) {
            System.out.println(note);
        }
    }

    /**
     * Serialize the ArrayList of notes and save it to a file.
     * @param fileName The name of the file to save the serialized data.
     */
    public void serialize(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename + EXTENSION))) {
            oos.writeObject(notes);
            System.out.println("ArrayList notes serialized and saved in " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deserialize the ArrayList of notes from a file and reload it into notes.
     * @param fileName The name of the file containing the serialized data.
     */
    public void deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename + EXTENSION))) {
            notes = (ArrayList<String>) ois.readObject();
            System.out.println("ArrayList notes deserialized and reuploaded in notes.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
