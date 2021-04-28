
/**
 *
 * @author Adelin, Isa, Yasin, Sefa
 */

package dataverse;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

public class TrafficController {

    public void createTables() {
        //Create database and its tables
        Tables table = new Tables();
        table.createRegion();
        table.createRoad();
        table.createCount_Point();
        table.createTraffic_Volume();

    }
     
    public void getYas() {
            Connection connection = DB.getConnection();
            Statement stats = null;
            ResultSet result = null;
            JDBCCategoryDataset dataset = null;
            
            try {
                
                String sql = "SELECT road_type FROM Road";       //remove everything past WHERE to collect all the data and not just for a specific id
                //"SELECT pedal_cycles, two_wheeled_motor_vehicles, cars_and_taxis, buses_and_coaches, lgvs, all_hgvs, MAX(all_motor_vehicles)\n"
                dataset = new JDBCCategoryDataset(connection, sql);
                
                System.out.println("Dataset Columns and rows ! " + dataset.getColumnCount() + " " + dataset.getRowCount());
            
                //Statement statement = connection.createStatement();
                //result = statement.executeQuery(sql);
                //if (result.next()) {
                //    System.out.println("Road name is " + result.getString("road_name"));
                //}
            } catch (Exception e) {
                System.err.println("Error readiong from Traffic DB" + e.getMessage());
            } finally {
                if (stats != null) {
                    try {
                        stats.close();
                    } catch (SQLException e){
                         System.err.println("SQLException: " + e.getMessage()); 
                    }
                }              
                if (connection != null){
                    try {
                     connection.close();   
                    } catch (SQLException e) {
                        System.err.println("SQLException: " + e.getMessage());
                        
                    }
                }
            }  
          /*  JFreeChart D2Chart = ChartFactory.createBarChart("Road", 
                    PlotOrientation.VERTICAL, true, true, false);//, true, true);
            D2Chart.setBackgroundPaint(Color.white);
            D2Chart.getTitle().setPaint(Color.blue);
            
            CategoryPlot p = D2Chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.blue);
            BarRenderer renderer = (BarRenderer) p.getRenderer();
            renderer.setDrawBarOutline(true);
            renderer.setShadowVisible(true);
            renderer.setItemMargin(-4);
            renderer.setSeriesPaint(0, Color.blue);
            
            ChartPanel ChartPanelD2 = new ChartPanel(D2Chart);
            ChartPanelD2.setVisible(true);
            ChartPanelD2.setSize(400, 300);
            */
            }
    
    
    public void insertDataIntoTables() {

        ArrayList<String> fileContents = CSVReader.readFile("../trafficStoredData.csv"); // store scv file into array list
        //Insert data into tables
        RegionTable.batchInsert(fileContents);
        RoadTable.batchInsert(fileContents);
        Count_Point.batchInsert(fileContents);
        Traffic_Volume.batchInsert(fileContents);

    }

