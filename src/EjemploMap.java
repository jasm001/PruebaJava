import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    private Map<String,String> datosUsuario = new HashMap<>();

    public boolean AgregarInformacionUsuario(String clave,String valor){
        try{
            datosUsuario.put(clave,valor);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    public String RecuperarValorPorClave(String clave){
        if(clave == null){
            return null;
        }
        return datosUsuario.getOrDefault(clave, null);
    }

    public boolean EliminarValor(String clave){
        if(clave == null){
            return false;
        }

        if(datosUsuario.containsKey(clave)){
            datosUsuario.remove(clave);
            return true;
        }

        return false;
    }

    public String VerTodos(){
        StringBuilder resultado = new StringBuilder();
        for(String clave:datosUsuario.keySet()){
            resultado.append(clave + " -> " +datosUsuario.get(clave));
            resultado.append("\n");
        }
        return resultado.toString();
    }
}
