package pe.edu.cibertec.patitas_backend_b.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.patitas_backend_b.dto.LoginRequestDTO;
import pe.edu.cibertec.patitas_backend_b.service.AutenticacionService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class AutenticacionServiceImpl implements AutenticacionService {

    @Autowired
    ResourceLoader resourceLoader;
    @Override
    public String[] validarUsuario(LoginRequestDTO loginRequestDTO) throws IOException {
    String datosUsuario = null;
        Resource resource = resourceLoader.getResource("classpath:usuarios.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(resource.getFile()))) {

        } catch (IOException e) {
            throw new IOException(e);
        }

        return new String[0];
    }
}
