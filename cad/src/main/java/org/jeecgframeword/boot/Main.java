//package org.jeecgframeword.boot;
//
//import com.aspose.cad.Image;
//import com.aspose.cad.fileformats.cad.CadImage;
//import com.aspose.cad.fileformats.cad.cadobjects.*;
//import com.onespatial.dwglib.Header;
//import com.onespatial.dwglib.Reader;
//import com.onespatial.dwglib.objects.*;
//import lombok.SneakyThrows;
//import org.locationtech.proj4j.*;
//
//import java.io.File;
//import java.util.List;
//
//public class Main {
//
//    private static final String FILE_NAME_1="D:\\桌面\\Zkxt\\化工七路管线加地形图.dwg";
//
//    private static final String FILE_NAME_2="D:\\桌面\\Zkxt\\化工区总体（含物流园项目总平面合并）--4.23pm.dwg";
//    private static final String FILE_NAME_3="D:\\桌面\\Zkxt\\北湖工业站（可研方案一：北湖工业站合场方案）-整理出图--道路修改.dwg";
//    private static final String FILE_NAME_4="D:\\桌面\\Zkxt\\固体码头综合楼总平面布置图8.31_t3(1).dwg";
//    private static final String FILE_NAME_5="D:\\桌面\\Zkxt\\固体码头平面布置图.dwg";
//
//
//    @SneakyThrows
//    public static void main(String[] args) {
//        // 加载 DWG 文件
//        CadImage cadImage = (CadImage) Image.load(FILE_NAME_2);
//        System.out.println(cadImage.getMaxPoint().getX() + " " + cadImage.getMaxPoint().getY() + "," + cadImage.getMinPoint());
//        location(cadImage.getMaxPoint().getX(),cadImage.getMaxPoint().getY());
//        // 遍历所有 CAD 实体
//        for (CadEntityBase entity : cadImage.getEntities()) {
//            // 检查实体类型并提取坐标信息
//            if (entity instanceof CadLine) {
//                CadLine cadLine = (CadLine) entity;
//                System.out.println("Line: Start(" + cadLine.getFirstPoint().getX() + ", " + cadLine.getFirstPoint().getY() + "," + cadLine.getFirstPoint().getZ() +
//                        ")," + "Line: End(" + cadLine.getSecondPoint().getX() + "," + cadLine.getSecondPoint().getY() + "," + cadLine.getSecondPoint().getZ() + ")");
//
//                location(cadLine.getFirstPoint().getX(),cadLine.getFirstPoint().getY());
//            }
////            } else if (entity instanceof CadCircle) {
////                CadCircle cadCircle = (CadCircle) entity;
////                System.out.println("Circle: Center(" + cadCircle.getCenterPoint().getX() + ", " +
////                        cadCircle.getCenterPoint().getY() + "), Radius(" + cadCircle.getRadius() + ")");
////            } else if (entity instanceof CadText) {
////                CadText cadText = (CadText) entity;
//////                System.out.println(cadText.toString());
////            }
//
//
//            // 可以添加其他实体类型的解析逻辑
//        }
//
//    }
//    private static void location(double x, double y){
//
//
//        // 定义 UTM 和 WGS84 坐标系统
//        CRSFactory crsFactory = new CRSFactory();
//        CoordinateReferenceSystem utmCRS = crsFactory.createFromName("EPSG:3857"); // EPSG:32633 表示 WGS 84 / UTM zone 33N
//        CoordinateReferenceSystem wgs84CRS = crsFactory.createFromName("EPSG:4326"); // EPSG:4326 表示 WGS 84
//
//        // 创建转换对象
//        CoordinateTransformFactory ctFactory = new CoordinateTransformFactory();
//        CoordinateTransform transform = ctFactory.createTransform(utmCRS, wgs84CRS);
//
//        // 执行转换
//        ProjCoordinate utmCoord = new ProjCoordinate(x, y);
//        ProjCoordinate latLonCoord = new ProjCoordinate();
//        transform.transform(utmCoord, latLonCoord);
//
//        // 输出经纬度坐标
//        System.out.println("Longitude: " + latLonCoord.x + ", Latitude: " + latLonCoord.y);
//    }
//
//
//
//
//}