/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel.Inventory;

import BO.Inventory.CondemItems;
import Inventory.BO.PathCptWiseTubes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sibtain
 */
public class PathCptWiseTubesTableModel extends AbstractTableModel {

    private final String[] columnNames
            = {"CPT_NAME", "SECTION_NAME", "YELLOW_TOP",
                "PURPLE_TOP", "BLUE_TOP", "RED_TOP", "GRAY_TOP", "GREEN_TOP",
                "URINE_CONTAINER", "STOOL_CONTAINER", "DROPER", "TRANSPORT_SWAB",
                "EPIN_DROP_CUP", "BLOOD_CS_ADULT", "BLOOD_CS_PEADS",
                "NON_MEDICATED_URINE_CONTAINER", "SYRINGE", "AIR_SAMPLING",
                "CONTAINER_WITH_BORRIC_ACID", "SLIDE", "PETRIDISH",
                "BLOOD_BANK_COMPONENT", "SWAB", "BLOCKS", "STRILE_CONTAINER",
                "URINE_CONTAINER_24_HRS", "BLACK_TOP", "Save"};

    private Object[][] data;

    public PathCptWiseTubesTableModel(List<PathCptWiseTubes> li) {
        data = new Object[li.size()][columnNames.length];
        for (int i = 0; i < li.size(); i++) {
            PathCptWiseTubes pct = li.get(i);
            data[i][0] = pct.getCptDescription();
            data[i][1] = pct.getSectionDescription();
            data[i][2] = pct.getYellowTop();
            data[i][3] = pct.getPurpleTop();
            data[i][4] = pct.getBlueTop();
            data[i][5] = pct.getRedTop();
            data[i][6] = pct.getGrayTop();
            data[i][7] = pct.getGreenTop();
            data[i][8] = pct.getUrineContainer();
            data[i][9] = pct.getStoolContainer();
            data[i][10] = pct.getDroper();
            data[i][11] = pct.getTransportSwab();
            data[i][12] = pct.getEpinDropCup();
            data[i][13] = pct.getBloodCsAdult();
            data[i][14] = pct.getBloodCsPeads();
            data[i][15] = pct.getNonMedicatedUrineContainer();
            data[i][16] = pct.getSyringe();
            data[i][17] = pct.getAirSampling();
            data[i][18] = pct.getContainerWithBorricAcid();
            data[i][19] = pct.getSlide();
            data[i][20] = pct.getPetridish();
            data[i][21] = pct.getBloodBankComponent();
            data[i][22] = pct.getSwab();
            data[i][23] = pct.getBlocks();
            data[i][24] = pct.getStrileContainer();
            data[i][25] = pct.getUrineContainer24Hrs();
            data[i][26] = pct.getBlackTop();
            data[i][27] = "Save";

        }
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col == 0 || col == 1 || col == 27) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    private boolean DEBUG = false;

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
