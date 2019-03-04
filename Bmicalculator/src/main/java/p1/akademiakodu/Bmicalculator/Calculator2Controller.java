package p1.akademiakodu.Bmicalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator2Controller {
    private Calculator2 calculator2 = new Calculator2();

    @GetMapping("/calculator2.html")
    public String getcalculator2() {
        return "calculator2.html";
    }

    @GetMapping("/body2")
    public String getbody(@RequestParam double height,
                          @RequestParam double weight,
                          @RequestParam double age,
                          @RequestParam String sex,
                          ModelMap modelMap) {

        double daily = calculator2.daily(sex, weight, height, age);

        modelMap.put("Height", height);
        modelMap.put("Weight", weight);
        modelMap.put("Age", age);
        modelMap.put("Sex", sex);
        modelMap.put("DailyCaloricDemand", daily);
        return "body2";
    }

}
