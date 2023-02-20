import java.io.EOFException;
import java.io.IOException;

public interface GestioneFile {
	public void openFile();
	public Object loadObject();
	public boolean writeObject(Object obj);
	public long size();
	public void closeFile();
}
