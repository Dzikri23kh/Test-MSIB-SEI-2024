package com.domain.rest_api.models.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Set;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "proyek")
public class Proyek implements Serializable{

    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Nama Proyek harus di isi!")
    private String nama_proyek;

    @NotEmpty(message = "Client harus di isi!")
    private String client;

    @NotEmpty(message = "Provinsi harus di isi!")
    private String provinsi;

    @NotEmpty(message = "Pimpinan Proyek harus di isi!")
    private String pimpinan_proyek;

    private OffsetDateTime tgl_mulai;

    private OffsetDateTime tgl_selesai;

    @NotEmpty(message = "Keterangan harus di isi!")
    private String keterangan;
    
    private Timestamp created_at;

    @ManyToMany(mappedBy = "proyeks")
    private Set<User> users;
    
    public Proyek() {
    }

    
    

    public Proyek(Long id, String nama_proyek, String client, String provinsi, String pimpinan_proyek, OffsetDateTime tgl_mulai, OffsetDateTime tgl_selesai,  String keterangan, Timestamp created_at) {
        this.id = id;
        this.nama_proyek = nama_proyek;
        this.client = client;
        this.provinsi = provinsi;
        this.pimpinan_proyek = pimpinan_proyek;
        this.tgl_mulai = tgl_mulai;
        this.tgl_selesai = tgl_selesai;
        this.keterangan = keterangan;
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public OffsetDateTime getTgl_mulai() {
        return tgl_mulai;
    }

    public void setTgl_mulai(OffsetDateTime tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }

    public OffsetDateTime getTgl_selesai() {
        return tgl_selesai;
    }

    public void setTgl_selesai(OffsetDateTime tgl_selesai) {
        this.tgl_selesai = tgl_selesai;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Set<User> getUsers() {
        return users;
    }


    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @PrePersist
    protected void onCreate() {
        this.created_at = Timestamp.from(Instant.now());
    }

}
