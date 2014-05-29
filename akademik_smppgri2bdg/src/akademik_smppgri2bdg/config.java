/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package akademik_smppgri2bdg;

import java.util.prefs.Preferences;

/**
 *
 * @author asep
 */
public class config {

    private final Preferences pref = Preferences.userRoot();
    private final String DEFAULT = "belum login";
    private final String PREF_NAMA = "nama";
    private final String PREF_KODE = "kode";
    private final String PREF_NAMA_PELAJARAN = "nama_pelajaran";
    private String huruf = "";


    public void put(String nama, String kode, String nama_pelajaran){
        pref.put(PREF_NAMA, nama);
        pref.put(PREF_KODE, kode);
        pref.put(PREF_NAMA_PELAJARAN, nama_pelajaran);
    }

    public String getNama(){
       String nama = pref.get(PREF_NAMA, DEFAULT);

       return nama;
    }

    public String getKode(){
       String kode = pref.get(PREF_KODE, DEFAULT);

       return kode;
    }

    public String getNamaPelajaran(){
       String namaPelajaran = pref.get(PREF_NAMA_PELAJARAN, DEFAULT);

       return namaPelajaran;
    }

    public void clear(){
        pref.put(PREF_NAMA, DEFAULT);
        pref.put(PREF_KODE, DEFAULT);
        pref.put(PREF_NAMA_PELAJARAN, DEFAULT);
    }
}
