
package util;
public class RecommendationEngine {
    public static String recommend(String interest){
        if(interest.equalsIgnoreCase("history"))
            return "Historical Places";
        if(interest.equalsIgnoreCase("nature"))
            return "Nature Parks";
        return "Popular Destinations";
    }
}
