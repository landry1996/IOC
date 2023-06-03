package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImplVCapteur implements IDao {
    @Override
    public double getData() {
        System.out.println(" version Capteur ");
        double data = 77;
        return data;
    }
}
