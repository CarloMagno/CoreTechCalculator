import com.bea.staxb.runtime.BindingContext;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class ListenerBean {
    public ListenerBean() {
    }

    public void generateReportAndCommit(ActionEvent actionEvent) {
        FacesContext context = FacesContext.getCurrentInstance();
        System.out.println("CLICKED!");
        context.getApplication().evaluateExpressionGet(context, "#{bindings.Commit.execute}", Object.class);
        
//        BindingContainer bindings = getBindings();
//        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
//        operationBinding.execute();
        
        //BindingContainer bc = BindingContext.getCurrent().getCurrentBindingsEntry();
        //OperationBinding op = bc.getOperationBinding("Commit");
        //op.execute();
        
        /*
        try {
            HttpServletRequest request = (HttpServletRequest)context.getExternalContext().getRequest();
            HttpServletResponse response = (HttpServletResponse)context.getExternalContext().getResponse();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/ServletReport");
            dispatcher.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            context.responseComplete();
        }
        */
    }
}
