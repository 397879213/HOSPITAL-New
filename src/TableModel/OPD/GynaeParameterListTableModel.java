/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel.OPD;
import BO.OPD.GynaeParameter;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class GynaeParameterListTableModel extends AbstractTableModel {

    private final String[] columnNames
                = {"Final Date","Final By","LMP","EDD", "Fetus","Lie", "Presentation","FCA","Liquor"};
//                    , "AFI","B.D","F.L","PLA","CRL","G.S","H.C","AC","N.T", "GRA",
//                    "COR ", "CER"};
    private final Object[][] data;

    public GynaeParameterListTableModel(List<GynaeParameter> listParameter) {
        data = new Object[listParameter.size()][columnNames.length];
        int row = 0;

        for (int i = 0; i < listParameter.size(); i++) {
           
            GynaeParameter objParameter = listParameter.get(i);
            
            data[row][0] = objParameter.getFianlDate();
            data[row][1] = objParameter.getFianlUser();
            data[row][2] = objParameter.getLmp();
            data[row][3] = objParameter.getEdd();
            data[row][4] = objParameter.getFetus();
            data[row][5] = objParameter.getLie();
            data[row][6] = objParameter.getPresentation();
            data[row][7] = objParameter.getFca();
            data[row][8] = objParameter.getLiquor();
//            data[row][10] = objParameter.getAmnioticFluidVolume();
//            data[row][9] = objParameter.getBiparietalDiameter();
//            data[row][10] = objParameter.getFemurLength();
//            data[row][11] = objParameter.getPlacenta();
//            data[row][12] = objParameter.getCrl();
//            data[row][13] = objParameter.getGestationSac();
//            data[row][14] = objParameter.getHeadCircumference();
//            data[row][15] = objParameter.getAc();
//            data[row][16] = objParameter.getNuchalTranslucency();
//            data[row][17] = objParameter.getGrade();
//            data[row][18] = objParameter.getCord();
//            data[row][19] = objParameter.getCervix();
            row++;
        }
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
