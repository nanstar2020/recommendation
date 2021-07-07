package istio.demo.recommendation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {
    private static final String RECOMMENDATION_VERSION = "RECOMMENDATION V1";
    private static final String HOSTNAME = System.getenv().getOrDefault("HOSTNAME", "unknown");
    @GetMapping(value="/recommendation")
    public String getRecommendation()  {
        return RECOMMENDATION_VERSION + " " + HOSTNAME;
    }
}
