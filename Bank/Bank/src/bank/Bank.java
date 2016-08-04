
package bank;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bank {
    
    
    static int acno=0;
    String fnm,lnm,pass,gender;
    int age,bal,acn;
    static Bank bk[]=new Bank[100];
    
    
    static int creatAc(String fnm,String lnm,int age,String pass,String gen)
    {
        bk[acno]=new Bank();
        bk[acno].fnm=fnm;
        bk[acno].lnm=lnm;
        bk[acno].age=age;        
        bk[acno].pass=pass;
        bk[acno].gender=gen;
        bk[acno].acn=acno+100;
        bk[acno].bal=0;
        
        String offline=fnm+"@"+lnm+"@"+age+"@"+pass+"@"+gen+"@"+(acno+100)+"@"+bk[acno].bal+"@";
        try{FileOutputStream fout=new FileOutputStream("Acno"+(acno+100)+".txt");
        FileOutputStream fout1=new FileOutputStream("User_list.txt",true);
        byte bt1[]=("@"+(acno+100)).getBytes();
        fout1.write(bt1);
        fout1.close();        
        byte bt[]=offline.getBytes();
        fout.write(bt);
        fout.close();        
        }catch(Exception e){}
        acno++;
        return bk[acno-1].acn;
    }
    
    static String rfnm,rlnm,rpass,rgen;
    static int rage,racno,rbal;
   
    static void readInfo(int ac)
    {
        try{
            FileInputStream fin=new FileInputStream("Acno"+ac+".txt");
            int i;
            String data="";
            while((i=fin.read())!=-1)
            data=data+(char)i;
            StringTokenizer st=new StringTokenizer(data,"@");
            rfnm=st.nextToken();
            rlnm=st.nextToken();
            rage=Integer.parseInt(st.nextToken());
            rpass=st.nextToken();
            rgen=st.nextToken();
            racno=Integer.parseInt(st.nextToken());
            rbal=Integer.parseInt(st.nextToken());
        }catch(Exception e){}
    }
  
    
    static void readInfo()
    {
        try{
            FileInputStream fin=new FileInputStream("User_list.txt");
            int i;
            String data="";
            while((i=fin.read())!=-1)
            data=data+(char)i;
           // StringTokenizer st=new StringTokenizer(data,"@");
            int a=data.lastIndexOf('@');
            a++;
            int b=a+3;
            String newdata=data.substring(a,b);
            acno=Integer.parseInt(newdata)-100+1;
            
        }catch(Exception e){}
    }    
    
    
    static void writeInfo(int ac)
    {
        String offline=rfnm+"@"+rlnm+"@"+rage+"@"+rpass+"@"+rgen+"@"+(ac)+"@"+rbal+"@";
        try{FileOutputStream fout=new FileOutputStream("Acno"+ac+".txt");
        byte bt[]=offline.getBytes();
        fout.write(bt);
        fout.close();
        }catch(Exception e){}
    }
        
   
    static boolean login(int acn,String pass)
    {
        readInfo(acn);
        if(racno==acn&&rpass.equals(pass))
            return true;
        else
            return false;
    }
    
    
    static boolean isAc(int ac)
    {
        try {
            FileInputStream fin=new FileInputStream("User_list.txt");
            String data="";
            int i;
            try {while((i=fin.read())!=-1)
                    data=data+(char)i;
            } catch (IOException ex) {}
            StringTokenizer st=new StringTokenizer(data,"@");
            boolean a=false;
            while(st.hasMoreTokens())
            {
                if(Integer.parseInt(st.nextToken())==ac)
                {
                    a=true;
                    break;
                }
            }
            return a;
        } catch (FileNotFoundException ex) {return false;}
        
    }
    
    
    static void awMoney(int ac,int mon)
    {
        
    }
    

    public static void main(String[] args) {
        
        new BankGUI().setVisible(true);
        readInfo();
   }
    
}
