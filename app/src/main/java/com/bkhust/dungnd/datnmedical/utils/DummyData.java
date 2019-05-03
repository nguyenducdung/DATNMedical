package com.bkhust.dungnd.datnmedical.utils;

import com.bkhust.dungnd.datnmedical.model.Benh;
import com.bkhust.dungnd.datnmedical.model.CTBenh;
import com.bkhust.dungnd.datnmedical.model.CTThuoc;
import com.bkhust.dungnd.datnmedical.model.Thuoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DungND on 5/3/2019.
 */
public class DummyData {
    public static List<Benh> benhList() {
        List<Benh> benhs = new ArrayList<>();
        benhs.add(new Benh(1, "Các bệnh về Ung thư"));
        benhs.add(new Benh(2, "Bệnh thường gặp ở trẻ em"));
        benhs.add(new Benh(3, "Bệnh thường gặp ở phụ nữ"));
        benhs.add(new Benh(4, "Phương pháp sơ cứu nạn nhân"));
        benhs.add(new Benh(5, "Bệnh thường gặp ở người già"));
        benhs.add(new Benh(6, "Bệnh về Mắt - Tai - Mũi - Họng"));
        benhs.add(new Benh(7, "Bệnh về Phổi - Sự hô hấp"));
        benhs.add(new Benh(8, "Bệnh về Tim mạch - Sự tuần hoàn"));
        benhs.add(new Benh(9, "Bệnh về Niệu đạo - Cơ quan sinh dục"));
        benhs.add(new Benh(10, "Bệnh về Não"));
        benhs.add(new Benh(11, "Tai nạn và Chấn thương"));
        benhs.add(new Benh(12, "Bệnh về Da - Cơ - Gân - Khớp"));
        return benhs;
    }

    public static List<CTBenh> ctBenhList() {
        List<CTBenh> ctBenhs = new ArrayList<>();
        ctBenhs.add(new CTBenh(1, "Khối U trung thất"));
        ctBenhs.add(new CTBenh(2, "Ung Thư Tuyến Giáp Trạng"));
        ctBenhs.add(new CTBenh(3, "Ung thư thanh quản"));
        ctBenhs.add(new CTBenh(4, "Ung thư tai mũi họng"));
        ctBenhs.add(new CTBenh(5, "Ung thư xương"));
        ctBenhs.add(new CTBenh(6, "Ung thư buồng trứng"));
        ctBenhs.add(new CTBenh(7, "Ung thư nội mạc tử cung"));
        ctBenhs.add(new CTBenh(8, "Ung thư bàng quang"));
        ctBenhs.add(new CTBenh(9, "Ung thư biểu mô tế bào thận"));
        ctBenhs.add(new CTBenh(10, "Huyết áp thấp – kẻ thù bào mòn sức sống phụ nữ!."));
        return ctBenhs;
    }

    public static List<Thuoc> thuocList() {
        List<Thuoc> thuocs = new ArrayList<>();
        thuocs.add(new Thuoc(1, "Thuốc cảm, sổ mũi"));
        thuocs.add(new Thuoc(2, "Thuốc chống viêm"));
        thuocs.add(new Thuoc(3, "Thuốc đau bụng"));
        thuocs.add(new Thuoc(4, "Thuốc giảm đau"));
        thuocs.add(new Thuoc(5, "Thuốc giảm đau, hạ sốt"));
        thuocs.add(new Thuoc(6, "Thuốc ho trẻ em"));
        thuocs.add(new Thuoc(7, "Thuốc nhức đầu"));
        thuocs.add(new Thuoc(8, "Thuốc sổ mũi, nghẹt mũi"));
        thuocs.add(new Thuoc(9, "Thuốc điều trị bệnh gút"));
        thuocs.add(new Thuoc(10, "Thuốc trị bong gân"));
        return thuocs;
    }

    public static List<CTThuoc> ctThuocList() {
        List<CTThuoc> ctThuocs = new ArrayList<>();
        ctThuocs.add(new CTThuoc(1, "Berocca®"));
        ctThuocs.add(new CTThuoc(1, "Supradyn®"));
        ctThuocs.add(new CTThuoc(1, "Redoxon®"));
        ctThuocs.add(new CTThuoc(1, "Laroscorbine"));
        ctThuocs.add(new CTThuoc(1, "Becozyme"));
        ctThuocs.add(new CTThuoc(1, "Cal-d-vita®"));
        ctThuocs.add(new CTThuoc(1, "Bepanthen® ointment"));
        ctThuocs.add(new CTThuoc(1, "Canesten cream"));
        ctThuocs.add(new CTThuoc(1, "Canesten - vt100 mg"));
        ctThuocs.add(new CTThuoc(1, "Alka seltzer®"));
        ctThuocs.add(new CTThuoc(1, "Ameflu® sirô ban đêm"));

        return ctThuocs;
    }
}
