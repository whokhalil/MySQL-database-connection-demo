package Client.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClientDemo {


    public static String add(Client name){
        boolean f = false;
            try {
           Connection con = ConnectionCP.create();
            String q = "insert into client(name) values(?)";

                PreparedStatement p = con.prepareStatement(q);
                p.setString(1,name.getName());
                p.executeUpdate();
                f = true;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        if(f == true) return "Successfully added";
        return "Error occured";
    }

    public static String delete(int id){
        boolean f = false;
        try {
           Connection cp = ConnectionCP.create();
            String q = "delete from client where id =?";

            PreparedStatement p = cp.prepareStatement(q);
            p.setInt(1,id);
            p.executeUpdate();
            f = true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(f == true) return "Successfully deleted";
        return "Error occured";
    }

    public static String update(int id, String name){
        boolean f = false;
        try {
           Connection cp = ConnectionCP.create();
            String q = "update client set name = ? where id = ?";

            PreparedStatement p = cp.prepareStatement(q);
            p.setString(1,name);
            p.setInt(2, id);
            p.executeUpdate();
            f = true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(f == true) return "Successfully updated";
        return "Error occured";
    }
    public static ArrayList<Client> get(){
       ArrayList<Client> ans = new ArrayList<>();
       boolean f = false;
        try {
      Connection cp = ConnectionCP.create();
       String q = "select * from client";
        PreparedStatement p = cp.prepareStatement(q);
            ResultSet r = p.executeQuery();
            while(r.next()){
                int id = r.getInt(1);
                String name = r.getString(2);
                Client cus = new Client(id,name);
                ans.add(cus);
            }
            f = true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String x = "Error occured";
        if (f == true) return ans;
        else throw new RuntimeException(x);
    }

}
