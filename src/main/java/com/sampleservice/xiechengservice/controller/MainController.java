package com.sampleservice.xiechengservice.controller;

import com.sampleservice.xiechengservice.utils.MBaseUtils;
import com.septemberhx.common.base.MResponse;
import com.septemberhx.mclient.annotation.MApiFunction;
import com.septemberhx.mclient.annotation.MRestApiType;
import com.septemberhx.mclient.base.MObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/11/25
 */
@RestController
public class MainController extends MObject {
    @ResponseBody
    @RequestMapping(value = "/hotel", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse hotelFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/hotel");

        if (requestData.get("interval") != null) {
            MBaseUtils.generateStringInKBSize(500, result, (long) requestData.get("interval"));
        }
        return result;
    }
}
