
package service;
import java.sql.*;
import db.DBConnection;

public class UserService {

    public static boolean register(String name,String email,String password){
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps =
                con.prepareStatement("insert into users values(null,?,?,?)");
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,password);
            return ps.executeUpdate()>0;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
