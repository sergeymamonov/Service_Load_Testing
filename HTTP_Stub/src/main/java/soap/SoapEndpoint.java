package soap;

import com.mycompany.soapstub.CashOperationRs;
import com.mycompany.soapstub.ProcessCashResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
        import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
        import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class SoapEndpoint {
    private static final String NAMESPACE_URI = "http://soapstub.mycompany.com/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "processCash")
    @ResponsePayload
    public ProcessCashResponse processCash() {
        ProcessCashResponse answer = new ProcessCashResponse();
        CashOperationRs response = new CashOperationRs();
        response.setDescription("success");
        response.setStatuscode(1);
        answer.setReturn(response);
        return answer;
    }
}