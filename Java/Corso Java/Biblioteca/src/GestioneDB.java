
public interface GestioneDB {

	public void open() throws Exception;
	public Object loadObject() throws Exception;
	public boolean writeObject(Object obj)throws Exception;
	public long size() throws Exception;
	public void close()throws Exception;
	
}
