package Voucher;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cwr
 */
public class Voucher_imp {
    
    private String kolom[] = {"Username", "Jenis Voucher", "Jumlah", "Total bayar"};
    
    private List<Voucher> list = new ArrayList<>();
    
//    @Override
    public void read(JTable tabelVoucher) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            Object v[] = new Object[4];
            v[0] = list.get(i).getUsername();
            v[1] = list.get(i).getVoucher();
            v[2] = list.get(i).getJumlah();
            v[3] = list.get(i).getTotal();
            dtm.addRow(v);
        }
        tabelVoucher.setModel(dtm);

    }
    
//    @Override
    public void create(Voucher v) {
        list.add(v);
        JOptionPane.showMessageDialog(null, "Berhasil disimpan !");
    }
    
//    @Override
    public void update(Voucher v) {
        JOptionPane.showMessageDialog(null, "Berhasil diubah !");
    }
    
//    @Override
    public void delete(String Username) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(Username)) {
                list.remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Berhasil dihapus !");
    }

    /**
     *
     * @param tabelVoucher
     * @param Username
     */
//    @Override
    public void search(JTable tabelVoucher, String Username) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(Username)) {
                Object v2[] = new Object[5];
                v2[0] = list.get(i).getUsername();
                v2[1] = list.get(i).getVoucher();
                v2[2] = list.get(i).getJumlah();
                v2[3] = list.get(i).getTotal();
                dtm.addRow(v2);
            }
        }
        tabelVoucher.setModel(dtm);

    }
    
}
