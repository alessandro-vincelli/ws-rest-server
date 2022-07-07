package eu.afea.training.rest;

import java.util.HashMap;
import java.util.Map;

public class UserController {

  private static final Map<Integer, User> users;
  static {
    Map<Integer, User> listOfUser = new HashMap<Integer, User>();
    listOfUser.put(1, new User(1, "Dante", "Cruciani"));
    listOfUser.put(2, new User(2, "Giuseppe", "Baiocchi"));
    listOfUser.put(3, new User(3, "Carmelina", "Carmelina"));
    listOfUser.put(4, new User(4, "Mario", "Angeletti"));
    users = listOfUser;
  }

}
