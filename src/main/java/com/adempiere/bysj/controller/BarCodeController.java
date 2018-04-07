package com.adempiere.bysj.controller;

import com.adempiere.bysj.tools.BarcodeUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * Created by wm on 2018/4/7.
 */
@RestController
@RequestMapping(value = "/barcode")
public class BarCodeController {
    private static final Logger logger = LoggerFactory.getLogger(BarCodeController.class);

    @RequestMapping(value = "/query")
    public String query(@RequestParam String id) {
        String path = "barcodepics";
        File file = BarcodeUtil.generateFile(id, path);
        return file.getPath();
    }

}
