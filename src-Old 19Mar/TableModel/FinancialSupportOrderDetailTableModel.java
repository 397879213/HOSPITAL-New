package TableModel;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import BO.OrderData;

public class FinancialSupportOrderDetailTableModel extends AbstractTableModel {

    private String[] columnNames
            = {"Sr.No", "CPT Id", "Description", "Price", "Qty", "Amount"};
    private Object[][] data;

    public FinancialSupportOrderDetailTableModel(Vector orders) {
        data = new Object[orders.size()][columnNames.length];
        int row = 0;
        for (int i = 0; i < orders.size(); i++) {
            OrderData order = (OrderData) orders.get(i);
            data[row][0] = row + 1;
            data[row][1] = order.getCptId();
            data[row][2] = order.getCptDescription();
            data[row][3] = order.getOriginalPrice();
            int price = Integer.parseInt(order.getOriginalPrice());
            if (order.getContractStatus().equalsIgnoreCase("Y")) {
                data[row][3] = order.getContractPrice();
                price = Integer.parseInt(order.getContractPrice());
            }
            data[row][4] = String.valueOf(order.getDispenseQuantity());
            data[row][5] = order.getTotalAmount();
            row++;

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
        return false;
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    private boolean DEBUG = false;

    public void setValueAt(Object value, int row, int col) {

        data[row][col] = value;
        fireTableCellUpdated(row, col);
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
