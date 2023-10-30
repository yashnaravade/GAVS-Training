<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter Medicine ID</title>
    <script>
        function updateFormAction() {
            var id = document.getElementById("id").value;
            var form = document.getElementById("medicineForm");
            form.action = "/medicineid/" + id;
        }
    </script>
</head>
<body>
    <h1>Enter Medicine ID</h1>
    <form id="medicineForm" method="post">
        Medicine ID: <input type="text" id="id" name="id">
        <input type="button" value="Submit" onclick="updateFormAction(); form.submit();">
    </form>
</body>
</html>
