public class Incidente {
    private String id;
    private Date fechaReportada;
    private String estado;
    private String descripcion;
    private List<String> solicitudes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaReportada() {
        return fechaReportada;
    }

    public void setFechaReportada(Date fechaReportada) {
        this.fechaReportada = fechaReportada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<String> solicitudes) {
        this.solicitudes = solicitudes;
    }
}