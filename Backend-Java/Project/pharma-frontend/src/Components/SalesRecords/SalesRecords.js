import React from 'react';
import './SalesRecord.css';

const SalesRecords = () => {
  const dummySalesData = [
    { date: '2023-10-01', medicineName: 'Dolo-650', quantitySold: 80085 },
    { date: '2023-10-02', medicineName: 'Combiflame', quantitySold: 420 },
    { date: '2023-10-03', medicineName: 'Insulin shots', quantitySold: 69 },
    // Add more dummy sales data as needed
  ];

  return (
    <div className="sales-records">
      <h2>Sales Records</h2>
      <table>
        <thead>
          <tr>
            <th>Date</th>
            <th>Medicine Name</th>
            <th>Quantity Sold</th>
            {/* Add more table headings as needed */}
          </tr>
        </thead>
        <tbody>
          {dummySalesData.map((record, index) => (
            <tr key={index}>
              <td>{record.date}</td>
              <td>{record.medicineName}</td>
              <td>{record.quantitySold}</td>
              {/* Add more table data cells as needed */}
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default SalesRecords;
