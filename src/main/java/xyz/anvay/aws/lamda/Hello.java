package xyz.anvay.aws.lamda;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * Created by anvaysrivastava on 16/07/16.
 */
public class Hello {
    public Response myHandler(Context context) {
        Response response = new Response();
        response.setName("Anvay");
        return response;
    }

}
