<!DOCTYPE html>
<html>
  <head>
    <style>
      /* Add some styling to the page */
      body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        text-align: center;
      }

      .form-container {
        width: 500px;
        margin: 100px auto;
        background-color: #fff;
        padding: 30px;
        box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.2);
      }

      h1 {
        margin-bottom: 30px;
      }

      input[type="text"],
      input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 16px;
      }

      input[type="submit"] {
        width: 20%;
        padding: 10px;
        background-color: #5adbb5;
        color: Black;
        border: 1;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
      }

      .error {
        color: red;
        font-size: 12px;
        margin-bottom: 20px;
      }
      
      div {
      	background-color: #5adbb5;
      	display:inline-block;
      	
      }
      
    </style>
  </head>
  <body>
    <div class="form-container">
      <h1>Calculate</h1>
      <form action="Calculate">

		<input type="text" pattern="[0-9]+" title="Enter Numerals Only" name = "val1">
		<input type="text" pattern="[0-9]+" title="Enter Numerals Only" name = "val2"><br>
		<span >
			<input type="submit" name = "add" value="+">
			<input type="submit" name = "difference" value="-">
			<input type="submit" name = "multiply" value="X">
			<input type="submit" name = "divide" value="÷">
		</span>

</form>
    </div>
  </body>
</html>
