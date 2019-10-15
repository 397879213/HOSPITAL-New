/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel.OPD;
import TableModel.Management.*;
import BO.Management.formAttachBO;
import BO.OPD.PatientHospitalVisit;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class BirthCertificateTableModel extends AbstractTableModel {

    private final String[] columnNames
            = {"Sr.","Baby Name","DOB","Weight","Father Name"};
    private final Object[][] data;

    public BirthCertificateTableModel(List<PatientHospitalVisit> listBirthCertificate) {
        data = new Object[listBirthCertificate.size()][columnNames.length];
        int row = 0;

        for (int i = 0; i < listBirthCertificate.size(); i++) {
           
            PatientHospitalVisit birthCertificate = listBirthCertificate.get(i);
            
            data[row][0] = i+1;
//            data[row][1] = birthCertificate.getBabyName();
            data[row][2] = birthCertificate.getDob();
//            data[row][3] = birthCertificate.getBirthWeight();
//            data[row][4] = birthCertificate.getFatherName();
            row++;
        }
//            if(currentInfo.getQuestionResult().equalsIgnoreCase("Y")){
//                data[row][2] = true;
//            }
//            else if(currentInfo.getQuestionResult().equalsIgnoreCase("N")){
//                data[row][3] = true;
//            }
    
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {

        return data[row][col];
    }

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */
//    @Override
//    public Class getColumnClass(int c) {
//        return getValueAt(0, c).getClass();
//    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        if (col == 2 || col == 3) {
            return true;
        }
        return false;
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    
    private final boolean DEBUG = false;

    @Override
    public void setValueAt(Object value, int row, int col) {
        if (DEBUG) {
            System.out.println("Setting value at " + row + "," + col
                    + " to " + value
                    + " (an instance of "
                    + value.getClass() + ")");
        }

        data[row][col] = value;
        fireTableCellUpdated(row, col);

        if (DEBUG) {
            System.out.println("New value of data:");
            printDebugData();
        }
    }

    private void printDebugData() {
        int numRows = getRowCount();
        int numCols = getColumnCount();

        for (int i = 0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j = 0; j < numCols; j++) {
                System.out.print("  " + data[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

}
