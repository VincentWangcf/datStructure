package com.vincent.datStructure.dickpackage;

import static java.io.File.separator;

public enum DictEnum {
    RED, GREEN, BLUE;
     static String changeLabel(String type,String code) {
        if(code.indexOf(",") > -1) {
            String[] strs = code.split(",");
            if (strs.length > 1) {
                StringBuilder sb = new StringBuilder();
                for (String str : strs) {
                    // 从缓存中获取字典。如果不行，通过SpringUtil.getBean(); 获取服务处理
//                    sb.append(DictDataCache.getLabel(type, str)).append(separator);
                }
                return sb.substring(0, sb.length() - 1);
            }
        }
        // 从缓存中获取字典。如果不行，通过SpringUtil.getBean(); 获取服务处理
//        return DictDataCache.get(type, code);
        return null;
    }

}
