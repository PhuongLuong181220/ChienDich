package com.idb.aaa.Utils;

import java.util.Arrays;
import java.util.List;

public class KhachHangAll {
    public static List<String> splitId(String strListIds) {
        String all = strListIds;

        String[] ids = all.split(";");

        List<String> finalIds = Arrays.asList(ids);

        return finalIds;
    }
}
