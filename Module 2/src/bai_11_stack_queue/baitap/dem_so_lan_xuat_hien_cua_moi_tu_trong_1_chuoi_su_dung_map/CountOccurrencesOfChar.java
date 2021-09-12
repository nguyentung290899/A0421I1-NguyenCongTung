package bai_11_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_1_chuoi_su_dung_map;

public class CountOccurrencesOfChar {
    private TreeMap string;
    public CountOccurrencesOfChar() {
    }
    public void duyetChuoi( String string){
        for (int i=0; i< string.length(); i++) {
            if(!(string.charAt(i)==this.string.key[i])&& this.string.key[i] == null) {
                this.string.key[i] = string.charAt(i);
            }
        }
    }
}
