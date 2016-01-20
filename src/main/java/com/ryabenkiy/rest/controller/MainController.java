package com.ryabenkiy.rest.controller;

import com.ryabenkiy.rest.domain.MyDataObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@Controller
@RequestMapping(value = "/myservice")
public class MainController {

    @RequestMapping(value= "/{time}", method = RequestMethod.GET)
    @ResponseBody
    public MyDataObject getMyData(@PathVariable long time) {
        return new MyDataObject(Calendar.getInstance(), "Это ответ метода GET!");
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public MyDataObject putMyData(@RequestBody MyDataObject md) {
        return md;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public MyDataObject postMyData() {
        return new MyDataObject(Calendar.getInstance(), "Это ответ метода POST!");
    }

    @RequestMapping(value= "/{time}", method = RequestMethod.DELETE)
    @ResponseBody
    public MyDataObject deleteMyData(@PathVariable long time) {
        return new MyDataObject(Calendar.getInstance(), "Это ответ метода DELETE!");
    }
}
