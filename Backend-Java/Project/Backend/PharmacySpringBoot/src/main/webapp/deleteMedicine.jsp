<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Medicine</title>
    <script>
        function deleteMedicine() {
            var id = document.getElementById("id").value;
            var form = document.getElementById("deleteForm");
            form.action = "/medicines/delete/" + id;
            form.submit();
        }
    </script>
</head>
<body>
    <h1>Delete Medicine</h1>
    <form id="deleteForm" method="post">
        Medicine ID: <input type="text" id="id" name="id">
        <input type="button" value="Delete" onclick="deleteMedicine();">
    </form>
</body>
</html>