    public static void disconnect(Connection connection) {

        try {
            if (!connection.isClosed()) {
                connection.close();
                System.out.println("Connection successfully closed.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }

    }

    //selests the highest traffic at a specific road in a specific point in time
    
    public ResultSet getHighestTrafficVolume(int hour, String road, int year) {
        Connection connection = DB.getConnection();
        String sql = "SELECT pedal_cycles, two_wheeled_motor_vehicles, cars_and_taxis, buses_and_coaches, lgvs, all_hgvs, MAX(all_motor_vehicles)\n"
                + "FROM Traffic_Volume, Road , Count_Point, Region\n"
                + "WHERE Traffic_Volume.the_hour = " + hour + "\n"
                + "AND Count_Point.the_year = " + year + "\n"
                + "AND (Road.road_name = '"+ road +"' OR Road.start_junction_road_name = '"+ road +"' OR Road.end_junction_road_name = '"+ road +"')\n"
                + "AND Count_Point.count_point_id = Traffic_Volume.count_point_id\n"
                + "AND Count_Point.road_name = Road.road_name;";
        ResultSet result = null;
        try {
            Statement statement = connection.createStatement();
            result = statement.executeQuery(sql);
            if (result.next()) {
                // System.out.println("Region name is " + result.getString("region_name"));
            }
            return result;

        } catch (Exception e) {
            System.out.println("Error readiong from Region table" + e.getMessage());
        } finally {

        }
        return null;
    }
    public ResultSet exDB1(int year, String direction) {
        Connection connection = DB.getConnection();
        String sql = "select CPC.road_name, sum(TV.all_motor_vehicles) AS Number_Of_Vehs, CPC.the_year, TV.direction_of_travel \n"+
                    "From Traffic_Volume AS TV \n" +
                    "JOIN Count_Point AS CPC ON TV.count_point_id = CPC.count_point_id\n" +
                    "JOIN Road AS RD ON RD.road_name = CPC.road_name\n" +
                    "WHERE CPC.the_year = " + year + " AND TV.direction_of_travel = '" + direction + "' \n"+
                    "GROUP BY CPC.road_name";
        ResultSet result = null;
        try {
            Statement statement = connection.createStatement();
            result = statement.executeQuery(sql);
            if (result.next()) {
                // System.out.println("Region name is " + result.getString("region_name"));
            }
            return result;

        } catch (Exception e) {
            System.out.println("Error readiong from Region table" + e.getMessage());
        } finally {

        }
        return null;
    }
    public ResultSet getYasinCon2(int road) {
        Connection connection = DB.getConnection();
        String sql = "SELECT road_type, count (distinct road_type) FROM road;"; 
        ResultSet result = null;
        try {
            Statement statement = connection.createStatement();
            result = statement.executeQuery(sql);
            if (result.next()) {
                // System.out.println("Region name is " + result.getString("region_name"));
            }
            return result;

        } catch (Exception e) {
            System.out.println("Error readiong from Region table" + e.getMessage());
        } finally {

        }
        return null;
    }
    
    public ResultSet getYasinCon3() {
        Connection connection = DB.getConnection();
        String sql = "SELECT count(Traffic_Volume.all_motor_vehicles), Count_Point.the_year"
                + "FROM Traffic_Volume, Count_Point"
                + "WHERE Count_Point.the_year = 2004";
                //+ "'" + volume + "'" + year + "'"; 
        ResultSet result = null;
        try {
            Statement statement = connection.createStatement();
            result = statement.executeQuery(sql);
            if (result.next()) {
                // System.out.println("Region name is " + result.getString("region_name"));
            }
            return result;

        } catch (Exception e) {
            System.out.println("Error readiong from Region table" + e.getMessage());
        } finally {

        }
        return null;
    }
    
    public static class Dash1 {
    
    public ResultSet getDefaultYas() {
            Connection connection = DB.getConnection();
            String sql = "select CPC.road_name, sum(TV.all_motor_vehicles) AS Number_Of_Vehs" +
                    "From Traffic_Volume AS TV" +
                    "JOIN Count_Point AS CPC ON TV.count_point_id = CPC.count_point_id" +
                    "JOIN Road AS RD ON RD.road_name = CPC.road_name" +
                    "GROUP BY CPC.road_name";
                    //+ "'" + volume + "'" + year + "'"; 

            ResultSet result = null;
            try {
                Statement statement = connection.createStatement();
                result = statement.executeQuery(sql);
                if (result.next()) {
                    // System.out.println("Region name is " + result.getString("region_name"));
                }
                return result;

            } catch (Exception e) {
                System.out.println("Error readiong from Region table" + e.getMessage());
            } finally {

            }
            return null;
        }
    }
    
    
    /*public JDBCCategoryDataset draw2KNorthYas(int Year, String Direction){
        Connection DefYas = DB.getConnection();
        Statement StYas = null;
        JDBCCategoryDataset YearDirectionYas = null;
        
        try {
           
            String sql = "select CPC.road_name, sum(TV.all_motor_vehicles) AS Number_Of_Vehs, CPC.the_year, TV.direction_of_travel \n"+
                    "From Traffic_Volume AS TV \n" +
                    "JOIN Count_Point AS CPC ON TV.count_point_id = CPC.count_point_id\n" +
                    "JOIN Road AS RD ON RD.road_name = CPC.road_name\n" +
                    "WHERE CPC.the_year = " + Year + " AND TV.direction_of_travel = '" + Direction + "' \n"+
                    "GROUP BY CPC.road_name";

            YearDirectionYas = new JDBCCategoryDataset(DefYas, sql);
            
            System.out.println("Dataset Columns and Rows : " + YearDirectionYas.getColumnCount() + " " + YearDirectionYas.getRowCount());
            
        
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());        
        } finally {
            if (StYas != null){
                try{
                    StYas.close();
                } catch (SQLException e) {
                    System.out.println("SQLException: " + e.getMessage());
                }
                
            } 
        }        
    }   */
    
    //public 
    /*public ResultSet getConTestY(){
        Connection DefYas = DB.getConnection();
        Statement StYas = null;
        JDBCCategoryDataset defDataYas = null;
        
        try {
           
            String sql = "select CPC.road_name, sum(TV.all_motor_vehicles) AS Number_Of_Vehs \n" +
                "From Traffic_Volume AS TV\n" +
                "JOIN Count_Point AS CPC ON TV.count_point_id = CPC.count_point_id\n" +
                "JOIN Road AS RD ON RD.road_name = CPC.road_name \n" +
                "GROUP BY CPC.road_name";
            
            defDataYas = new JDBCCategoryDataset(DefYas, sql);
            
            System.out.println("Dataset Columns and Rows : " + defDataYas.getColumnCount() + " " + defDataYas.getRowCount());
            
        
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());        
        } finally {
            if (StYas != null){
                try{
                    StYas.close();
                } catch (SQLException e) {
                    System.out.println("SQLException: " + e.getMessage());
                }
            }
            if (DefYas != null) {
                
            }
        }
        return null;    
    }*/
    

    public static class DB {

        public static Connection getConnection() {

            String urlSQLite = "jdbc:sqlite:../traffic.db";

            try {
                Driver driverSQLite = new org.sqlite.JDBC();
                DriverManager.registerDriver(driverSQLite);
                System.out.println("SQLite Driver Loaded up");
            } catch (Exception e) {
                System.out.println("There is a problem with the SQLite Driver" + e.getMessage());
            }
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(urlSQLite);
                System.out.println("Connection established");
            } catch (Exception e) {
                System.out.println("Error connectiong to database");
            }
            return connection;
        }

        public void hello() {
        }
    }

    public static class Tables {    //used to create tables

        public void createRegion() {
            Connection connection = DB.getConnection();
            String sql = "CREATE TABLE if not exists Region"
                    + "("
                    + "region_id INTEGER(2),"
                    + "region_name VARCHAR(30) NOT NULL,"
                    + "local_authority_id INTEGER(3) UNIQUE NOT NULL,"
                    + "local_authority_name VARCHAR(30) NOT NULL,"
                    + "CONSTRAINT r_reg_pk PRIMARY KEY (region_id)"
                    + ");";
            try {
                Statement sqlStatement = connection.createStatement();
                sqlStatement.executeUpdate(sql);
                System.out.println("Region table created");
            } catch (Exception e) {
                System.out.println("Error creating Region table" + e.getMessage());
            }

        }

        public void createRoad() {
            Connection connection = DB.getConnection();
            String sql = "CREATE TABLE if not exists Road"
                    + "("
                    + "road_name VARCHAR(10),"
                    + "region_id INTEGER(2) NOT NULL,"
                    + "road_type VARCHAR(10) NOT NULL,"
                    + "start_junction_road_name	VARCHAR(40),"
                    + "end_junction_road_name VARCHAR(40),"
                    + "easting INTEGER(7) NOT NULL,"
                    + "northing INTEGER(7) NOT NULL,"
                    + "latitude DECIMAL(10,8) NOT NULL,"
                    + "longitude DECIMAL(10,8) NOT NULL,"
                    + "link_length_km DECIMAL(4,2),"
                    + "link_length_miles DECIMAL(4,2),"
                    + "CONSTRAINT r_rdname_pk PRIMARY KEY (road_name),"
                    + "CONSTRAINT r_reg_fk FOREIGN KEY (region_id) REFERENCES Region (region_id)"
                    + ");";
            try {
                Statement sqlStatement = connection.createStatement();
                sqlStatement.executeUpdate(sql);
                System.out.println("Road table created");
            } catch (Exception e) {
                System.out.println("Error creating Road table" + e.getMessage());
            }

        }

        public void createCount_Point() {
            Connection connection = DB.getConnection();
            String sql = "CREATE TABLE if not exists Count_Point"
                    + "("
                    + "count_point_id INTEGER(7),"
                    + "road_name VARCHAR(10) NOT NULL,"
                    + "the_year INTEGER(4) NOT NULL,"
                    + "count_date DATE NOT NULL,"
                    + "CONSTRAINT c_cpoint_pk PRIMARY KEY (count_point_id, count_date),"
                    + "CONSTRAINT c_rdname_fk FOREIGN KEY (road_name) REFERENCES Road (road_name)"
                    + ");";
            try {
                Statement sqlStatement = connection.createStatement();
                sqlStatement.executeUpdate(sql);
                System.out.println("Count_Point table created");
            } catch (Exception e) {
                System.out.println("Error creating Count_Point table" + e.getMessage());
            }

        }

        public void createTraffic_Volume() {
            Connection connection = DB.getConnection();
            String sql = "CREATE TABLE if not exists Traffic_Volume"
                    + "("
                    + "traffic_volume_id INTEGER(10),"
                    + "count_point_id INTEGER(10) NOT NULL,"
                    + "pedal_cycles INTEGER(5) NOT NULL,"
                    + "two_wheeled_motor_vehicles INTEGER(6) NOT NULL,"
                    + "cars_and_taxis INTEGER(6) NOT NULL,"
                    + "buses_and_coaches INTEGER(6) NOT NULL,"
                    + "lgvs INTEGER(6) NOT NULL,"
                    + "hgvs_2_rigid_axle INTEGER(6) NOT NULL,"
                    + "hgvs_3_rigid_axle INTEGER(6) NOT NULL,"
                    + "hgvs_4_or_more_rigid_axle INTEGER(6) NOT NULL,"
                    + "hgvs_3_or_4_articulated_axle INTEGER(6) NOT NULL,"
                    + "hgvs_5_articulated_axle INTEGER(6) NOT NULL,"
                    + "hgvs_6_articulated_axle INTEGER(6) NOT NULL,"
                    + "all_hgvs INTEGER(6) NOT NULL,"
                    + "all_motor_vehicles INTEGER(6) NOT NULL,"
                    + "the_hour INTEGER(2) NOT NULL,"
                    + "direction_of_travel CHAR(1) NOT NULL,"
                    + "CONSTRAINT t_trvol_pk PRIMARY KEY (traffic_volume_id),"
                    + "CONSTRAINT t_cpoint_fk FOREIGN KEY (count_point_id) REFERENCES Count_Point (count_point_id)"
                    + ");";
            try {
                Statement sqlStatement = connection.createStatement();
                sqlStatement.executeUpdate(sql);
                System.out.println("Traffic_Volume table created");
            } catch (Exception e) {
                System.out.println("Error creating Traffic_Volume table" + e.getMessage());
            }

        }

    }

    public static class CSVReader {

        public static ArrayList<String> readFile(String fileName) {
            ArrayList<String> fileContents = new ArrayList<>();

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

                String line = "";
                bufferedReader.readLine();
                while ((line = bufferedReader.readLine()) != null) {
                    fileContents.add(line);
//                System.out.println(line);
                }

            } catch (Exception e) {
                System.out.println("Error reading the file" + e.getMessage());
            }

            return fileContents;
        }
    }

    public static class RegionTable {

        static Connection connection = DB.getConnection();

        public static void insert(int id, String name, int localId, String localName) {

            String sql = "INSERT INTO Region (region_id, region_name, local_authority_id, local_authority_name) VALUES"
                    + "("
                    + "'" + id + "',"
                    + "'" + name + "',"
                    + "'" + localId + "',"
                    + "'" + localName + "'"
                    + ");";
            try {
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
                System.out.println("Data inserted into Region table successfully");
            } catch (Exception e) {
                System.out.println("Error inserting data into Region table" + e.getMessage());
            }

        }

        public static void batchInsert(ArrayList<String> input) {
            for (String currentLine : input) {
                String[] lineArray = currentLine.split(",");
                int id = Integer.parseInt(lineArray[5]);
                String name = lineArray[6];
                int localId = Integer.parseInt(lineArray[7]);
                String localName = lineArray[8];

                insert(id, name, localId, localName);
            }
        }

        //collect sql data based on id
        public static ResultSet get(int id) {
            String sql = "SELECT * FROM Region WHERE region_id = " + id;        //remove everything past WHERE to collect all the data and not just for a specific id
            ResultSet result = null;
            try {
                Statement statement = connection.createStatement();
                result = statement.executeQuery(sql);
                if (result.next()) {
                    // System.out.println("Region name is " + result.getString("region_name"));
                }

            } catch (Exception e) {
                System.out.println("Error readiong from Region table" + e.getMessage());
            } finally {
                return result;
            }

        }

        //update the sql data
        public static void update(int id, String name, int localId, String localName) {

            String sql = "UPDATE Region SET region_name = '" + name + "', local_authority_id = '" + localId + "', local_authority_name = '" + localName + "' WHERE region_id = " + id;

            try {
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
                System.out.println("Data updated");
            } catch (Exception e) {
                System.out.println("Error updating Region table" + e.getMessage());
            }

        }

        public static void delete(int id) {

            String sql = "DELETE FROM Region WHERE region_id = " + id;

            try {
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
                System.out.println("Data deleted");
            } catch (Exception e) {
                System.out.println("Error removing data from Region table" + e.getMessage());
            }

        }

    }

    public static class RoadTable {

        static Connection connection = DB.getConnection();

        public static void insert(String road_name, int region_id, String road_type, String start_junction_road_name, String end_junction_road_name, int easting, int northing, Double latitude, Double longitude, String link_length_km, String link_length_miles) {

//        System.out.println(road_name + " " + region_id + " " + road_type + " " + start_junction_road_name + " " + end_junction_road_name + " " + easting +  " " +northing +  " " + latitude + " " + longitude + " " + link_length_km + " " + link_length_miles);
            String sql = "INSERT INTO Road (road_name, region_id, road_type, start_junction_road_name, end_junction_road_name, easting, northing, latitude, longitude, link_length_km, link_length_miles) VALUES"
                    + "("
                    + "'" + road_name + "',"
                    + "'" + region_id + "',"
                    + "'" + road_type + "',"
                    + "'" + start_junction_road_name + "',"
                    + "'" + end_junction_road_name + "',"
                    + "'" + easting + "',"
                    + "'" + northing + "',"
                    + "'" + latitude + "',"
                    + "'" + longitude + "',"
                    + "'" + link_length_km + "',"
                    + "'" + link_length_miles + "'"
                    + ");";
            try {

                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
                System.out.println("Data inserted into Road table successfully");
            } catch (Exception e) {
                System.out.println("Error inserting data into Road table" + e.getMessage());
            }

        }

        public static void batchInsert(ArrayList<String> input) {
            for (String currentLine : input) {
                String[] lineArray = currentLine.split(",");
                if (lineArray[11].equals("")) {
                    lineArray[11] = null;
                }
                if (lineArray[12].equals("")) {
                    lineArray[12] = null;
                }
                if (lineArray[17].equals("")) {
                    lineArray[17] = null;
                }
                if (lineArray[18].equals("")) {
                    lineArray[18] = null;
                }
//System.out.println(lineArray[11] + " " + lineArray[12] + " " + lineArray[17] + " " + lineArray[18]);
                System.out.println(lineArray[13]);

                String road_name = lineArray[9];
                int region_id = Integer.parseInt(lineArray[5]);
                String road_type = lineArray[10];
                String start_junction_road_name = lineArray[11];
                String end_junction_road_name = lineArray[12];
                int easting = Integer.parseInt(lineArray[13]);
                int northing = Integer.parseInt(lineArray[14]);
                Double latitude = Double.parseDouble(lineArray[15]);
                Double longitude = Double.parseDouble(lineArray[16]);
                String link_length_km = lineArray[17];
                String link_length_miles = lineArray[18];

                insert(road_name, region_id, road_type, start_junction_road_name, end_junction_road_name, easting, northing, latitude, longitude, link_length_km, link_length_miles);
            }
        }
    }

    public static class Count_Point {

        static Connection connection = DB.getConnection();

        public static void insert(int count_point_id, String road_name, String the_year, String count_date) {

            String sql = "INSERT INTO Count_Point (count_point_id, road_name, the_year, count_date) VALUES"
                    + "("
                    + "'" + count_point_id + "',"
                    + "'" + road_name + "',"
                    + "'" + the_year + "',"
                    + "'" + count_date + "'"
                    + ");";

            try {
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
                System.out.println("Data inserted into Count_Point table successfully");
            } catch (Exception e) {
                System.out.println("Error inserting data into Count_Point table" + e.getMessage());
            }

        }

        public static void batchInsert(ArrayList<String> input) {
            for (String currentLine : input) {
                String[] lineArray = currentLine.split(",");
                int count_point_id = Integer.parseInt(lineArray[0]);
                String road_name = lineArray[9];
                String the_year = lineArray[2];
                String count_date = lineArray[3];

                insert(count_point_id, road_name, the_year, count_date);
            }
        }

    }

    public static class Traffic_Volume {

        static Connection connection = DB.getConnection();

        public static void insert(int traffic_volume_id, int count_point_id, int pedal_cycles, int two_wheeled_motor_vehicles, int cars_and_taxis, int buses_and_coaches, int lgvs, int hgvs_2_rigid_axle, int hgvs_3_rigid_axle, int hgvs_4_or_more_rigid_axle, int hgvs_3_or_4_articulated_axle, int hgvs_5_articulated_axle, int hgvs_6_articulated_axle, int all_hgvs, int all_motor_vehicles, int the_hour, char direction_of_travel) {

            String sql = "INSERT INTO Traffic_Volume (traffic_volume_id, count_point_id, pedal_cycles, two_wheeled_motor_vehicles, cars_and_taxis, buses_and_coaches, lgvs, hgvs_2_rigid_axle, hgvs_3_rigid_axle, hgvs_4_or_more_rigid_axle, hgvs_3_or_4_articulated_axle, hgvs_5_articulated_axle, hgvs_6_articulated_axle, all_hgvs, all_motor_vehicles, the_hour, direction_of_travel) VALUES"
                    + "("
                    + "'" + traffic_volume_id + "',"
                    + "'" + count_point_id + "',"
                    + "'" + pedal_cycles + "',"
                    + "'" + two_wheeled_motor_vehicles + "',"
                    + "'" + cars_and_taxis + "',"
                    + "'" + buses_and_coaches + "',"
                    + "'" + lgvs + "',"
                    + "'" + hgvs_2_rigid_axle + "',"
                    + "'" + hgvs_3_rigid_axle + "',"
                    + "'" + hgvs_4_or_more_rigid_axle + "',"
                    + "'" + hgvs_3_or_4_articulated_axle + "',"
                    + "'" + hgvs_5_articulated_axle + "',"
                    + "'" + hgvs_6_articulated_axle + "',"
                    + "'" + all_hgvs + "',"
                    + "'" + all_motor_vehicles + "',"
                    + "'" + the_hour + "',"
                    + "'" + direction_of_travel + "'"
                    + ");";
            try {
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
                System.out.println("Data inserted into Traffic_Volume table successfully");
            } catch (Exception e) {
                System.out.println("Error inserting data into Traffic_Volume table" + e.getMessage());
            }

        }

        public static void batchInsert(ArrayList<String> input) {
            int the_id = 1000;
            for (String currentLine : input) {
                String[] lineArray = currentLine.split(",");
                int traffic_volume_id = the_id;
                the_id++;
                int count_point_id = Integer.parseInt(lineArray[0]);
                int pedal_cycles = Integer.parseInt(lineArray[19]);
                int two_wheeled_motor_vehicles = Integer.parseInt(lineArray[20]);
                int cars_and_taxis = Integer.parseInt(lineArray[21]);
                int buses_and_coaches = Integer.parseInt(lineArray[22]);
                int lgvs = Integer.parseInt(lineArray[23]);
                int hgvs_2_rigid_axle = Integer.parseInt(lineArray[24]);
                int hgvs_3_rigid_axle = Integer.parseInt(lineArray[25]);
                int hgvs_4_or_more_rigid_axle = Integer.parseInt(lineArray[26]);
                int hgvs_3_or_4_articulated_axle = Integer.parseInt(lineArray[27]);
                int hgvs_5_articulated_axle = Integer.parseInt(lineArray[28]);
                int hgvs_6_articulated_axle = Integer.parseInt(lineArray[29]);
                int all_hgvs = Integer.parseInt(lineArray[30]);
                int all_motor_vehicles = Integer.parseInt(lineArray[31]);
                int the_hour = Integer.parseInt(lineArray[4]);
                char direction_of_travel = lineArray[1].charAt(0);

                insert(traffic_volume_id, count_point_id, pedal_cycles, two_wheeled_motor_vehicles, cars_and_taxis, buses_and_coaches, lgvs, hgvs_2_rigid_axle, hgvs_3_rigid_axle, hgvs_4_or_more_rigid_axle, hgvs_3_or_4_articulated_axle, hgvs_5_articulated_axle, hgvs_6_articulated_axle, all_hgvs, all_motor_vehicles, the_hour, direction_of_travel);
            }
        }
    }

}
