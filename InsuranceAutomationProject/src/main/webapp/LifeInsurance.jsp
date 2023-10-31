<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Policy Information</title>
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: center;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>Plan Options</th>
        <th>Premium Payment Term</th>
        <th>Policy Term</th>
        <th>Minimum Policy Term</th>
        <th>Maximum Policy Term</th>
    </tr>
    <tr>
        <td rowspan="3">1, 2, 3, 6 & 7</td>
        <td>Single Pay</td>
        <td rowspan="3">5 years</td>
        <td rowspan="3">55 years</td>
        <td>5 years</td>
    </tr>
    <tr>
        <td>Limited Pay</td>
        <td>(PPT + 5) years</td>
        <td>10 years</td>
    </tr>
    <tr>
        <td>Regular Pay</td>
        <td>10 years</td>
    </tr>
    <tr>
        <td>4, 5</td>
        <td>Single Pay</td>
        <td>100 minus Entry Age</td>
        <td>5 Pay</td>
    </tr>
    <tr>
        <td>8</td>
        <td>Single Pay</td>
        <td>1 year</td>
        <td>4 years</td>
    </tr>
    <tr>
        <td>9</td>
        <td>Single Pay</td>
        <td>70 minus Entry Age</td>
        <td>55 years</td>
        <td>Limited Pay</td>
    </tr>
    <tr>
        <td>10</td>
        <td>Regular Pay</td>
        <td>10 years</td>
        <td>55 years</td>
        <td></td>
    </tr>
</table>

</body>
</html>
