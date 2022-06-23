package PC;

import javax.swing.JTable;

/**
 *
 * @author cwr
 */
public interface PC_interface {
    
    public void read(JTable tabelPC);

    public void create(PC pc);

    public void update(PC pc);

    public void delete(String Username);

    public void search(JTable tabelPC, String Username);
    
}
