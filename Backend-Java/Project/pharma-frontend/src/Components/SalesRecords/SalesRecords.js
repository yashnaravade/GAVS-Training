import React from 'react';
import './SalesRecord.css';

const SalesRecords = () => {
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
          {/* Add sales records data rows here */}
        </tbody>
      </table>
    </div>
  );
};

export default SalesRecords;
