package sb.batchlet;

import javax.batch.api.Batchlet;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.jboss.logging.Logger;

@Dependent
@Named("SimpleBatchlet")
public class SimpleBatchlet implements Batchlet {
    private static final Logger LOGGER = Logger.getLogger(SimpleBatchlet.class);

    @Override
    public String process() throws Exception {
        LOGGER.info("[SimpleBatchlet] process()");
        return "SUCCESS";
    }

    @Override
    public void stop() throws Exception {
        LOGGER.info("[SimpleBatchlet] stop()");
    } 
}
