/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harpreet
 */
public class IDgenerate {
    
    
   
   /* String r1=rs.getString("P_Id");
            int ln=r1.length();
            String stxt=r1.substring(0,3);
            String snum=r1.substring(3,ln);
            int n=Integer.parseInt(snum);
            n++;
            snum=Integer.toString(n);
            id=stxt+snum;*/
    
    
    public   static String NEWID(String strDate, String dep) throws SQLException{
      
        String str;
        MyDB db=new MyDB();
        Connection con=db.getCon();
        int s1=strDate.length();
        int d1=dep.length();
        
        try{
            Statement stmt = con.createStatement();
           // ResultSet rs1=stmt.executeQuery("select S_no from complainttable order by S_no desc limit 1");
       ResultSet rs1=stmt.executeQuery("select Com_id from complainttable order by S_no desc limit 1");
            String strD=strDate.substring(6, 10);
            String sdep=null;
            if(dep.equals("APPLIED MECHANICS"))
                sdep="APME";
           else  if(dep.equals("BIOTECHNOLOGY"))
                sdep="BIOT";
           else  if(dep.equals("CHEMICAL ENGG"))
                sdep="CHEM";
            else  if(dep.equals("CIVIL ENGG"))
                sdep="CIVI";
           else  if(dep.equals("COMPUTER SCI & ENGG"))
                sdep="COMP";
           else  if(dep.equals("ELECTRICAL ENGG"))
                sdep="ELEC";
           else  if(dep.equals("MECHANICAL ENGG"))
                sdep="MECH";
           else  if(dep.equals("MGMT STUDIES"))
                sdep="MGMT";
           else  if(dep.equals("DEAN ACADEMIC"))
                sdep="ACAD";
            else if(dep.equals("DEAN STU WELFARE"))
                sdep="STUW";
            else if(dep.equals("CHIEF PROCTOR"))
                sdep="CHPR";
            
            if(rs1.next()){
                String Id=rs1.getString("Com_id");
                int l=Id.length();
                String newId=Id.substring(l-4, l);
                int n=Integer.parseInt(newId);
                n++;
                if(n<10)
                Id="000"+Integer.toString(n);
                else if(n<100)
                Id="00"+Integer.toString(n);
                else if(n<1000)
                Id="0"+Integer.toString(n);  
                
                str= sdep+"/"+strD+"/"+Id;
                
                return str;
            }else{
                String m="0001";
                str= sdep+"/"+strD+"/"+m;
                return str;
            }
                
            
        }catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;

   
        
       
        }
        
        
        
    }
    

