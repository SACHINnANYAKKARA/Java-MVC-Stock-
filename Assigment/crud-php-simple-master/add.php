<html>
<head>
	<title>Add Data</title>
</head>

<body>
<?php
//including the database connection file
include_once("config.php");

if(isset($_POST['Submit'])) {	
	$Title = mysqli_real_escape_string($mysqli, $_POST['Title']);
	$Author = mysqli_real_escape_string($mysqli, $_POST['Author']);
	$PublishAt = mysqli_real_escape_string($mysqli, $_POST['PublishAt']);
		
	// checking empty fields
	if(empty($Title) || empty($Author) || empty($PublishAt)) {
				
		if(empty($Title)) {
			echo "<font color='red'>Name field is empty.</font><br/>";
		}
		
		if(empty($Author)) {
			echo "<font color='red'>Age field is empty.</font><br/>";
		}
		
		if(empty($PublishAt)) {
			echo "<font color='red'>Email field is empty.</font><br/>";
		}
		
		//link to the previous page
		echo "<br/><a href='javascript:self.history.back();'>Go Back</a>";
	} else { 
		// if all the fields are filled (not empty) 
			
		//insert data to database	
		$result = mysqli_query($mysqli, "INSERT INTO users1(Title,Author,PublishAt) VALUES('$Title','$Author','$PublishAt')");
		
		//display success message
		echo "<font color='green'>Data added successfully.";
		echo "<br/><a href='index.php'>View Result</a>";
	}
}
?>
</body>
</html>
