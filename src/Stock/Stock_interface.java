package Stock;

import javax.swing.JTable;

/**
 *
 * @author cwr
 */
public interface Stock_interface {
    
    public void read(JTable tabelStock);

    public void create(Stock s);

    public void update(Stock s);

    public void delete(String Barang);

    public void search(JTable tabelStock, String Barang);
    
}
