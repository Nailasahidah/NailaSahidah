package com.naila.Chapter9.ObjectAndClasses.Ujian_PBO.Soal10_;

public class Pengguna {
    private int idPengguna;
    private String name;
    private double username;
    private double password;
    private int level;
    private double areaKerja;
    public Pengguna(int idPengguna, String name, double username,
                    double password, int level, double areaKerja) {
        this.idPengguna = idPengguna;
        this.name = name;
        this.username = username;
        this.password = password;
        this.level = level;
        this.areaKerja = areaKerja;
    }

    public int getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUsername() {
        return username;
    }

    public void setUsername(double username) {
        this.username = username;
    }

    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getAreaKerja() {
        return areaKerja;
    }

    public void setAreaKerja(double areaKerja) {
        this.areaKerja = areaKerja;
    }

}
