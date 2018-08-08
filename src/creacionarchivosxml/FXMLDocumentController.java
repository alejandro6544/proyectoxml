/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivosxml;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Empleado;

/**
 *
 * @author dacastro
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label ltitulo;
    @FXML
    private Label lnombre;
    @FXML
    private Label ldireccion;
    @FXML
    private Label ledad;
    @FXML
    private Label lcodEmpleado;
    @FXML
    private Label ldepartamento;
    @FXML
    private TextField tnombre;
    @FXML
    private TextField tdir;
    @FXML
    private TextField tedad;
    @FXML
    private TextField tcodEmpleado;
    @FXML
    private TextField tdepartamento;

    LinkedList<Empleado> listaEmpleados;

    @FXML
    private void agregarEmpleadoLista(ActionEvent event) {
        String nombre = tnombre.getText();
        String direccion = tdir.getText();
        int edad = Integer.parseInt(tedad.getText());
        String codigoEmpleado=tcodEmpleado.getText();
        String departamento=tdepartamento.getText();

        Empleado objE=new Empleado(codigoEmpleado, departamento, nombre, direccion, edad);
        listaEmpleados.add(objE);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaEmpleados = new LinkedList<>();
    }

}
