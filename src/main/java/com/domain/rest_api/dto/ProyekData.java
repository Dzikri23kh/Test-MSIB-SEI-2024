package com.domain.rest_api.dto;

import java.time.LocalDateTime;

public class ProyekData {
    
    private String nama_proyek;
    private String client;
    private String provinsi;
    private String pimpinan_proyek;
    private LocalDateTime tgl_mulai;
    private LocalDateTime tgl_selesai;
    private String keterangan;
    
    public String getNama_proyek() {
        return nama_proyek;
    }
    public void setNama_proyek(String nama_proyek) {
        this.nama_proyek = nama_proyek;
    }
    public String getClient() {
        return client;
    }
    public void setClient(String client) {
        this.client = client;
    }
    public String getProvinsi() {
        return provinsi;
    }
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
    public String getPimpinan_proyek() {
        return pimpinan_proyek;
    }
    public void setPimpinan_proyek(String pimpinan_proyek) {
        this.pimpinan_proyek = pimpinan_proyek;
    }
    public LocalDateTime getTgl_mulai() {
        return tgl_mulai;
    }
    public void setTgl_mulai(LocalDateTime tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }
    public LocalDateTime getTgl_selesai() {
        return tgl_selesai;
    }
    public void setTgl_selesai(LocalDateTime tgl_selesai) {
        this.tgl_selesai = tgl_selesai;
    }
    public String getKeterangan() {
        return keterangan;
    }
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    
}
