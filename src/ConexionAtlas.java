
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *"mongodb+srv://diego:diego123@cluster0.wzahz.mongodb.net/ejemplo1?retryWrites=true&w=majority");
 * @author pc
 */
public class ConexionAtlas extends MongoClient{
    
    public ConexionAtlas(MongoClientURI direccionConexion){
        super(direccionConexion);
    }

}
