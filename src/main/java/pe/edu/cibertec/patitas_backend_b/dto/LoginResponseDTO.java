package pe.edu.cibertec.patitas_backend_b.dto;

public record LoginResponseDTO(String codigo, String mensaje,String tipoDocumento, String numeroDocumento, String nombreUsuario, String correoUsuario) {
}
