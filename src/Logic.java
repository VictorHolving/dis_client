/**
 * Created by Victor on 29/10/15.
 */

package sdk;

import com.google.gson.Gson;

public class Logic {
    static ServerConnection serverConnection = new ServerConnection();

    public static void login(String username, String password){

        User user = new User();
        user.setPassword(password);
        user.setUsername(username);

        String json = new Gson().toJson(user);

        serverConnection.post(json, "login/");

    }
    }

}
