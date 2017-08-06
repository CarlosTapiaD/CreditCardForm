package carlostapiadominguez.creditcardform;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;

/**
 * Created by Carlos Tapia D on 01/07/17.
 */

public class Tarjetas implements Parcelable {

    private String name;
    private String lastName;
    private String nTarjeta;
    private int mes;
    private int anio;
    private int codigo;
    private String calle;
    private String ciudad;
    private String estado;
    private int cP;

    public Tarjetas(){
        this.name="vacio";
        this.lastName="vacio";
        this.nTarjeta="Vacio";
        this.mes=21;
        this.anio=21;
        this.codigo=21;
        this.calle="vacio";
        this.ciudad="vacio";
        this.estado="vacio";
        this.cP=21;
    }

    public Tarjetas(String cName,String cLastName, String cNTarjeta, int cMes, int cAnio,int cCodigo, String cCalle, String cCiudad,String cEstado ,int cCP){
        this.name=cName;
        this.lastName=cLastName;
        this.nTarjeta=cNTarjeta;
        this.mes=cMes;
        this.anio=cAnio;
        this.codigo=cCodigo;
        this.calle=cCalle;
        this.ciudad=cCiudad;
        this.estado=cEstado;
        this.cP=cCP;



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getnTarjeta() {
        return nTarjeta;
    }

    public void setnTarjeta(String nTarjeta) {

        this.nTarjeta = nTarjeta;
    }

    public int getMes()
    {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getcP() {
        return cP;
    }

    public void setcP(int cP) {
        this.cP = cP;
    }



    protected Tarjetas(Parcel in) {
        name = in.readString();
        lastName = in.readString();
        nTarjeta = in.readString();
        mes = in.readInt();
        anio = in.readInt();
        codigo = in.readInt();
        calle = in.readString();
        ciudad = in.readString();
        estado = in.readString();
        cP = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(lastName);
        dest.writeString(nTarjeta);
        dest.writeInt(mes);
        dest.writeInt(anio);
        dest.writeInt(codigo);
        dest.writeString(calle);
        dest.writeString(ciudad);
        dest.writeString(estado);
        dest.writeInt(cP);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Tarjetas> CREATOR = new Parcelable.Creator<Tarjetas>() {
        @Override
        public Tarjetas createFromParcel(Parcel in) {
            return new Tarjetas(in);
        }

        @Override
        public Tarjetas[] newArray(int size) {
            return new Tarjetas[size];
        }
    };
}