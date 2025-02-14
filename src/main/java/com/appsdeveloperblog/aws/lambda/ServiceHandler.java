package com.appsdeveloperblog.aws.lambda;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ServiceHandler implements RequestHandler<String, Object> {

    @Override
    public Object handleRequest(String s, Context context) {
        context.getLogger().log("Input: " + s);
        return "Lambda Function is invoked1...." + s;
    }
}
