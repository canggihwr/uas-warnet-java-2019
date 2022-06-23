package PC;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cwr
 */
public class PC_imp implements PC_interface{
    
    private String kolom[] = {"Username", "PC", "Biaya per jam", "Durasi ( *jam )", "Total bayar"};
    
    private List<PC> list = new ArrayList<>();
    
    @Override
    public void read(JTable tabelPC) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            Object pc[] = new Object[5];
            pc[0] = list.get(i).getUsername();
            pc[1] = list.get(i).getPc();
            pc[2] = list.get(i).getBiaya();
            pc[3] = list.get(i).getWaktu();
            pc[4] = list.get(i).getTotal();
            dtm.addRow(pc);
        }
        tabelPC.setModel(dtm);

    }
    
    @Override
    public void create(PC pc) {
        list.add(pc);
        JOptionPane.showMessageDialog(null, "Berhasil disimpan !");
    }
    
    @Override
    public void update(PC pc) {
        JOptionPane.showMessageDialog(null, "Berhasil diubah !");
    }
    
    @Override
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
     * @param tabelPC
     * @param Username
     */
    @Override
    public void search(JTable tabelPC, String Username) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(Username)) {
                Object pc2[] = new Object[5];
                pc2[0] = list.get(i).getUsername();
                pc2[1] = list.get(i).getPc();
                pc2[2] = list.get(i).getBiaya();
                pc2[3] = list.get(i).getWaktu();
                pc2[4] = list.get(i).getTotal();
                dtm.addRow(pc2);
            }
        }
        tabelPC.setModel(dtm);

    }

    
}
