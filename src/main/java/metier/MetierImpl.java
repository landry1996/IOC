package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{




    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

   private IDao dao;
    @Override
    public double calcul() {
        double d=dao.getData();
        double res=d*11.4;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
