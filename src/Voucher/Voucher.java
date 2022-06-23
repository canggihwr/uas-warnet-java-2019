package Voucher;

/**
 *
 * @author cwr
 */
public class Voucher {
    private String username , voucher;
    private int jumlah , total;
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getVoucher() {
        return voucher;
    }
    
    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int getTotal() {
        return total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
}
