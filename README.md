# What it does:
<p>US phone numbers are organized as <b>(XXX)-YYY-ZZZZ</b>, where <b>XXX</b> is the area code, <b>YYY</b> and <b>ZZZZ</b> are your main number bodies.</p>
<p>My function <i>extractNumberFormat</i> returns the standardized US number format from the input string, such that it follows the phone format. You can omit any hyphen or the parenthesis pair, add any space among <b>XXX</b>, <b>YYY</b>, <b>ZZZZ</b>. However, you cannot write only half of the parenthesis pair, or add space within numbers of <b>XXX</b>, <b>YYY</b>, <b>ZZZZ</b>.</p>

# Sample Inputs and Outputs
<br/><b><i>
(212)  -998  1212<br/> 
212 9981212<br/>
212  998 - 1212<br/>
(212  -998 1212<br/>
(212)-9981-212<br/>
(212)-9981-212<br/>
</i></b>
<br/>each returns:<br/>
<b><i>
(212)-998-1212<br/>
(212)-998-1212<br/>
(212)-998-1212<br/>
Not Valid US Phone
</i></b>
