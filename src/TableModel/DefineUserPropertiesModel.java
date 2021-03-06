package TableModel;

import BO.SetupColumnDetail;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DefineUserPropertiesModel extends AbstractTableModel {

    private final String[] columnNames = {"Sr.No", "Id", "Property", "Value"};
    private final Object[][] data;

    public DefineUserPropertiesModel(List<SetupColumnDetail> clients) {

        data = new Object[clients.size()][columnNames.length];
        for (int i = 0; i < clients.size(); i++) {
            data[i][0] = "" + (i + 1);
            data[i][1] = clients.get(i).getId();
            data[i][2] = clients.get(i).getProperty();
            data[i][3] = clients.get(i).getDefaultValue();
        }
    }

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

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    @Override
    public boolean isCellEditable(int row, int col) {
       if(col == 3){
           return true;
       }
        return false;
    }

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
