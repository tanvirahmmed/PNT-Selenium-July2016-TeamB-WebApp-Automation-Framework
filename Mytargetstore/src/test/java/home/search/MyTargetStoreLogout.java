package home.search;

import CommonMethods.CommonMyTargetMethods;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetStoreLogout extends CommonMyTargetMethods {


    @org.testng.annotations.Test
    public void myTargetStoreLogOut() throws Exception {
        MemberLogin();
        MemberLogOut();

    }
}
