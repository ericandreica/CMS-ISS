package view.controllers;

/**
 * Created by Paul on 5/7/17.
 */
public class TestController extends BaseController {

    public void start() {
        showDialog(getData().get("info").toString(), "Checheraut alea alea");
    }

}
