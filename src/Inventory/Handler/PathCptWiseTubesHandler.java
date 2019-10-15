/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Handler;

import Inventory.BO.PathCptWiseTubes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class PathCptWiseTubesHandler {

    public List<PathCptWiseTubes> selectPathCptWiseTubes(String cptId,
            String sectionId) {

        String[] selectColumns = {"-", "CPT_ID", "CPT_NAME", "SECTION_ID",
            "YELLOW_TOP", "PURPLE_TOP", "BLUE_TOP",
            "RED_TOP", "GRAY_TOP", "GREEN_TOP", "URINE_CONTAINER",
            "STOOL_CONTAINER", "DROPER", "TRANSPORT_SWAB", "EPIN_DROP_CUP",
            "BLOOD_CS_ADULT", "BLOOD_CS_PEADS", "NON_MEDICATED_URINE_CONTAINER",
            "SYRINGE", "AIR_SAMPLING", "CONTAINER_WITH_BORRIC_ACID", "SLIDE",
            "PETRIDISH", "BLOOD_BANK_COMPONENT", "SWAB", "BLOCKS", "STRILE_CONTAINER",
            "URINE_CONTAINER_24_HRS", "BLACK_TOP"};

        String query
                = "SELECT PCT.CPT_ID,\n"
                + "       CPT.DESCRIPTION CPT_NAME,\n"
                + "       PCT.SECTION_ID,\n"
                + "       PCT.YELLOW_TOP,\n"
                + "       PCT.PURPLE_TOP,\n"
                + "       PCT.BLUE_TOP,\n"
                + "       PCT.RED_TOP,\n"
                + "       PCT.GRAY_TOP,\n"
                + "       PCT.GREEN_TOP,\n"
                + "       PCT.URINE_CONTAINER,\n"
                + "       PCT.STOOL_CONTAINER,\n"
                + "       PCT.DROPER,\n"
                + "       PCT.TRANSPORT_SWAB,\n"
                + "       PCT.EPIN_DROP_CUP,\n"
                + "       PCT.BLOOD_CS_ADULT,\n"
                + "       PCT.BLOOD_CS_PEADS,\n"
                + "       PCT.NON_MEDICATED_URINE_CONTAINER,\n"
                + "       PCT.SYRINGE,\n"
                + "       PCT.AIR_SAMPLING,\n"
                + "       PCT.CONTAINER_WITH_BORRIC_ACID,\n"
                + "       PCT.SLIDE,\n"
                + "       PCT.PETRIDISH,\n"
                + "       PCT.BLOOD_BANK_COMPONENT,\n"
                + "       PCT.SWAB,\n"
                + "       PCT.BLOCKS,\n"
                + "       PCT.STRILE_CONTAINER,\n"
                + "       PCT.URINE_CONTAINER_24_HRS,\n"
                + "       PCT.BLACK_TOP\n"
                + "  FROM "
                + Database.Inventory.pathCptWiseTubes + " PCT,        \n"
                + Database.DCMS.CPT + " CPT                           \n"
                + " WHERE CPT.CPT_ID = '" + cptId + "'               \n"
                + " AND PCT.CPT_ID = CPT.CPT_ID                        \n"
                + " ORDER BY PCT.CPT_ID                           \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<PathCptWiseTubes> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            PathCptWiseTubes setCptTubes = new PathCptWiseTubes();

            setCptTubes.setCptId(map.get("CPT_ID").toString());
            setCptTubes.setCptDescription(map.get("CPT_NAME").toString());
            setCptTubes.setSectionId(map.get("SECTION_ID").toString());
//            setCptTubes.setSectionDescription(map.get("SECTION_NAME").toString());
            setCptTubes.setYellowTop(map.get("YELLOW_TOP").toString());
            setCptTubes.setPurpleTop(map.get("PURPLE_TOP").toString());
            setCptTubes.setBlueTop(map.get("BLUE_TOP").toString());
            setCptTubes.setRedTop(map.get("RED_TOP").toString());
            setCptTubes.setGrayTop(map.get("GRAY_TOP").toString());
            setCptTubes.setGreenTop(map.get("GREEN_TOP").toString());
            setCptTubes.setStoolContainer(map.get("STOOL_CONTAINER").toString());
            setCptTubes.setUrineContainer(map.get("URINE_CONTAINER").toString());
            setCptTubes.setDroper(map.get("DROPER").toString());
            setCptTubes.setTransportSwab(map.get("TRANSPORT_SWAB").toString());
            setCptTubes.setEpinDropCup(map.get("EPIN_DROP_CUP").toString());
            setCptTubes.setBloodCsAdult(map.get("BLOOD_CS_ADULT").toString());
            setCptTubes.setBloodCsPeads(map.get("BLOOD_CS_PEADS").toString());
            setCptTubes.setNonMedicatedUrineContainer(map.get("NON_MEDICATED_URINE_CONTAINER").toString());
            setCptTubes.setSyringe(map.get("SYRINGE").toString());
            setCptTubes.setAirSampling(map.get("AIR_SAMPLING").toString());
            setCptTubes.setContainerWithBorricAcid(map.get("CONTAINER_WITH_BORRIC_ACID").toString());
            setCptTubes.setSlide(map.get("SLIDE").toString());
            setCptTubes.setPetridish(map.get("PETRIDISH").toString());
            setCptTubes.setBloodBankComponent(map.get("BLOOD_BANK_COMPONENT").toString());
            setCptTubes.setSwab(map.get("SWAB").toString());
            setCptTubes.setBlocks(map.get("BLOCKS").toString());
            setCptTubes.setStrileContainer(map.get("STRILE_CONTAINER").toString());
            setCptTubes.setUrineContainer24Hrs(map.get("URINE_CONTAINER_24_HRS").toString());
            setCptTubes.setBlackTop(map.get("BLACK_TOP").toString());
            list.add(setCptTubes);
        }
        return list;
    }

    public boolean UpdatePathCptWiseTubes(PathCptWiseTubes objSave) {

        String query
                = " UPDATE " + Database.Inventory.pathCptWiseTubes + " PCT SET  \n"
                + " PCT.YELLOW_TOP= '" + objSave.getYellowTop().trim() + "',    \n"
                + " PCT.PURPLE_TOP= '" + objSave.getPurpleTop().trim() + "',    \n"
                + " PCT.BLUE_TOP= '" + objSave.getBlueTop().trim() + "',        \n"
                + " PCT.RED_TOP= '" + objSave.getRedTop().trim() + "',          \n"
                + " PCT.GRAY_TOP= '" + objSave.getGrayTop().trim() + "',        \n"
                + " PCT.GREEN_TOP= '" + objSave.getGreenTop().trim() + "',      \n"
                + " PCT.URINE_CONTAINER= '" + objSave.getUrineContainer().trim() + "',\n"
                + " PCT.STOOL_CONTAINER= '" + objSave.getStoolContainer().trim() + "',\n"
                + " PCT.DROPER= '" + objSave.getDroper().trim() + "',           \n"
                + " PCT.TRANSPORT_SWAB= '" + objSave.getTransportSwab().trim() + "',\n"
                + " PCT.EPIN_DROP_CUP= '" + objSave.getEpinDropCup().trim() + "',\n"
                + " PCT.BLOOD_CS_ADULT= '" + objSave.getBloodCsAdult().trim() + "',\n"
                + " PCT.BLOOD_CS_PEADS= '" + objSave.getBloodCsPeads().trim() + "',\n"
                + " PCT.NON_MEDICATED_URINE_CONTAINER= '" + objSave.getNonMedicatedUrineContainer().trim() + "',\n"
                + " PCT.SYRINGE= '" + objSave.getSyringe().trim() + "',         \n"
                + " PCT.AIR_SAMPLING= '" + objSave.getAirSampling().trim() + "',\n"
                + " PCT.CONTAINER_WITH_BORRIC_ACID= '" + objSave.getContainerWithBorricAcid().trim() + "',\n"
                + " PCT.SLIDE= '" + objSave.getSlide().trim() + "',             \n"
                + " PCT.PETRIDISH= '" + objSave.getPetridish().trim() + "',     \n"
                + " PCT.BLOOD_BANK_COMPONENT= '" + objSave.getBloodBankComponent().trim() + "',\n"
                + " PCT.SWAB= '" + objSave.getSwab().trim() + "',               \n"
                + " PCT.BLOCKS= '" + objSave.getBlocks().trim() + "',           \n"
                + " PCT.STRILE_CONTAINER= '" + objSave.getStrileContainer().trim() + "',\n"
                + " PCT.URINE_CONTAINER_24_HRS= '" + objSave.getUrineContainer24Hrs().trim() + "',\n"
                + " PCT.BLACK_TOP= '" + objSave.getBlackTop().trim() + "'       \n"
                + " WHERE PCT.CPT_ID = '" + objSave.getCptId() + "'             \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean insertPathCptWiseTubesHistory(PathCptWiseTubes objSave) {
        String[] columns = {Database.Inventory.pathCptWiseTubesHis,
            "CPT_ID", "DESCRIPTION", "SECTION_ID", "YELLOW_TOP", "PURPLE_TOP", 
            "BLUE_TOP", "RED_TOP", "GRAY_TOP", "GREEN_TOP", "URINE_CONTAINER",
            "STOOL_CONTAINER", "DROPER", "TRANSPORT_SWAB", "EPIN_DROP_CUP",
            "BLOOD_CS_ADULT", "BLOOD_CS_PEADS", "NON_MEDICATED_URINE_CONTAINER",
            "SYRINGE", "AIR_SAMPLING", "CONTAINER_WITH_BORRIC_ACID", "SLIDE",
            "PETRIDISH", "BLOOD_BANK_COMPONENT", "SWAB", "BLOCKS", "STRILE_CONTAINER",
            "URINE_CONTAINER_24_HRS", "BLACK_TOP", "UPTD_BY", "UPTD_DATE"};
        
        System.out.println("chkkk"+objSave.getCptId()+" " +objSave.getPurpleTop() +" " + objSave.getRedTop());
        HashMap mapPathTubes = new HashMap();
        List<HashMap> vec = new ArrayList();
        mapPathTubes.put("PCT.CPT_ID ", "'" + objSave.getCptId() + "'");
        mapPathTubes.put("PCT.DESCRIPTION ", "'" + objSave.getCptDescription()+ "'");
        mapPathTubes.put("PCT.SECTION_ID ", "'" + objSave.getSectionId()+ "'");
        mapPathTubes.put("PCT.YELLOW_TOP", "'" + objSave.getYellowTop() + "'");
        mapPathTubes.put("PCT.PURPLE_TOP", "'" + objSave.getPurpleTop() + "'");
        mapPathTubes.put("PCT.BLUE_TOP", "'" + objSave.getBlueTop() + "'");
        mapPathTubes.put("PCT.RED_TOP", "'" + objSave.getRedTop() + "'");
        mapPathTubes.put("PCT.GRAY_TOP", "'" + objSave.getGrayTop() + "'");
        mapPathTubes.put("PCT.GREEN_TOP", "'" + objSave.getGreenTop() + "'");
        mapPathTubes.put("PCT.URINE_CONTAINER", "'" + objSave.getUrineContainer() + "'");
        mapPathTubes.put("PCT.STOOL_CONTAINER", "'" + objSave.getStoolContainer() + "'");
        mapPathTubes.put("PCT.DROPER", "'" + objSave.getDroper() + "'");
        mapPathTubes.put("PCT.TRANSPORT_SWAB", "'" + objSave.getTransportSwab() + "'");
        mapPathTubes.put("PCT.EPIN_DROP_CUP", "'" + objSave.getEpinDropCup() + "'");
        mapPathTubes.put("PCT.BLOOD_CS_ADULT", "'" + objSave.getBloodCsAdult() + "'");
        mapPathTubes.put("PCT.BLOOD_CS_PEADS", "'" + objSave.getBloodCsPeads() + "'");
        mapPathTubes.put("PCT.NON_MEDICATED_URINE_CONTAINER", "'" + objSave.getNonMedicatedUrineContainer() + "'");
        mapPathTubes.put("PCT.SYRINGE", "'" + objSave.getSyringe() + "'");
        mapPathTubes.put("PCT.AIR_SAMPLING", "'" + objSave.getAirSampling() + "'");
        mapPathTubes.put("PCT.CONTAINER_WITH_BORRIC_ACID", "'" + objSave.getContainerWithBorricAcid() + "'");
        mapPathTubes.put("PCT.SLIDE", "'" + objSave.getSlide() + "'");
        mapPathTubes.put("PCT.PETRIDISH", "'" + objSave.getPetridish() + "'");
        mapPathTubes.put("PCT.BLOOD_BANK_COMPONENT", "'" + objSave.getBloodBankComponent() + "'");
        mapPathTubes.put("PCT.SWAB", "'" + objSave.getSwab() + "'");
        mapPathTubes.put("PCT.BLOCKS", "'" + objSave.getBlocks() + "'");
        mapPathTubes.put("PCT.STRILE_CONTAINER", "'" + objSave.getStrileContainer() + "'");
        mapPathTubes.put("PCT.URINE_CONTAINER_24_HRS", "'" + objSave.getUrineContainer24Hrs() + "'");
        mapPathTubes.put("PCT.BLACK_TOP", "'" + objSave.getBlackTop() + "'");
        mapPathTubes.put("PCT.UPTD_BY", "'" + Constants.userId + "'");
        mapPathTubes.put("PCT.UPTD_DATE", "SYSDATE");
        
        vec.add(mapPathTubes);
        return Constants.dao.insertData(vec, columns);
    }
}
