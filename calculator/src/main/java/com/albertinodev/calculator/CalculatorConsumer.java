package com.albertinodev.calculator;

import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class CalculatorConsumer {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorConsumer.class);
    @RabbitListener(queues = "calc.queue");

    public void recievedMessage(String calculation) throws Exception {
        logger.info("Calculation: " + calculation);

        if (calculation.contains("+")) {
            Calculator calclator = new Calculator();

            JSONObject jSONObject = new JSONObject();
            jSONObject.put("results", calclator.sum(a, b));

            return jSONObject.toJSONString();
        }


        if (calculation.contains("-")) {
            Calculator calclator = new Calculator();

            JSONObject jSONObject = new JSONObject();
            jSONObject.put("results", calclator.subtract(a, b));

            return jSONObject.toJSONString();
        }


        if (calculation.contains("/")) {
            Calculator calclator = new Calculator();

            JSONObject jSONObject = new JSONObject();
            jSONObject.put("results", calclator.divide(a, b));

            return jSONObject.toJSONString();
        }


        if (calculation.contains("*")) {
            Calculator calclator = new Calculator();

            JSONObject jSONObject = new JSONObject();
            jSONObject.put("results", calclator.multiply(a, b));

            return jSONObject.toJSONString();
        }
    }

}
