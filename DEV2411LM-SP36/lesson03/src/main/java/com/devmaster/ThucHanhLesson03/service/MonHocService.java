package com.devmaster.ThucHanhLesson03.service;

import com.devmaster.ThucHanhLesson03.entity.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MonHocService {
    List<MonHoc> monHocList = new ArrayList<MonHoc>();
    public MonHocService() {
        monHocList.addAll(
                Arrays.asList(
                        new MonHoc(1L,"Toán",4),
                        new MonHoc(2L,"Văn",4),
                        new MonHoc(3L,"Anh",4),
                        new MonHoc(4L,"English",4),
                        new MonHoc(5L,"Vật Lý",4)
                )
        );
    }

    // lấy toàn bộ danh sách
    public List<MonHoc> getMonHocList() {
        return monHocList;
    }

    // lấy danh sách theo id
    public MonHoc getMonHocById(Long mamh) {
        return monHocList.stream()
                .filter(monHoc -> monHoc.getMamh()
                .equals(mamh))
                .findFirst()
                .orElse(null);
    }

    // thêm mới môn học

    public MonHoc addMonHoc(MonHoc monHoc) {
        monHocList.add(monHoc);
        return monHoc;
    }

    // sửa theo mã môn học

    public MonHoc updateMonHoc(Long mamh,MonHoc monHoc) {
        MonHoc check = getMonHocById(mamh);
        if(check != null) {
            return null;
        }
        monHocList.forEach( item
                -> {
                    if(monHoc.getMamh() == item.getMamh()) {
                        item.setMamh(monHoc.getMamh());
                        item.setMamh(monHoc.getMamh());
                        item.setMamh(monHoc.getMamh());
                    }

                }
        );
        return monHoc;
    }

    // xóa theo id

    public boolean deleteMonHoc(Long mamh) {
        MonHoc check = getMonHocById(mamh);
        return monHocList.remove(check);
    }

}
