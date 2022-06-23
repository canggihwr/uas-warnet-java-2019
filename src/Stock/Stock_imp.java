package Stock;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cwr
 */
public class Stock_imp {
    private String kolom[] = {"Nama Barang", "Jumlah", "Harga Satuan"};
    
    private List<Stock> list = new ArrayList<>();
    
//    @Override
    public void read(JTable tabelStock) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            Object pc[] = new Object[3];
            pc[0] = list.get(i).getBarang();
            pc[1] = list.get(i).getJumlah();
            pc[2] = list.get(i).getHarga();
            dtm.addRow(pc);
        }
        tabelStock.setModel(dtm);

    }
    
//    @Override
    public void create(Stock s) {
        list.add(s);
        JOptionPane.showMessageDialog(null, "Berhasil disimpan !");
    }
    
//    @Override
    public void update(Stock s) {
        JOptionPane.showMessageDialog(null, "Berhasil diubah !");
    }
    
//    @Override
    public void delete(String Barang) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBarang().equals(Barang)) {
                list.remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Berhasil dihapus !");
    }

    /**
     *
     * @param tabelStock
     * @param Barang
     */
//    @Override
    public void search(JTable tabelStock, String Barang) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBarang().equals(Barang)) {
                Object stock[] = new Object[3];
                stock[0] = list.get(i).getBarang();
                stock[1] = list.get(i).getJumlah();
                stock[2] = list.get(i).getHarga();
                dtm.addRow(stock);
            }
        }
        tabelStock.setModel(dtm);

    }
}
