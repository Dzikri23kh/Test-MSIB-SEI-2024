package com.domain.rest_api.models.entities;



import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "lokasi")
public class User implements Serializable{

    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Nama Lokasi harus di isi!")
    private String nama_lokasi;

    @NotEmpty(message = "Negara harus di isi!")
    private String negara;

    @NotEmpty(message = "Provinsi harus di isi!")
    private String provinsi;

    @NotEmpty(message = "Kota harus di isi!")
    private String kota;

    private Timestamp created_at;

    @ManyToMany
    @JoinTable(name = "proyek_lokasi", joinColumns = @JoinColumn(name = "lokasi_id"), inverseJoinColumns = @JoinColumn(name = "proyek_id"))
    private Set<Proyek> proyeks;
    
    public User() {
    }

    public User(Long id, String nama_lokasi, String negara, String provinsi, String kota, Timestamp created_at) {
        this.id = id;
        this.nama_lokasi = nama_lokasi;
        this.negara = negara;
        this.provinsi = provinsi;
        this.kota = kota;
        this.created_at = created_at;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_lokasi() {
        return nama_lokasi;
    }

    public void setNama_lokasi(String nama_lokasi) {
        this.nama_lokasi = nama_lokasi;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    @PrePersist
    protected void onCreate() {
        this.created_at = Timestamp.from(Instant.now());
    }

    public Set<Proyek> getProyeks() {
        return proyeks;
    }

    public void setProyeks(Set<Proyek> proyeks) {
        this.proyeks = proyeks;
    }

    

    

}
