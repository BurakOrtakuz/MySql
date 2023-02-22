import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        DbHelper dbhelper = new DbHelper();
        Connection connection =null;
        PreparedStatement statement =null;
        ResultSet resultSet;
        try{
            String sql="update city set population=31 where id=4080";

            connection = dbhelper.getConnection();
            statement = connection.prepareStatement(sql);

            int result=statement.executeUpdate();
            System.out.println("Kayıt güncellendi");
        }catch(SQLException exception){
            dbhelper.showErrorMassage(exception);
        }finally{
            connection.close();
            statement.close();
        }

    }
}
