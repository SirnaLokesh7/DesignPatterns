interface DAO{
    public void save();
}

interface XMLDAO extends DAO{

}
interface DBDAO extends DAO{

}

class XMLEmpDAO implements XMLDAO{

    @Override
    public void save() {
        System.out.println("Saving Employee data in XML");        
    }

}
class XMLDeptDAO implements XMLDAO{

    @Override
    public void save() {
        System.out.println("Saving Department data in XML");    
    }

}

class DBEmpDAO implements DBDAO{

    @Override
    public void save() {
        System.out.println("Saving Employee data in Database");     
    }

}
class DBDeptDAO implements DBDAO{

    @Override
    public void save() {
        System.out.println("Saving Department data in Database");    
    }

}

interface DAOAbstractFactory{
    public  DAO createDAO(String type);
}

class XMLFactory implements DAOAbstractFactory{
    public  XMLDAO createDAO(String type){
        XMLDAO obj=null;
        if(type.equals("emp")){
            obj=new XMLEmpDAO();
        }
        else if(type.equals("dept")){
            obj=new XMLDeptDAO();
        }
        return obj;
    }
}

class DBFactory implements DAOAbstractFactory{
    public  DBDAO createDAO(String type){
        DBDAO obj=null;
        if(type.equals("emp")){
            obj=new DBEmpDAO();
        }
        else if(type.equals("dept")){
            obj=new DBDeptDAO();
        }
        return obj;

    }
}

class DAOAbstractFactoryProducer{
    public static DAOAbstractFactory produce(String type){
        DAOAbstractFactory obj=null;
        if(type.equals("xml")){
            obj=new XMLFactory();
        }
        else if(type.equals("db")){
            obj=new DBFactory();
        }
        return obj;
    }
}

public class AbstractFactory{
    public static void main(String[] args) {
        DAOAbstractFactory absfactory=DAOAbstractFactoryProducer.produce("xml");
        DAO dao = absfactory.createDAO("emp");
        dao.save();
    }
}