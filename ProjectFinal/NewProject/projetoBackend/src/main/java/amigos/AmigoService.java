
package amigos;

import static java.awt.Event.DELETE;
import static java.nio.file.attribute.AclEntryPermission.DELETE;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/amigos")
public class AmigoService {

    Integer contador;
    List<Amigo> amigos;
    
    public AmigoService() {

        amigos = new ArrayList<>();
        contador = 1;
    }
    
    @GET
    public List<Amigo> getAmigos(){

        return amigos;
    }

    @POST
    public void adicionar (Amigo amigo){
        amigo.setId(contador++);
        amigos.add(amigo);
    }

    @PUT
    @Path("{id}")
    public void atualizar (@PathParam ("id") Integer id, Amigo amigo){
        for (Amigo a : amigos){
            if (a.getId().equals(id)){
                a.setNome(amigo.getNome());
                a.setTelefone(amigo.getTelefone());
                a.setEmail(amigo.getEmail());
                a.setApelido(amigo.getApelido());
                break;
            }
        }
    }
    @DELETE
    @Path("{id}")
    public void excluir (@PathParam ("id") Integer id){
        for (Amigo a : amigos){
            if(a.getId().equals(id)){
                amigos.remove(a);
                break;
            }
        }
    }
    @GET
    @Path("{id}")
    public Amigo getAmigo (@PathParam ("id") Integer id){
        for (Amigo a : amigos){
            if(a.getId().equals(id)){
                return a;
            }
        }
        return null;
    }
}

