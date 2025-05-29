/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Atributos;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author estra
 */
public class CRUD {
     private static final String ARCHIVO_JSON = "catalogo_herramientas.json";
    private static final ObjectMapper mapper = new ObjectMapper();

    public static List<Atributos> readTool() throws IOException {
        File archivo = new File(ARCHIVO_JSON);
        if (!archivo.exists()) return new ArrayList<>();
        return mapper.readValue(archivo, new TypeReference<List<Atributos>>() {});
    }

    public static void updateTool(List<Atributos> usuarios) throws IOException {
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARCHIVO_JSON), usuarios);
    }

    public static void addTool(Atributos nuevoUsuario) throws IOException {
        List<Atributos> usuarios = readTool();
        usuarios.add(nuevoUsuario);
        updateTool(usuarios);
    }

    public static Atributos searchTool(int id) throws IOException {
        return readTool().stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    public static void upgradeTool(Atributos usuarioActualizado) throws IOException {
        List<Atributos> tool = readTool();
        for (int i = 0; i < tool.size(); i++) {
            if (tool.get(i).getId() == usuarioActualizado.getId()) {
                tool.set(i, usuarioActualizado);
                break;
            }
        }
        updateTool(tool);
    }

    public static void deleteTool(int id) throws IOException {
        List<Atributos> tool = readTool();
        tool.removeIf(u -> u.getId() == id);
        updateTool(tool);
    }
}
