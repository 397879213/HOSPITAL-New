/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;

import BO.Administration.ARCFitnessBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class ARCFitnessHandler {

    public List<ARCFitnessBO> selectARCFitness(String con, String odi) {

        String columns[] = {"-", "CON", "ODI", "CIGARETTES_PER_DAY",
            "CIGARETTES_SINCE_YEAR", "DISABILITY_STATUS", "PRESENT_MED_CATEGORY",
            "PERM_TEMP_CATEGORY", "HEIGHT", "WEIGHT", "BMI", "PULSE", "SYSTOLIC",
            "DIASTOLIC", "SYSTEMIC_EXAM", "UNDER_OVER_WEIGHT", "BLOOD_SUGAR_F",
            "URINE_RE", "SERUM_CHOLESTROL_F", "SERUM_CREATININE", "BLOOD_CP", "ECG",
            "SERUM_ALT", "ETT_EX_TIME", "CONCLUSION", "MEDICAL_CATEGORY",
            "INSTRUCTIONS", "CRTD_DATE", "CRTD_BY", "CRTD_TERMINAL_ID"};

        String query
                = "SELECT AF.CON, AF.ODI,                               \n"
                + " NVL(AF.CIGARETTES_PER_DAY, 0) CIGARETTES_PER_DAY,   \n"
                + " NVL(AF.CIGARETTES_SINCE_YEAR, 0) CIGARETTES_SINCE_YEAR,\n"
                + " NVL(AF.DISABILITY_STATUS, ' ') DISABILITY_STATUS,   \n"
                + " NVL(AF.PRESENT_MED_CATEGORY, ' ') PRESENT_MED_CATEGORY,\n"
                + " NVL(AF.PERM_TEMP_CATEGORY, ' ') PERM_TEMP_CATEGORY, \n"
                + " NVL(AF.HEIGHT, ' ') HEIGHT,                         \n"
                + " NVL(AF.WEIGHT, ' ') WEIGHT,                         \n"
                + " NVL(AF.BMI, ' ') BMI,                               \n"
                + " NVL(AF.PULSE, 0) PULSE,                             \n"
                + " NVL(AF.SYSTOLIC, 0) SYSTOLIC,                       \n"
                + " NVL(AF.DIASTOLIC, 0) DIASTOLIC,                     \n"
                + " NVL(AF.SYSTEMIC_EXAM, ' ') SYSTEMIC_EXAM,           \n"
                + " NVL(AF.UNDER_OVER_WEIGHT, 0) UNDER_OVER_WEIGHT,     \n"
                + " NVL(AF.BLOOD_SUGAR_F, 0) BLOOD_SUGAR_F,             \n"
                + " NVL(AF.URINE_RE, ' ') URINE_RE,                     \n"
                + " NVL(AF.SERUM_CHOLESTROL_F, 0) SERUM_CHOLESTROL_F,   \n"
                + " NVL(AF.SERUM_CREATININE, ' ') SERUM_CREATININE,     \n"
                + " NVL(AF.BLOOD_CP, ' ') BLOOD_CP,                     \n"
                + " NVL(AF.ECG, ' ') ECG,                               \n"
                + " NVL(AF.SERUM_ALT, ' ') SERUM_ALT,                   \n"
                + " NVL(AF.ETT_EX_TIME, ' ') ETT_EX_TIME,               \n"
                + " NVL(AF.CONCLUSION, ' ') CONCLUSION,                 \n"
                + " NVL(AF.MEDICAL_CATEGORY, ' ') MEDICAL_CATEGORY,     \n"
                + " NVL(AF.INSTRUCTIONS, ' ') INSTRUCTIONS,             \n"
                + " NVL(AF.CRTD_DATE, '') CRTD_DATE,                    \n"
                + " NVL(AF.CRTD_BY, ' ') CRTD_BY,                       \n"
                + " NVL(AF.CRTD_TERMINAL_ID, ' ') CRTD_TERMINAL_ID      \n"
                + "  FROM " + Database.DCMS.ARCArmy + " AF              \n"
                + " WHERE AF.CON = '" + con + "'                        \n"
                + " AND AF.ODI = '" + odi + "'                          \n";

        //System.out.println("query"+ query);
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<ARCFitnessBO> lisVerRep = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            ARCFitnessBO objData = new ARCFitnessBO();
            
            objData.setCon(map.get("CON").toString());
            objData.setOdi(map.get("ODI").toString());
            objData.setCigarettePerDay(map.get("CIGARETTES_PER_DAY").toString());
            objData.setCigaretteSince(map.get("CIGARETTES_SINCE_YEAR").toString());
            objData.setDisabilityStatus(map.get("DISABILITY_STATUS").toString());
            objData.setPresentMedCategory(map.get("PRESENT_MED_CATEGORY").toString());
            objData.setPerTempLowMedCategory(map.get("PERM_TEMP_CATEGORY").toString());
            objData.setHeight(map.get("HEIGHT").toString());
            objData.setWeight(map.get("WEIGHT").toString());
            objData.setBMI(map.get("BMI").toString());
            objData.setPulse(map.get("PULSE").toString());
            objData.setSystolic(map.get("SYSTOLIC").toString());
            objData.setDiastolic(map.get("DIASTOLIC").toString());
            objData.setSystemicExam(map.get("SYSTEMIC_EXAM").toString());
            objData.setUnderOverWeight(map.get("UNDER_OVER_WEIGHT").toString());
            objData.setBloodSugarF(map.get("BLOOD_SUGAR_F").toString());
            objData.setUrineRE(map.get("URINE_RE").toString());
            objData.setSerumCholestrolF(map.get("SERUM_CHOLESTROL_F").toString());
            objData.setSerumCreatinine(map.get("SERUM_CREATININE").toString());
            objData.setBloodCP(map.get("BLOOD_CP").toString());
            objData.setECG(map.get("ECG").toString());
            objData.setSerumALT(map.get("SERUM_ALT").toString());
            objData.setETTExTime(map.get("ETT_EX_TIME").toString());
            objData.setConclusion(map.get("CONCLUSION").toString());
            objData.setMedicalCategory(map.get("MEDICAL_CATEGORY").toString());
            objData.setInstructions(map.get("INSTRUCTIONS").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisVerRep.add(objData);
        }
        return lisVerRep;
    }
    
    public boolean saveARCArmyFitness(ARCFitnessBO objRv) {

        String query
                = " UPDATE " + Database.DCMS.ARCArmy + " \n"
                + " SET CIGARETTES_PER_DAY ='" + objRv.getCigarettePerDay()+ "',\n"
                + " CIGARETTES_SINCE_YEAR = '" + objRv.getCigaretteSince()+ "',\n"
                + " DISABILITY_STATUS = '" + objRv.getDisabilityStatus()+ "',\n"
                + " PRESENT_MED_CATEGORY = '" + objRv.getPresentMedCategory()+ "',\n"
                + " PERM_TEMP_CATEGORY = '" + objRv.getPerTempLowMedCategory()+ "',\n"
                + " HEIGHT = '" + objRv.getHeight()+ "' ,          \n"
                + " WEIGHT = '" + objRv.getWeight()+ "' ,          \n"
                + " BMI = '" + objRv.getBMI()+ "' ,                \n"
                + " PULSE = '" + objRv.getPulse()+ "' ,            \n"
                + " SYSTOLIC = '" + objRv.getSystolic()+ "' ,      \n"
                + " DIASTOLIC = '" + objRv.getDiastolic()+ "' ,    \n"
                + " SYSTEMIC_EXAM = '" + objRv.getSystemicExam()+ "',\n"
                + " UNDER_OVER_WEIGHT = '" + objRv.getUnderOverWeight()+ "',\n"
                + " BLOOD_SUGAR_F = '" + objRv.getBloodSugarF()+ "',\n"
                + " URINE_RE = '" + objRv.getUrineRE()+ "',         \n"
                + " SERUM_CHOLESTROL_F = '" + objRv.getSerumCholestrolF()+ "',\n"
                + " SERUM_CREATININE = '" + objRv.getSerumCreatinine()+ "',\n"
                + " BLOOD_CP = '" + objRv.getBloodCP()+ "' ,        \n"
                + " ECG = '" + objRv.getECG()+ "' ,                 \n"
                + " SERUM_ALT = '" + objRv.getSerumALT()+ "' ,      \n"
                + " ETT_EX_TIME = '" + objRv.getETTExTime()+ "' ,   \n"
                + " CONCLUSION = '" + objRv.getConclusion()+ "' ,   \n"
                + " MEDICAL_CATEGORY = '" + objRv.getMedicalCategory()+ "',\n"
                + " INSTRUCTIONS = '" + objRv.getInstructions()+ "' \n"
                + "WHERE CON = '"+objRv.getCon()+"'                \n"
                + "AND ODI = '"+ objRv.getOdi() +"'";
        
        return Constants.dao.executeUpdate(query, false);

    }

    public boolean insertARCArmyFitness(String con, String odi) {

        String query = "INSERT INTO " + Database.DCMS.ARCArmy + " (CON, ODI) "
                + " SELECT '" + con+ "', "+ odi + " FROM DUAL";
        return Constants.dao.executeUpdate(query, false);
    }
}
