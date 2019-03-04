package p1.akademiakodu.Bmicalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class CalculatorController {

    DecimalFormat df = new DecimalFormat(".##");
    private Calculator calculator = new Calculator();

    @GetMapping("/calculator.html")
    public String getcalculator() {
        return "calculator.html";
    }

    @GetMapping("/body")
    public String getbody(@RequestParam double height,
                          @RequestParam double weight,
                          ModelMap modelMap,
                          DecimalFormat df) {

        double bmi = calculator.calculator(weight, height);
        String health = calculator.stateofhealth(bmi);

        modelMap.put("Wzrost", height);
        modelMap.put("Waga", weight);
        modelMap.put("bmi", df.format(bmi));
        modelMap.put("info", health);

        return "body";
    }
}
