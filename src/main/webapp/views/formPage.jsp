<html>
<head>
<title>formpage</title>
</head>
<body>
<div align="center">
<h1>User Form Page</h1>
<form action="save" method="post">
    Dist: <label for="dropdown">Select a Dist:</label>
    <select id="dropdown" name="Dist">
        <option value="apple">Kendrapara</option>
        <option value="banana">Jajpur</option>
        <option value="cherry">Khorda</option>
        <option value="grape">Cuttack</option>
        <option value="orange">Jagatsingpur</option>
    </select>
    Email:<label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br><br>
    <input type="submit" value="Submit">
</form>
</div>
</body>
</html>