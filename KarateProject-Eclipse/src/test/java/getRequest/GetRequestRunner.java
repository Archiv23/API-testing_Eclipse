package getRequest;

import com.intuit.karate.junit5.Karate;

class GetRequestRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("getRequest").relativeTo(getClass());
    }    

}
