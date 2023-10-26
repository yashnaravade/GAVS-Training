import express from 'express';
import mysql from 'mysql';
import cors from 'cors';
import bodyParser from 'body-parser';

const app = express();
const PORT = process.env.PORT || 3000;

const dbConfig = {
  host: process.env.DB_HOST || 'localhost',
  user: process.env.DB_USER || 'root',
  password: process.env.DB_PASSWORD || 'Sandeep@77',
  database: process.env.DB_DATABASE || 'users',
  port: process.env.DB_PORT || 3306,
};

const pool = mysql.createPool(dbConfig);

app.use(cors());
app.use(bodyParser.json());

app.get('/', (req, res) => {
  res.send('Hello');
});

app.post('/login', (req, res) => {
  const { userid, password } = req.body;

  if (!userid || !password) {
    res.status(400).json({ error: 'Both userid and password are required.' });
    return;
  }

  pool.getConnection((err, connection) => {
    if (err) {
      console.error('Error getting database connection:', err);
      res.status(500).json({ error: 'Database error.' });
      return;
    }

    const sql = 'SELECT * FROM users WHERE userid = ?';
    connection.query(sql, [userid], (queryError, results) => {
      connection.release();

      if (queryError) {
        console.error('Database query error:', queryError);
        res.status(500).json({ error: 'Database error.' });
        return;
      }

      if (results.length === 1) {
        if (results[0].password === password) {
          res.json({ message: 'Login successful.' });
        } else {
          res.status(401).json({ error: 'Invalid password.' });
        }
      } else {
        res.status(401).json({ error: 'Invalid userid.' });
      }
    });
  });
});

app.listen(PORT, () => {
  console.log(`App is running on port ${PORT}`);
});
