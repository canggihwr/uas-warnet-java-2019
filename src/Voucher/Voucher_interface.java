package Voucher;

import javax.swing.JTable;

/**
 *
 * @author cwr
 */
public interface Voucher_interface {
        
    public void read(JTable tabelVoucher);

    public void create(Voucher v);

    public void update(Voucher v);

    public void delete(String Username);

    public void search(JTable tabelVoucher, String Username);
}
